param appName string
param location string

param storageAccountId string

param mysqlServerName string
param privateDnsZoneId string
param mysqlSubnetId string
param backendSubnetId string

@secure()
param jwtSecret string
@secure()
param dbName string
@secure()
param dbUser string
@secure()
param dbPassword string

resource mysqlServer 'Microsoft.DBforMySQL/flexibleServers@2023-12-30' = {
  name: mysqlServerName
  location: location
  sku: {
    name: 'Standard_B1ms'
    tier: 'Burstable'
  }
  properties: {
    administratorLogin: dbUser
    administratorLoginPassword: dbPassword
    version: '8.0.21'
    createMode: 'Default'
    network: {
      delegatedSubnetResourceId: mysqlSubnetId
      privateDnsZoneResourceId: privateDnsZoneId
    }
    storage: {
      storageSizeGB: 32
    }
  }
}

resource database 'Microsoft.DBforMySQL/flexibleServers/databases@2023-12-30' = {
  parent: mysqlServer
  name: dbName
  properties: {
    charset: 'utf8mb4'
    collation: 'utf8mb4_general_ci'
  }
}

resource servicePlan 'Microsoft.Web/serverfarms@2020-12-01' = {
  name: '${appName}-backend-serviceplan'
  location: location
  kind: 'linux'

  sku: {
    name: 'B3'
    capacity: 1
  }
  properties: {
    hyperV: false
    reserved: true
  }
}

resource backendApi 'Microsoft.Web/sites@2022-03-01' = {
  name: '${appName}-backend'
  location: location
  properties: {
    publicNetworkAccess: 'Enabled'
    httpsOnly: true
    serverFarmId: servicePlan.id
    siteConfig: {
      ftpsState: 'FtpsOnly'
      alwaysOn: false
      linuxFxVersion: 'JAVA|17-java17'
      appCommandLine: 'java -jar /home/site/wwwroot/app.jar --server.port=80'
      appSettings: [
        { name: 'DATABASE_URL', value: 'jdbc:mysql://${mysqlServer.name}.mysql.database.azure.com:3306' }
        { name: 'DATABASE_USERNAME', value: dbUser }
        { name: 'DATABASE_PASSWORD', value: dbPassword }
        { name: 'DATABASE_SCHEME', value: dbName }
        { name: 'JWT_SECRET', value: jwtSecret }
        { name: 'STORAGE_CONNECTION', value: 'DefaultEndpointsProtocol=https;AccountName=${dbUser}blob;AccountKey=${listKeys(storageAccountId, '2021-04-01').keys[0].value};EndpointSuffix=core.windows.net' }
      ]
    }
  }

  resource webappVnetConfig 'networkConfig' = {
    name: 'virtualNetwork'
    properties: {
      subnetResourceId: backendSubnetId
    }
  }
}
