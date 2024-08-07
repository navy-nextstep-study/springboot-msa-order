package com.study.springbootmsaorder.messaging.producer;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Topic {
    PAYMENT_CANCEL("payment-cancel"),
    PRODUCT_STOCK_INCREASE("product-stock-increase"),
    ;

    private final String value;
}
