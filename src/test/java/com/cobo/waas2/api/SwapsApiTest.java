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

import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.CreateSwapActivityRequest;
import com.cobo.waas2.model.CreateSwapQuote201Response;
import com.cobo.waas2.model.CreateSwapQuoteRequest;
import com.cobo.waas2.model.ErrorResponse;
import com.cobo.waas2.model.ListEnableTokenPairs200Response;
import com.cobo.waas2.model.ListSwapActivities200Response;
import com.cobo.waas2.model.SwapActivity;
import com.cobo.waas2.model.SwapQuote;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SwapsApi
 */
@Disabled
public class SwapsApiTest {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // set custom base url
    {
        defaultClient.setBasePath("https://api.sandbox.cobo.com/v2");
        defaultClient.setPrivKey("<YOUR_API_PRIVATE_KEY_IN_HEX>");
    }
    private final SwapsApi api = new SwapsApi();

    /**
     * Create Swap Activity
     *
     * This operation to create a swap activity. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createSwapActivityTest() throws ApiException {
        CreateSwapActivityRequest createSwapActivityRequest = null;
        SwapActivity response = api.createSwapActivity(createSwapActivityRequest);
        // TODO: test validations
    }

    /**
     * Create Swap Quote
     *
     * This operation retrieves a quote for swapping between two tokens. Either pay_amount or receive_amount must be provided. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createSwapQuoteTest() throws ApiException {
        CreateSwapQuoteRequest createSwapQuoteRequest = null;
        CreateSwapQuote201Response response = api.createSwapQuote(createSwapQuoteRequest);
        // TODO: test validations
    }

    /**
     * Get Swap Activity Details
     *
     * This operation retrieves the details of a swap activity. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSwapActivityTest() throws ApiException {
        String activityId = null;
        SwapActivity response = api.getSwapActivity(activityId);
        // TODO: test validations
    }

    /**
     * Get Current Swap Rate
     *
     * This operation retrieves the current market exchange rate and estimated amount for swapping between two tokens. Either pay_amount or receive_amount must be provided. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSwapQuoteTest() throws ApiException {
        UUID walletId = null;
        String payTokenId = null;
        String receiveTokenId = null;
        String payAmount = null;
        String receiveAmount = null;
        SwapQuote response = api.getSwapQuote(walletId, payTokenId, receiveTokenId, payAmount, receiveAmount);
        // TODO: test validations
    }

    /**
     * List Supported Token Pairs
     *
     * This operation retrieves all supported token pairs for swaps in a specified wallet. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listEnableTokenPairsTest() throws ApiException {
        Integer limit = null;
        String before = null;
        String after = null;
        ListEnableTokenPairs200Response response = api.listEnableTokenPairs(limit, before, after);
        // TODO: test validations
    }

    /**
     * List Swap Activities
     *
     * This operation retrieves a list of swap activities. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listSwapActivitiesTest() throws ApiException {
        String status = null;
        Long minUpdatedTimestamp = null;
        Long maxUpdatedTimestamp = null;
        String initiator = null;
        Integer limit = null;
        String before = null;
        String after = null;
        String sortBy = null;
        String direction = null;
        ListSwapActivities200Response response = api.listSwapActivities(status, minUpdatedTimestamp, maxUpdatedTimestamp, initiator, limit, before, after, sortBy, direction);
        // TODO: test validations
    }

}
