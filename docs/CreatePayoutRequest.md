

# CreatePayoutRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**requestId** | **String** | The request ID that is used to track a payout request. The request ID is provided by you and must be unique. |  |
|**sourceAccount** | **String** | required |  [optional] |
|**payoutChannel** | **PayoutChannel** |  |  |
|**payoutParams** | [**List&lt;PaymentPayoutParam&gt;**](PaymentPayoutParam.md) |  |  |
|**recipientInfo** | [**PaymentPayoutRecipientInfo**](PaymentPayoutRecipientInfo.md) |  |  [optional] |
|**remark** | **String** | The remark for the create payouts. |  [optional] |
|**bankAccountId** | **UUID** | ｜ Only used in OffRamp payout channel. The ID of the bank account where the settled funds will be deposited. deprecated |  [optional] |
|**currency** | **String** | The fiat currency for the create payouts. deprecated |  [optional] |



