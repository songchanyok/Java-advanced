package com.chap6.interf.mart;

import java.math.BigDecimal;

public class Product implements Promotion{
    private String name;
    private BigDecimal price;
    private BigDecimal weight;
    BigDecimal delivery_fee;

    public Product(String name, BigDecimal price, BigDecimal weight){
        this.name =name;
        this.price=price;
        this.weight=weight;
    }

    @Override
    public BigDecimal getDiscountAmount(BigDecimal total_delivery_price,BigDecimal total_price) {
        if (total_price.compareTo(BigDecimal.valueOf(30000))<0) {
            return total_delivery_price;
        } else if(total_price.compareTo(BigDecimal.valueOf(100000))<0){
            return total_delivery_price.subtract(BigDecimal.valueOf(1000));
        }
        return BigDecimal.ZERO;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }
}
