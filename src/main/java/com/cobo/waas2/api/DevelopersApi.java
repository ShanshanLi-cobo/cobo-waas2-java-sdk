/*
 * Cobo Wallet as a Service 2.0
 *
 * Contact: help@cobo.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cobo.waas2.api;

import com.cobo.waas2.ApiCallback;
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.ApiResponse;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.Pair;
import com.cobo.waas2.ProgressRequestBody;
import com.cobo.waas2.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.cobo.waas2.model.ErrorResponse;
import com.cobo.waas2.model.GetApiKeyInfo200Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DevelopersApi {
    private ApiClient localVarApiClient;

    public DevelopersApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DevelopersApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getApiKeyInfo
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The API key information. </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Bad request. Your request contains malformed syntax or invalid parameters. </td><td>  -  </td></tr>
        <tr><td> 5XX </td><td> Internal server error. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getApiKeyInfoCall(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/developers/api_key_info";

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();
        Map<String, String> localVarHeaderParams = new HashMap<>();
        Map<String, String> localVarCookieParams = new HashMap<>();
        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {};
        return localVarApiClient.buildCall(null, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getApiKeyInfoValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return getApiKeyInfoCall(_callback);

    }

    /**
     * Get API key information
     * This operation retrieves the details of the API key that you are using.
     * @return GetApiKeyInfo200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The API key information. </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Bad request. Your request contains malformed syntax or invalid parameters. </td><td>  -  </td></tr>
        <tr><td> 5XX </td><td> Internal server error. </td><td>  -  </td></tr>
     </table>
     */
    public GetApiKeyInfo200Response getApiKeyInfo() throws ApiException {
        ApiResponse<GetApiKeyInfo200Response> localVarResp = getApiKeyInfoWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Get API key information
     * This operation retrieves the details of the API key that you are using.
     * @return ApiResponse&lt;GetApiKeyInfo200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The API key information. </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Bad request. Your request contains malformed syntax or invalid parameters. </td><td>  -  </td></tr>
        <tr><td> 5XX </td><td> Internal server error. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GetApiKeyInfo200Response> getApiKeyInfoWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getApiKeyInfoValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<GetApiKeyInfo200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get API key information (asynchronously)
     * This operation retrieves the details of the API key that you are using.
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The API key information. </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Bad request. Your request contains malformed syntax or invalid parameters. </td><td>  -  </td></tr>
        <tr><td> 5XX </td><td> Internal server error. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getApiKeyInfoAsync(final ApiCallback<GetApiKeyInfo200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = getApiKeyInfoValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<GetApiKeyInfo200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
