@secure()
param dbUser string
param name string
param location string

resource storageAccount 'Microsoft.Storage/storageAccounts@2023-05-01' = {
  name: '${dbUser}blob'
  location: location
  kind: 'StorageV2'
  sku: {
    name: 'Standard_ZRS'
  }
  properties: {
    accessTier: 'Hot'
    allowBlobPublicAccess: true
    publicNetworkAccess: 'Enabled'
  }
}


resource blobServices 'Microsoft.Storage/storageAccounts/blobServices@2023-05-01' = {
  name: 'default'
  parent: storageAccount
  resource container 'containers' = {
    name: 'images'
    properties: {
      publicAccess: 'Blob'
    }
  }
}

output storageAccountId string = storageAccount.id
