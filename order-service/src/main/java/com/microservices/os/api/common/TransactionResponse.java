package com.microservices.os.api.common;

import com.microservices.os.api.entity.Order;

public class TransactionResponse {
    private Order order;
    private int amount;
    private String transactionId;
}
