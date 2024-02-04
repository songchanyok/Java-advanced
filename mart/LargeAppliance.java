package com.chap6.interf.mart;

import java.math.BigDecimal;

public class LargeAppliance extends Product implements DeliveryChargeCalculator{

    public LargeAppliance(String name, BigDecimal price, BigDecimal weight) {
        super(name, price, weight);
    }

    public static void main(String[] args) {
        BigDecimal total_delivery_fee=new BigDecimal(0);
        BigDecimal total_weight=BigDecimal.valueOf(0.0);
        BigDecimal total_price= new BigDecimal(0);

        Grocery[] grocerys = new Grocery[]{
                new Grocery("옥수수콘",new BigDecimal(4100),BigDecimal.valueOf(0.3)),
                new Grocery("파김치",new BigDecimal(9900),BigDecimal.valueOf(0.5))
        };
        for (int i = 0; i < grocerys.length; i++) {
            total_price=total_price.add(grocerys[i].price);
            total_weight=total_weight.add(grocerys[i].weight);

        }
        total_delivery_fee=total_delivery_fee.add(grocerys[0].getDeliveryCharge(total_weight,total_price));


        LargeAppliance motion_desk = new LargeAppliance("모션데스크",new BigDecimal(200000),BigDecimal.valueOf(50));
        total_delivery_fee=total_delivery_fee.add(motion_desk.getDeliveryCharge(motion_desk.weight,motion_desk.price));

        System.out.println(total_delivery_fee);
    }
}
