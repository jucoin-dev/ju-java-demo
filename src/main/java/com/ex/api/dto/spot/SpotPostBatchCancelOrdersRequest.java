package com.ex.api.dto.spot;

import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * @create 2023/9/20 16:09
 */
@Data
@Builder
public class SpotPostBatchCancelOrdersRequest {
    private List<String> orderIds;
}
