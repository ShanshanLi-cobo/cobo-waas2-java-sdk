

# BankPayout


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**payoutId** | **String** | The payout ID. |  |
|**status** | **BankPayoutStatus** |  |  |
|**requestId** | **String** | The request ID of the payout. |  |
|**bankProvider** | **BankProvider** |  |  |
|**transactionCurrency** | **String** | The currency of the transaction. |  |
|**transactionAmount** | **String** | The amount of the transaction. |  |
|**feeCurrency** | **String** | The currency of the fee. |  [optional] |
|**feeAmount** | **String** | The amount of the fee. |  [optional] |
|**remarks** | **String** | The remarks of the payout. |  [optional] |
|**payoutType** | **BankPayoutType** |  |  [optional] |
|**sender** | [**BankPayoutSender**](BankPayoutSender.md) |  |  |
|**beneficiary** | [**BankPayoutBeneficiary**](BankPayoutBeneficiary.md) |  |  |
|**createdTimestamp** | **Integer** | The created time of the payout, represented as a UNIX timestamp in seconds. |  [optional] |
|**updatedTimestamp** | **Integer** | The updated time of the payout, represented as a UNIX timestamp in seconds. |  [optional] |



