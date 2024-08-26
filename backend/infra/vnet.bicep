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

output vnetId string = vnet.id
output mysqlSubnetId string = vnet::mysqlSubnet.id
output backendSubnetId string = vnet::backendSubnet.id
