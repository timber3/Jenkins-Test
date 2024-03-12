package com.farmyo.test.dto;

import lombok.Data;

@Data
public class EthResultDto {
    private String status;
    private String msg;
    private Object data;
}
