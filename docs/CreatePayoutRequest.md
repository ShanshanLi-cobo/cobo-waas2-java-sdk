

# CreatePayoutRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**requestId** | **String** | The request ID that is used to track a payout request. The request ID is provided by you and must be unique. |  |
|**payoutChannel** | **PayoutChannel** |  |  |
|**payoutParams** | [**List&lt;PaymentPayoutParam&gt;**](PaymentPayoutParam.md) |  |  |
|**bankAccountId** | **UUID** | The ID of the bank account where the funds will be deposited. Specify this field when &#x60;payout_channel&#x60; is set to &#x60;OffRamp&#x60;.  You can call [List all bank accounts](https://www.cobo.com/payments/en/api-references/payment/list-all-bank-accounts) to retrieve the IDs of registered bank accounts. To add a new bank account, refer to [Destinations](https://www.cobo.com/payments/en/guides/destinations).  |  [optional] |
|**currency** | **String** | The fiat currency you will receive from the payout. - Required when &#x60;payout_channel&#x60; is set to &#x60;OffRamp&#x60;. - Currently, only &#x60;USD&#x60; is supported.  |  [optional] |
|**remark** | **String** | The remark for the payout. |  [optional] |



