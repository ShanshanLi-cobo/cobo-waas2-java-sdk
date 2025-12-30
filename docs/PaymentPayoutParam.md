

# PaymentPayoutParam


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**sourceAccount** | **String** | The source account from which the payout will be made. - If the source account is a merchant account, provide the merchant&#39;s ID (e.g., \&quot;M1001\&quot;). - If the source account is the developer account, use the string &#x60;\&quot;developer\&quot;&#x60;.  |  |
|**tokenId** | **String** | The ID of the cryptocurrency you want to pay out. Specify this field when &#x60;payout_channel&#x60; is set to &#x60;Crypto&#x60;. Supported values: - USDC: &#x60;ETH_USDC&#x60;, &#x60;ARBITRUM_USDC&#x60;, &#x60;SOL_USDC&#x60;, &#x60;BASE_USDC&#x60;, &#x60;MATIC_USDC&#x60;, &#x60;BSC_USDC&#x60; - USDT: &#x60;TRON_USDT&#x60;, &#x60;ETH_USDT&#x60;, &#x60;ARBITRUM_USDT&#x60;, &#x60;SOL_USDT&#x60;, &#x60;BASE_USDT&#x60;, &#x60;MATIC_USDT&#x60;, &#x60;BSC_USDT&#x60;  |  |
|**amount** | **String** | The amount of the cryptocurrency to pay out.  |  |
|**cryptoAddressId** | **String** | The ID of the crypto address used for crypto payouts. Specify this field when &#x60;payout_channel&#x60; is set to &#x60;Crypto&#x60;.  Call [List crypto addresses](https://www.cobo.com/payments/en/api-references/payment/list-crypto-addresses) to retrieve registered crypto addresses.  |  [optional] |
|**cryptoAddress** | **String** | The actual blockchain address to which funds will be transferred. Specify this field when &#x60;payout_channel&#x60; is set to &#x60;Crypto&#x60;. &lt;Note&gt;   If you have enabled the *Use Destinations as Payout Whitelist* toggle in *Destinations*, you can only transfer to registered destinations. For more details, see [Destinations](https://www.cobo.com/payments/en/guides/destinations). &lt;/Note&gt;  |  [optional] |



