package com.ex.api.client.spot;

import com.ex.api.dto.CommonResponse;
import com.ex.api.dto.spot.OpenOrderCancelRequest;
import com.ex.api.dto.spot.SpotPostBatchCancelOrdersRequest;
import com.ex.api.dto.spot.SpotPostBatchOrdersRequest;
import com.ex.api.dto.spot.SpotPostOrderRequest;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

/**
 * @create 2023/9/20 14:28
 */
public interface SpotApiService {

    @POST("/v1/spot/order")
    Call<CommonResponse> postOrder(@Body SpotPostOrderRequest request);

    @POST("/v1/spot/batch-order")
    Call<CommonResponse> batchOrders(@Body SpotPostBatchOrdersRequest request);

//    @DELETE("/v1/spot/batch-order")
    @HTTP(method = "DELETE", path = "/v1/spot/batch-order", hasBody = true)
    Call<CommonResponse> batchCancelOrders(@Body SpotPostBatchCancelOrdersRequest request);

    @GET("/v1/spot/order/{id}")
    Call<CommonResponse> getOrder(@Path("id")Long id);

    @GET("/v1/spot/order")
    Call<CommonResponse> queryOrder(@Query("orderId") Long orderId);

    @GET("/v1/spot/open-order")
    Call<CommonResponse> openorder(@Query("symbol") String symbol, @Query("limit")Integer limit);

    @HTTP(method = "DELETE", path = "/v1/spot/open-order", hasBody = true)
    Call<CommonResponse> deleteOpenorder(@Body OpenOrderCancelRequest request);

    @DELETE("/v1/spot/order/{id}")
    Call<CommonResponse> delOrder(@Path("id")Long id);

    @GET("/v1/spot/balance")
    Call<CommonResponse> getBalance(@Query("currency") String currency);

    @GET("/v1/spot/balances")
    Call<CommonResponse> getBalances(@Query("currencies") List<String> currencies,@Query("queryAccountId") Long queryAccountId,@Query("filterIsDisplayFalse") boolean filterIsDisplayFalse);


    @GET("/v1/spot/public/trade/recent")
    Call<CommonResponse> getTrade(@Query("symbol") String currency);

    @GET("/v1/spot/public/ticker")
    Call<CommonResponse> getTicker(@Query("symbol") String currency);
}
