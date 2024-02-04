package com.chap6.interf.mart;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Beauty extends Product implements DeliveryChargeCalculator{


    public Beauty(String name, BigDecimal price, BigDecimal weight) {
        super(name, price, weight);
    }


}
