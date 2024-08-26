param name string
param location string = 'Korea Central'

@secure()
param dbName string
@secure()
param dbUser string
@secure()
param dbPassword string
@secure()
param jwtSecret string

var mysqlServerName = '${name}-mysql'
module vnetSetup 'vnet.bicep' = {
  name: 'vnet'
  scope: resourceGroup()
  params: {
    mysqlServerName: mysqlServerName
    appName: name
    location: location
  }
}

module storageSetup 'storage.bicep' = {
  name: 'storage'
  scope: resourceGroup()
  params: {
    name: name
    dbUser: dbUser
    location: location
  }
}

module nanuriSetup 'setup.bicep' = {
  name: 'nanuri'
  scope: resourceGroup()
  dependsOn: [vnetSetup, storageSetup]
  params: {
    appName: name
    location: location

    jwtSecret: jwtSecret
    storageAccountId: storageSetup.outputs.storageAccountId

    mysqlServerName: mysqlServerName
    privateDnsZoneId: vnetSetup.outputs.privateDnsZoneId
    mysqlSubnetId: vnetSetup.outputs.mysqlSubnetId
    backendSubnetId: vnetSetup.outputs.backendSubnetId

    dbName: dbName
    dbUser: dbUser
    dbPassword: dbPassword
  }
}
