/*
 * Bybit API
 * ## REST API for the Bybit Exchange. Base URI: [https://api.bybit.com]  
 *
 * OpenAPI spec version: 0.2.10
 * Contact: support@bybit.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LinearExecutionApi
 */
@Ignore
public class LinearExecutionApiTest {

    private final LinearExecutionApi api = new LinearExecutionApi();

    
    /**
     * Get user&#39;s trading records.
     *
     * This will get user&#39;s trading records.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void linearExecutionGetTradesTest() throws ApiException {
        String symbol = null;
        Long startTime = null;
        Long endTime = null;
        String execType = null;
        Long page = null;
        Long limit = null;
        Object response = api.linearExecutionGetTrades(symbol, startTime, endTime, execType, page, limit);

        // TODO: test validations
    }
    
}
