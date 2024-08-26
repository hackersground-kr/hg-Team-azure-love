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

module storageSetup 'storage.bicep' = {
  name: 'storage'
  scope: resourceGroup()
  params: {
    name: name
    dbUser: dbUser
    location: location
  }
}

var mysqlServerName = '${name}-mysql'
module vnetSetup 'vnet.bicep' = {
  name: 'vnet'
  scope: resourceGroup()
  params: {
    appName: name
    location: location
  }
}

module netlink 'netlink.bicep' = {
  name: 'netlink'
  scope: resourceGroup()
  dependsOn: [vnetSetup]
  params: {
    mysqlServerName: mysqlServerName
    vnetId: vnetSetup.outputs.vnetId
  }
}

module nanuriSetup 'setup.bicep' = {
  name: 'nanuri'
  scope: resourceGroup()
  dependsOn: [vnetSetup, storageSetup, netlink]
  params: {
    appName: name
    location: location

    jwtSecret: jwtSecret
    storageAccountId: storageSetup.outputs.storageAccountId

    mysqlServerName: mysqlServerName
    privateDnsZoneId: netlink.outputs.privateDnsZoneId
    mysqlSubnetId: vnetSetup.outputs.mysqlSubnetId
    backendSubnetId: vnetSetup.outputs.backendSubnetId

    dbName: dbName
    dbUser: dbUser
    dbPassword: dbPassword
  }
}
