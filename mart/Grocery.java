package com.chap6.interf.mart;

import java.math.BigDecimal;

public class Grocery extends Product implements DeliveryChargeCalculator{

    public Grocery(String name, BigDecimal price, BigDecimal weight) {
        super(name, price, weight);
    }
}
