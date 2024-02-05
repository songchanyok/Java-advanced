package com.chap6.interf.mart;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Product beauty = new Beauty("beauty", BigDecimal.valueOf(12000), BigDecimal.valueOf(2));
        Product grocery = new Grocery("grocery", BigDecimal.valueOf(35000), BigDecimal.valueOf(3));
        Product largeAppliance = new LargeAppliance("largeAppliance", BigDecimal.valueOf(10000), BigDecimal.valueOf(5));

        Cart cart = new Cart(new Product[]{beauty,grocery,largeAppliance});
        System.out.println(cart.getTotalWeight());
        System.out.println(cart.getTotalPrice());
        System.out.println(cart.calculateDeliveryCharge());;



    }
}
