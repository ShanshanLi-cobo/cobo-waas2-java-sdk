

# PaymentEstimateFeeRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**feeType** | **PaymentFeeType** |  |  [optional] |
|**estimateFees** | [**List&lt;PaymentEstimateFee&gt;**](PaymentEstimateFee.md) | A list of token IDs and amounts for which fees will be calculated. |  |
|**recipientTokenId** | **String** | The token ID that the recipient will receive. Required only when &#x60;fee_type&#x60; is &#x60;CryptoPayoutBridge&#x60;. |  [optional] |



