package com.ex.api.client.spot;

import com.ex.api.dto.CommonResponse;
import com.ex.api.dto.spot.OpenOrderCancelRequest;
import com.ex.api.dto.spot.SpotPostBatchCancelOrdersRequest;
import com.ex.api.dto.spot.SpotPostBatchOrdersRequest;
import com.ex.api.dto.spot.SpotPostOrderRequest;
import retrofit2.http.Query;

import java.util.List;


/**
 * @create 2023/9/20 11:48
 */
public interface SpotApiClient {


    CommonResponse postOrder(SpotPostOrderRequest request);


    CommonResponse batchOrders(SpotPostBatchOrdersRequest request);


    CommonResponse batchCancelOrders(SpotPostBatchCancelOrdersRequest request);

    CommonResponse getOrder(Long id);

    CommonResponse queryOrder(Long orderId);

    CommonResponse openOrder(String symbol,Integer limit);

    CommonResponse deleteOpenOrder(OpenOrderCancelRequest request);

    CommonResponse delOrder(Long id);


    CommonResponse getBalance(String currency);


    CommonResponse getBalances(List<String> currencies, Long queryAccountId,boolean filterIsDisplayFalse);


    CommonResponse getTrade(String symbol);
    CommonResponse getTicker(String symbol);
}
