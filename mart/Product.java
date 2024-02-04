package com.chap6.interf.mart;

import java.math.BigDecimal;

public class Product {
    String name;
    BigDecimal price;
    BigDecimal weight;

    BigDecimal delivery_fee;

    public Product(String name, BigDecimal price, BigDecimal weight){
        this.name =name;
        this.price=price;
        this.weight=weight;
    }
}
