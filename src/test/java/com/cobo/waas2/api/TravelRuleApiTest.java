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
import com.cobo.waas2.model.ErrorResponse;
import com.cobo.waas2.model.GetTransactionLimitation200Response;
import com.cobo.waas2.model.ListSupportedCountries200ResponseInner;
import com.cobo.waas2.model.SubmitDepositTravelRuleInfo201Response;
import com.cobo.waas2.model.TravelRuleDepositRequest;
import com.cobo.waas2.model.TravelRuleWithdrawRequest;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TravelRuleApi
 */
@Disabled
public class TravelRuleApiTest {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // set custom base url
    {
        defaultClient.setBasePath("https://api.sandbox.cobo.com/v2");
        defaultClient.setPrivKey("<YOUR_API_PRIVATE_KEY_IN_HEX>");
    }
    private final TravelRuleApi api = new TravelRuleApi();

    /**
     * Retrieve transaction limitations
     *
     * This endpoint retrieves transaction-related limitations based on the provided &#x60;transaction_type&#x60; and &#x60;transaction_id&#x60;.  The response includes the following information: - **&#x60;vasp_list&#x60;**: A list of Virtual Asset Service Providers (VASPs) associated with the transaction token. - **&#x60;is_threshold_reached&#x60;**: Indicates whether the transaction amount has exceeded the predefined threshold.    - If &#x60;true&#x60;: Additional Travel Rule information may be required for processing. - **&#x60;self_custody_wallet_challenge&#x60;**: A challenge string for verifying ownership of self-custody wallets. - **&#x60;connect_wallet_list&#x60;**: A list of supported wallet integrations for the transaction, such as MetaMask or WalletConnect.  Use this endpoint to ensure compliance with Travel Rule requirements and to retrieve supported options for completing the transaction. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTransactionLimitationTest() throws ApiException {
        String transactionType = null;
        UUID transactionId = null;
        GetTransactionLimitation200Response response = api.getTransactionLimitation(transactionType, transactionId);
        // TODO: test validations
    }

    /**
     * List supported countries
     *
     * This operation retrieves all countries supported.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listSupportedCountriesTest() throws ApiException {
        List<ListSupportedCountries200ResponseInner> response = api.listSupportedCountries();
        // TODO: test validations
    }

    /**
     * Submit Deposit Transaction Travel Rule information
     *
     * This operation allows you to submit the required Travel Rule information based on the transaction details. It supports both self-custody wallets and exchanges/VASPs, ensuring compliance with Travel Rule requirements.   - **Destination Wallet Type (&#x60;destination_wallet_type&#x60;)**:   - &#x60;SELF_CUSTODY_WALLET&#x60;: A self-custodial wallet (e.g., plugin wallet). Requires &#x60;self_custody_wallet_sign&#x60;, &#x60;self_custody_wallet_address&#x60;, and &#x60;self_custody_wallet_challenge&#x60;.   - &#x60;EXCHANGES_OR_VASP&#x60;: A wallet associated with an exchange or VASP. Requires &#x60;vendor_vasp_id&#x60; and information depending on &#x60;selected_entity_type&#x60;.  - **Entity Types (&#x60;selected_entity_type&#x60;)**:   - &#x60;LEGAL&#x60;: For legal entities, provide &#x60;legal_name&#x60;, &#x60;date_of_incorporation&#x60;, and &#x60;place_of_incorporation&#x60;.   - &#x60;NATURAL&#x60;: For natural persons, provide &#x60;date_of_birth&#x60;, &#x60;place_of_birth&#x60;, &#x60;first_name&#x60;, and &#x60;last_name&#x60;. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void submitDepositTravelRuleInfoTest() throws ApiException {
        TravelRuleDepositRequest travelRuleDepositRequest = null;
        SubmitDepositTravelRuleInfo201Response response = api.submitDepositTravelRuleInfo(travelRuleDepositRequest);
        // TODO: test validations
    }

    /**
     * Submit Withdraw Transaction Travel Rule information
     *
     * This operation allows you to submit the required Travel Rule information based on the transaction details. It supports both self-custody wallets and exchanges/VASPs, ensuring compliance with Travel Rule requirements.   - **Destination Wallet Type (&#x60;destination_wallet_type&#x60;)**:   - &#x60;SELF_CUSTODY_WALLET&#x60;: A self-custodial wallet (e.g., plugin wallet). Requires &#x60;self_custody_wallet_sign&#x60;, &#x60;self_custody_wallet_address&#x60;, and &#x60;self_custody_wallet_challenge&#x60;.   - &#x60;EXCHANGES_OR_VASP&#x60;: A wallet associated with an exchange or VASP. Requires &#x60;vendor_vasp_id&#x60; and information depending on &#x60;selected_entity_type&#x60;.  - **Entity Types (&#x60;selected_entity_type&#x60;)**:   - &#x60;LEGAL&#x60;: For legal entities, provide &#x60;legal_name&#x60;.   - &#x60;NATURAL&#x60;: For natural persons, provide &#x60;date_of_birth&#x60;, &#x60;place_of_birth&#x60;, &#x60;first_name&#x60;, and &#x60;last_name&#x60;. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void submitWithdrawTravelRuleInfoTest() throws ApiException {
        TravelRuleWithdrawRequest travelRuleWithdrawRequest = null;
        SubmitDepositTravelRuleInfo201Response response = api.submitWithdrawTravelRuleInfo(travelRuleWithdrawRequest);
        // TODO: test validations
    }

}
