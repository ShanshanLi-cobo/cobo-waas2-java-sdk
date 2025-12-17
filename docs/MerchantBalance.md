

# MerchantBalance


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**merchantId** | **String** | The merchant ID. |  |
|**tokenId** | **String** | The token ID, which is a unique identifier that specifies both the blockchain network and cryptocurrency token in the format &#x60;{CHAIN}_{TOKEN}&#x60;. |  |
|**acquiringType** | **AcquiringType** |  |  |
|**totalReceivedAmount** | **String** | The total amount of the token that has been received by the merchant. |  [optional] |
|**settledAmount** | **String** | The total amount of the token that has been paid out from the merchant&#39;s balance. |  [optional] |
|**payoutAmount** | **String** | The merchant payout amount. |  [optional] |
|**refundedAmount** | **String** | The total amount of the token that has been refunded from the merchant&#39;s balance. |  [optional] |
|**totalBalance** | **String** |  The current balance of this token available to the merchant for payouts or refunds.  &#x60;total_balance&#x60; &#x3D; &#x60;total_received_amount&#x60; - &#x60;settled_amount&#x60; - &#x60;refunded_amount&#x60;  For more information, please refer to [Funds allocation and balances](https://www.cobo.com/payments/en/guides/amounts-and-balances)  |  [optional] |
|**availableBalance** | **String** | The merchant available balance. |  [optional] |
|**lockedBalance** | **String** | The merchant locked balance. |  [optional] |



