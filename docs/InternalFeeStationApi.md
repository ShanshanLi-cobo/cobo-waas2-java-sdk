# InternalFeeStationApi

All URIs are relative to *https://api.dev.cobo.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**chargeCommissionFee**](InternalFeeStationApi.md#chargeCommissionFee) | **POST** /internal/fee_station/charge_commission_fee | Charge commission fee |
| [**getFeeStationDetail**](InternalFeeStationApi.md#getFeeStationDetail) | **GET** /internal/fee_station | Get FeeStation Detail |
| [**refundCommissionFee**](InternalFeeStationApi.md#refundCommissionFee) | **POST** /internal/fee_station/refund_commission_fee | Refund commission fee |
| [**updateFeeStationConfig**](InternalFeeStationApi.md#updateFeeStationConfig) | **POST** /internal/fee_station/update_conf | Update FeeStation |


<a id="chargeCommissionFee"></a>
# **chargeCommissionFee**
> ChargeCommissionFee201Response chargeCommissionFee(chargeCommissionFeeRequest)

Charge commission fee

This operation charge commission fee. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.InternalFeeStationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    InternalFeeStationApi apiInstance = new InternalFeeStationApi();
    ChargeCommissionFeeRequest chargeCommissionFeeRequest = new ChargeCommissionFeeRequest();
    try {
      ChargeCommissionFee201Response result = apiInstance.chargeCommissionFee(chargeCommissionFeeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternalFeeStationApi#chargeCommissionFee");
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
| **chargeCommissionFeeRequest** | [**ChargeCommissionFeeRequest**](ChargeCommissionFeeRequest.md)| The request body to charge commission fee | [optional] |

### Return type

[**ChargeCommissionFee201Response**](ChargeCommissionFee201Response.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The request was successful. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="getFeeStationDetail"></a>
# **getFeeStationDetail**
> FeeStationDetail getFeeStationDetail()

Get FeeStation Detail

This operation get fee station detail. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.InternalFeeStationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    InternalFeeStationApi apiInstance = new InternalFeeStationApi();
    try {
      FeeStationDetail result = apiInstance.getFeeStationDetail();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternalFeeStationApi#getFeeStationDetail");
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

[**FeeStationDetail**](FeeStationDetail.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was successful. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="refundCommissionFee"></a>
# **refundCommissionFee**
> RefundCommissionFee201Response refundCommissionFee(refundCommissionFeeRequest)

Refund commission fee

This operation refund commission fee. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.InternalFeeStationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    InternalFeeStationApi apiInstance = new InternalFeeStationApi();
    RefundCommissionFeeRequest refundCommissionFeeRequest = new RefundCommissionFeeRequest();
    try {
      RefundCommissionFee201Response result = apiInstance.refundCommissionFee(refundCommissionFeeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternalFeeStationApi#refundCommissionFee");
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
| **refundCommissionFeeRequest** | [**RefundCommissionFeeRequest**](RefundCommissionFeeRequest.md)| This request supports partial refunds. The refunded amount is accumulated across multiple requests and must not exceed the originally charged amount.  | [optional] |

### Return type

[**RefundCommissionFee201Response**](RefundCommissionFee201Response.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The request was successful. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="updateFeeStationConfig"></a>
# **updateFeeStationConfig**
> updateFeeStationConfig(updateFeeStationConfigRequest)

Update FeeStation

This operation to update fee station config. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.InternalFeeStationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    InternalFeeStationApi apiInstance = new InternalFeeStationApi();
    UpdateFeeStationConfigRequest updateFeeStationConfigRequest = new UpdateFeeStationConfigRequest();
    try {
      apiInstance.updateFeeStationConfig(updateFeeStationConfigRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternalFeeStationApi#updateFeeStationConfig");
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
| **updateFeeStationConfigRequest** | [**UpdateFeeStationConfigRequest**](UpdateFeeStationConfigRequest.md)| The request body to update fee station settings | [optional] |

### Return type

null (empty response body)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

