package com.ex.api.client.future;

import com.ex.api.dto.CommonResponse;
import com.ex.api.dto.future.FuturePostOrderRequest;


import java.util.List;
import java.util.Map;


/**
 * @create 2023/9/20 11:48
 */
public interface FutureApiClient {


    CommonResponse postOrder(FuturePostOrderRequest request);

    CommonResponse batchOrder(List<FuturePostOrderRequest> futurePostOrderRequestList);


    CommonResponse orderListHistory(Map<String, String> params);

    CommonResponse orderTradeList(Map<String, String> params);

    CommonResponse orderDetail(Long orderId);

    CommonResponse orderList(Map<String, String> params);

    CommonResponse orderCancel(Long orderId);

    CommonResponse allCancel(String symbol);

    CommonResponse entrustCreatePlan(Map<String, String> params);

    CommonResponse entrustCancelPlan(Long entrustId);

    CommonResponse entrustCancelAllPlan(String symbol);



    CommonResponse accountInfo();

    CommonResponse balanceDetail(String coin);
}
