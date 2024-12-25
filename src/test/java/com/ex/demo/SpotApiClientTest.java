package com.ex.demo;

import com.ex.api.client.spot.SpotApiClientImpl;
import com.ex.api.dto.CommonResponse;
import com.ex.api.dto.spot.OpenOrderCancelRequest;
import com.ex.api.dto.spot.SpotPostBatchCancelOrdersRequest;
import com.ex.api.dto.spot.SpotPostBatchOrdersRequest;
import com.ex.api.dto.spot.SpotPostOrderRequest;
import org.junit.Test;

import java.util.Arrays;

/**
 * SPOT Business
 * @create 2023/9/20 16:15
 */
public class SpotApiClientTest {

    SpotApiClientImpl spotApiClient = new SpotApiClientImpl(null);

    @Test
    public void testpostOrder() {
        SpotPostOrderRequest request = SpotPostOrderRequest.builder().symbol("btc_usdt")
                .side("BUY")
                .type("LIMIT")
                .timeInForce("GTC")
                .bizType("SPOT")
                .price("70000")
                .quantity("0.1")
                .build();
        CommonResponse commonResponse = spotApiClient.postOrder(request);
        System.out.println("result:"+commonResponse);
    }


    @Test
    public void testpostOrderLTC() {
        SpotPostOrderRequest request = SpotPostOrderRequest.builder().symbol("ltc_usdt")
                .side("BUY")
                .type("LIMIT")
                .timeInForce("GTC")
                .bizType("SPOT")
                .price("72")
                .quantity("2")
                .build();
        CommonResponse commonResponse = spotApiClient.postOrder(request);
        System.out.println("result:"+commonResponse);
    }

    @Test
    public void testpostOrderTRX() {
        SpotPostOrderRequest request = SpotPostOrderRequest.builder().symbol("trx_usdt")
                .side("BUY")
                .type("LIMIT")
                .timeInForce("GTC")
                .bizType("SPOT")
                .price("0.15931")
                .quantity("200")
                .build();
        CommonResponse commonResponse = spotApiClient.postOrder(request);
        System.out.println("result:"+commonResponse);
    }


    @Test
    public void testpostOrderXRP() {
        SpotPostOrderRequest request = SpotPostOrderRequest.builder().symbol("xrp_usdt")
                .side("BUY")
                .type("LIMIT")
                .timeInForce("GTC")
                .bizType("SPOT")
                .price("0.5")
                .quantity("10")
                .build();
        CommonResponse commonResponse = spotApiClient.postOrder(request);
        System.out.println("result:"+commonResponse);
    }


    @Test
    public void testpostOrderETH() {
        SpotPostOrderRequest request = SpotPostOrderRequest.builder().symbol("eth_usdt")
                .side("BUY")
                .type("LIMIT")
                .timeInForce("GTC")
                .bizType("SPOT")
                .price("10000")
                .quantity("0.001")
                .build();
        CommonResponse commonResponse = spotApiClient.postOrder(request);
        System.out.println("result:"+commonResponse);
    }

    @Test
    public void testpostOrderETC() {
        SpotPostOrderRequest request = SpotPostOrderRequest.builder().symbol("etc_usdt")
                .side("BUY")
                .type("LIMIT")
                .timeInForce("GTC")
                .bizType("SPOT")
                .price("20")
                .quantity("1")
                .build();
        CommonResponse commonResponse = spotApiClient.postOrder(request);
        System.out.println("result:"+commonResponse);
    }


    @Test
    public void testBatchOrders() {
        SpotPostOrderRequest request1 = SpotPostOrderRequest.builder().symbol("btc_usdt")
                .side("BUY")
                .type("LIMIT")
                .timeInForce("GTC")
                .bizType("SPOT")
                .price("72000")
                .quantity("0.001")
                .build();

        SpotPostOrderRequest request2 = SpotPostOrderRequest.builder().symbol("btc_usdt")
                .side("BUY")
                .type("LIMIT")
                .timeInForce("GTC")
                .bizType("SPOT")
                .price("72000")
                .quantity("0.001")
                .build();
        SpotPostBatchOrdersRequest request = SpotPostBatchOrdersRequest.builder().build();
        request.setItems(Arrays.asList(request1,request2));

        CommonResponse commonResponse = spotApiClient.batchOrders(request);
        System.out.println("result:"+commonResponse);
    }

    @Test
    public void testBatchCancelOrders() {
        SpotPostBatchCancelOrdersRequest request = SpotPostBatchCancelOrdersRequest.builder().orderIds(Arrays.asList("434191736332391744","434189628363347840"))
                .build();
        CommonResponse commonResponse = spotApiClient.batchCancelOrders(request);
        System.out.println("result:"+commonResponse);
    }

    @Test
    public void getOrder() {
        CommonResponse commonResponse = spotApiClient.getOrder(434181755256280960L);
        System.out.println("result:"+commonResponse);
    }

    @Test
    public void queryOrder() {
        CommonResponse commonResponse = spotApiClient.queryOrder(434191736332391744L);
        System.out.println("result:"+commonResponse);
    }

    @Test
    public void openOrder() {
        CommonResponse commonResponse = spotApiClient.openOrder("btc_usdt",10);
        System.out.println("result:"+commonResponse);
    }
    @Test
    public void deleteOpenOrder() {
        OpenOrderCancelRequest request = new OpenOrderCancelRequest();
        request.setSide("BUY");
        CommonResponse commonResponse = spotApiClient.deleteOpenOrder(request);
        System.out.println("result:"+commonResponse);
    }
    @Test
    public void delOrder() {
        CommonResponse commonResponse = spotApiClient.delOrder(420731982113506112L);
        System.out.println("result:"+commonResponse);
    }

    @Test
    public void getBalance() {
        CommonResponse commonResponse = spotApiClient.getBalance("USDT");
        System.out.println("result:"+commonResponse);
    }


    @Test
    public void getBalances() {
        CommonResponse commonResponse = spotApiClient.getBalances(null,null,false);
        System.out.println("result:"+commonResponse);
    }


    @Test
    public void getTrade() {
        CommonResponse commonResponse = spotApiClient.getTrade("btc_usdt");
        System.out.println("result:"+commonResponse);
    }
    @Test
    public void getTicker() {
        CommonResponse commonResponse = spotApiClient.getTicker("btc_usdt");
        System.out.println("result:"+commonResponse);
    }
}
