package com.ex.api.dto.spot;

import com.google.gson.Gson;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class OpenOrderCancelRequest {
    private String symbol;
    private String side;
    private String bizType;
    private String mode;

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
