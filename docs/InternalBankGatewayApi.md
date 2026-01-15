# InternalBankGatewayApi

All URIs are relative to *https://api.dev.cobo.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**bankPayoutRetry**](InternalBankGatewayApi.md#bankPayoutRetry) | **POST** /internal/bank_gateway/payouts/{payout_id}/retry | Retry a payout |
| [**createBankPayout**](InternalBankGatewayApi.md#createBankPayout) | **POST** /internal/bank_gateway/payouts | Create a payout |
| [**getBankAccountBalance**](InternalBankGatewayApi.md#getBankAccountBalance) | **GET** /internal/bank_gateway/balance | Get bank account balance |
| [**getBankPayoutDetail**](InternalBankGatewayApi.md#getBankPayoutDetail) | **GET** /internal/bank_gateway/payouts/{payout_id} | Get payout details |
| [**listBankAwaitingSignaturePayouts**](InternalBankGatewayApi.md#listBankAwaitingSignaturePayouts) | **GET** /internal/bank_gateway/payouts/awaiting_signature | Get awaiting signature payouts |
| [**listBankReturnedPayouts**](InternalBankGatewayApi.md#listBankReturnedPayouts) | **GET** /internal/bank_gateway/payouts/returned | Get returned payouts |
| [**listBankTransactions**](InternalBankGatewayApi.md#listBankTransactions) | **GET** /internal/bank_gateway/transactions | Get payouts list |
| [**submitBankPayoutSignature**](InternalBankGatewayApi.md#submitBankPayoutSignature) | **POST** /internal/bank_gateway/payouts/{payout_id}/signature | Submit a payout signature |


<a id="bankPayoutRetry"></a>
# **bankPayoutRetry**
> Object bankPayoutRetry(payoutId)

Retry a payout

This operation allows the signer to retry a payout. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.InternalBankGatewayApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    InternalBankGatewayApi apiInstance = new InternalBankGatewayApi();
    String payoutId = "payout_123456";
    try {
      Object result = apiInstance.bankPayoutRetry(payoutId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternalBankGatewayApi#bankPayoutRetry");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **payoutId** | **String**| The payout ID. | |

### Return type

**Object**

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successfully retried the payout |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="createBankPayout"></a>
# **createBankPayout**
> CreateBankPayout201Response createBankPayout(createBankPayoutRequest)

Create a payout

This operation creates a payout. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.InternalBankGatewayApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    InternalBankGatewayApi apiInstance = new InternalBankGatewayApi();
    CreateBankPayoutRequest createBankPayoutRequest = new CreateBankPayoutRequest();
    try {
      CreateBankPayout201Response result = apiInstance.createBankPayout(createBankPayoutRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternalBankGatewayApi#createBankPayout");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createBankPayoutRequest** | [**CreateBankPayoutRequest**](CreateBankPayoutRequest.md)| The request body to create a payout | [optional] |

### Return type

[**CreateBankPayout201Response**](CreateBankPayout201Response.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successfully created a payout |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="getBankAccountBalance"></a>
# **getBankAccountBalance**
> List&lt;GetBankAccountBalance200ResponseInner&gt; getBankAccountBalance(bankProvider, accountNo)

Get bank account balance

This operation retrieves the balance of a specified bank account. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.InternalBankGatewayApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    InternalBankGatewayApi apiInstance = new InternalBankGatewayApi();
    BankProvider bankProvider = BankProvider.fromValue("SGB");
    String accountNo = "1234567890";
    try {
      List<GetBankAccountBalance200ResponseInner> result = apiInstance.getBankAccountBalance(bankProvider, accountNo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternalBankGatewayApi#getBankAccountBalance");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **bankProvider** | [**BankProvider**](.md)| The bank provider. | [enum: SGB] |
| **accountNo** | **String**| The account number. | |

### Return type

[**List&lt;GetBankAccountBalance200ResponseInner&gt;**](GetBankAccountBalance200ResponseInner.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved the balance details |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="getBankPayoutDetail"></a>
# **getBankPayoutDetail**
> BankPayout getBankPayoutDetail(payoutId)

Get payout details

This operation retrieves the detailed information about a specified payout. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.InternalBankGatewayApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    InternalBankGatewayApi apiInstance = new InternalBankGatewayApi();
    String payoutId = "payout_123456";
    try {
      BankPayout result = apiInstance.getBankPayoutDetail(payoutId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternalBankGatewayApi#getBankPayoutDetail");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **payoutId** | **String**| The payout ID. | |

### Return type

[**BankPayout**](BankPayout.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved the payout details |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="listBankAwaitingSignaturePayouts"></a>
# **listBankAwaitingSignaturePayouts**
> List&lt;ListBankAwaitingSignaturePayouts200ResponseInner&gt; listBankAwaitingSignaturePayouts()

Get awaiting signature payouts

This operation retrieves the list of payouts that are awaiting signature. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.InternalBankGatewayApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    InternalBankGatewayApi apiInstance = new InternalBankGatewayApi();
    try {
      List<ListBankAwaitingSignaturePayouts200ResponseInner> result = apiInstance.listBankAwaitingSignaturePayouts();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternalBankGatewayApi#listBankAwaitingSignaturePayouts");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;ListBankAwaitingSignaturePayouts200ResponseInner&gt;**](ListBankAwaitingSignaturePayouts200ResponseInner.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved the list of requests awaiting signature |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="listBankReturnedPayouts"></a>
# **listBankReturnedPayouts**
> ListBankReturnedPayouts200Response listBankReturnedPayouts()

Get returned payouts

This operation retrieves the list of payouts that are returned. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.InternalBankGatewayApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    InternalBankGatewayApi apiInstance = new InternalBankGatewayApi();
    try {
      ListBankReturnedPayouts200Response result = apiInstance.listBankReturnedPayouts();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternalBankGatewayApi#listBankReturnedPayouts");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListBankReturnedPayouts200Response**](ListBankReturnedPayouts200Response.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved the list of returned payouts |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="listBankTransactions"></a>
# **listBankTransactions**
> ListBankTransactions200Response listBankTransactions(accountNo, limit, before, after, currency, startTime, endTime, status, transferType)

Get payouts list

This operation retrieves the list of transactions. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.InternalBankGatewayApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    InternalBankGatewayApi apiInstance = new InternalBankGatewayApi();
    String accountNo = "1234567890";
    Integer limit = 10;
    String before = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGmk1";
    String after = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk";
    String currency = "USD";
    String startTime = "1744689600";
    String endTime = "1744689600";
    BankPayoutStatus status = BankPayoutStatus.fromValue("Created");
    BankTransferType transferType = BankTransferType.fromValue("Payin");
    try {
      ListBankTransactions200Response result = apiInstance.listBankTransactions(accountNo, limit, before, after, currency, startTime, endTime, status, transferType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternalBankGatewayApi#listBankTransactions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **accountNo** | **String**| The account number. | |
| **limit** | **Integer**| The maximum number of objects to return. For most operations, the value range is [1, 50]. | [optional] [default to 10] |
| **before** | **String**| This parameter specifies an object ID as a starting point for pagination, retrieving data before the specified object relative to the current dataset.    Suppose the current data is ordered as Object A, Object B, and Object C.  If you set &#x60;before&#x60; to the ID of Object C (&#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk&#x60;), the response will include Object B and Object A.    **Notes**:   - If you set both &#x60;after&#x60; and &#x60;before&#x60;, an error will occur. - If you leave both &#x60;before&#x60; and &#x60;after&#x60; empty, the first page of data is returned. - If you set it to &#x60;infinity&#x60;, the last page of data is returned.  | [optional] |
| **after** | **String**| This parameter specifies an object ID as a starting point for pagination, retrieving data after the specified object relative to the current dataset.    Suppose the current data is ordered as Object A, Object B, and Object C. If you set &#x60;after&#x60; to the ID of Object A (&#x60;RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk&#x60;), the response will include Object B and Object C.    **Notes**:   - If you set both &#x60;after&#x60; and &#x60;before&#x60;, an error will occur. - If you leave both &#x60;before&#x60; and &#x60;after&#x60; empty, the first page of data is returned.  | [optional] |
| **currency** | **String**| The currency. | [optional] |
| **startTime** | **String**| The start time. | [optional] |
| **endTime** | **String**| The end time. | [optional] |
| **status** | [**BankPayoutStatus**](.md)| The status of the payout. | [optional] [enum: Created, PendingRiskCheck, RiskRejected, PendingApproval, Approved, Signing, BankSent, BankProcessing, Success, Failed, RefundProcessing, Refunded] |
| **transferType** | [**BankTransferType**](.md)| The transfer type of the transaction. | [optional] [enum: Payin, Payout] |

### Return type

[**ListBankTransactions200Response**](ListBankTransactions200Response.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved the list of payouts |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="submitBankPayoutSignature"></a>
# **submitBankPayoutSignature**
> Object submitBankPayoutSignature(payoutId, submitBankPayoutSignatureRequest)

Submit a payout signature

This operation allows the signer to submit the signature for a payout. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.InternalBankGatewayApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    InternalBankGatewayApi apiInstance = new InternalBankGatewayApi();
    String payoutId = "payout_123456";
    SubmitBankPayoutSignatureRequest submitBankPayoutSignatureRequest = new SubmitBankPayoutSignatureRequest();
    try {
      Object result = apiInstance.submitBankPayoutSignature(payoutId, submitBankPayoutSignatureRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternalBankGatewayApi#submitBankPayoutSignature");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **payoutId** | **String**| The payout ID. | |
| **submitBankPayoutSignatureRequest** | [**SubmitBankPayoutSignatureRequest**](SubmitBankPayoutSignatureRequest.md)| The request body to submit payout signature | [optional] |

### Return type

**Object**

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successfully submitted the payout signature |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

