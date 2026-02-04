

# SupportedToken


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tokenId** | **String** | The unique identifier of the token, in the format of &#x60;{chain_id}_{token_symbol}&#x60;. |  |
|**name** | **String** | The full name of the token. |  |
|**symbol** | **String** | The symbol of the token. |  |
|**decimal** | **Integer** | The number of decimal places for the token. This value is used to convert  between the token&#39;s smallest unit and its display value.  |  |
|**tokenAddress** | **String** | The contract address of the token. This is &#x60;null&#x60; for native coins (e.g., ETH on Ethereum).  |  |
|**chainId** | **String** | The ID of the chain on which the token exists. |  |
|**chainSymbol** | **String** | The symbol of the chain on which the token exists. |  |
|**chainIconUrl** | **String** | The URL of the chain icon image. |  [optional] |
|**tokenIconUrl** | **String** | The URL of the token icon image. |  [optional] |
|**canOffRamp** | **Boolean** | Whether the token supports fiat off-ramp. - &#x60;true&#x60;: The token can be used for fiat off-ramp. - &#x60;false&#x60;: The token cannot be used for fiat off-ramp.  |  [optional] |



