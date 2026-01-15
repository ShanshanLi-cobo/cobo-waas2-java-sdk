

# EstimateBatchPayoutFeeRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tokenId** | **String** | The ID of the cryptocurrency used for payout.  |  |
|**payoutMode** | **PayoutMode** |  |  |
|**loopEnabled** | **Boolean** | Enable loop mode for standard transfers when source is asset wallet. Only applicable when: - &#x60;payout_mode&#x60; is &#x60;Normal&#x60; - &#x60;source_type&#x60; is asset wallet  |  [optional] |
|**source** | [**PayoutSource**](PayoutSource.md) |  |  |
|**destinations** | [**List&lt;PayoutDestination&gt;**](PayoutDestination.md) | The destinations of the payout. |  |
|**rbfType** | **PayoutRbfType** |  |  [optional] |
|**replacedPayoutId** | **String** | The ID of the payout that this payout replaced. |  [optional] |



