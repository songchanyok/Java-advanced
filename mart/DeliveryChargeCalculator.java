package com.chap6.interf.mart;

import java.math.BigDecimal;

public interface DeliveryChargeCalculator {
    default BigDecimal getDeliveryCharge(BigDecimal weight,BigDecimal price){
        int fee;
        if(3.0>weight.doubleValue()){
            fee=1000;
        }else if(10.0>weight.doubleValue()){
            fee=5000;
        }else{
            fee=10000;
        }

        if(price.intValue()>=30000 && price.intValue()<100000){
            fee-=1000;
        }
        if(price.intValue()>=100000){
            fee=0;
        }
        return new BigDecimal(fee);
    }
}
