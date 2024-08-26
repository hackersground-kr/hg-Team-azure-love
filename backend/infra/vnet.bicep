param mysqlServerName string
param appName string
param location string


resource vnet 'Microsoft.Network/virtualNetworks@2022-07-01' = {
  name: '${appName}-vnet'
  location: location
  properties: {
    addressSpace: {
      addressPrefixes: [
        '10.0.0.0/16'
      ]
    }
  }

  resource mysqlSubnet 'subnets' = {
    name: '${appName}-db-subnet'
    properties: {
      addressPrefix: '10.0.0.0/24'
      delegations: [
        {
          name: '${appName}-db-subnet-delegation'
          properties: {
            serviceName: 'Microsoft.DBforMySQL/flexibleServers'
          }
        }
      ]
    }
  }

  resource backendSubnet 'subnets' = {
    name: '${appName}-backend-subnet'
    properties: {
      addressPrefix: '10.0.1.0/24'
      delegations: [
        {
          name: '${appName}-backend-subnet-delegation'
          properties: {
            serviceName: 'Microsoft.Web/serverfarms'
          }
        }
      ]
    }
  }
}


resource privateDnsZone 'Microsoft.Network/privateDnsZones@2020-06-01' = {
  name: '${mysqlServerName}.private.mysql.database.azure.com'
  dependsOn: [vnet]
  location: 'global'
}

resource vNetLink 'Microsoft.Network/privateDnsZones/virtualNetworkLinks@2020-06-01' = {
  name: '${mysqlServerName}-link'
  location: 'global'
  dependsOn: [vnet, privateDnsZone]
  parent: privateDnsZone
  properties: {
    registrationEnabled: false
    virtualNetwork: {
      id: vnet.id
    }
  }
}

output privateDnsZoneId string = privateDnsZone.id
output mysqlSubnetId string = vnet::mysqlSubnet.id
output backendSubnetId string = vnet::backendSubnet.id
