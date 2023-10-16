package com.blackfiresoft.aiproject.payment.model;


import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class RefundOrderRqs {

    private String outTradNo;
    private String outRefundNo;
    private Long refund;
    private Long total;
    private String currency;

}
