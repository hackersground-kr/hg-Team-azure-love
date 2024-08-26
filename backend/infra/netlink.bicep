param mysqlServerName string
param vnetId string

resource privateDnsZone 'Microsoft.Network/privateDnsZones@2020-06-01' = {
  name: '${mysqlServerName}.private.mysql.database.azure.com'
  location: 'global'
}

resource vNetLink 'Microsoft.Network/privateDnsZones/virtualNetworkLinks@2020-06-01' = {
  name: '${mysqlServerName}-link'
  location: 'global'
  parent: privateDnsZone
  properties: {
    registrationEnabled: false
    virtualNetwork: {
      id: vnetId
    }
  }
}

output privateDnsZoneId string = privateDnsZone.id
