package com.chap6.interf.mart;

import java.math.BigDecimal;

public class Cart {
    Product[] products;
    public Cart(Product[] products){
        this.products=products;
    }

    public BigDecimal calculateDeliveryCharge() {
        BigDecimal total_weight=this.getTotalWeight();
        BigDecimal deliveryCharge;
        if (total_weight.compareTo(BigDecimal.valueOf(3.0))<0) {
            deliveryCharge = BigDecimal.valueOf(1000);
        } else if (total_weight.compareTo(BigDecimal.valueOf(10.0))<0) {
            deliveryCharge = BigDecimal.valueOf(5000);
        } else {
            deliveryCharge = BigDecimal.valueOf(10000);
        }
        deliveryCharge=products[0].getDiscountAmount(deliveryCharge,this.getTotalPrice());

        return deliveryCharge;
    }

    public BigDecimal getTotalWeight(){
        BigDecimal total_weight=BigDecimal.ZERO;
        for(Product product:products){
            total_weight=total_weight.add(product.getWeight());
        }
        return total_weight;
    }

    public BigDecimal getTotalPrice(){
        BigDecimal total_price=BigDecimal.ZERO;
        for(Product product:products){
            total_price = total_price.add(product.getPrice());
        }
        return total_price;
    }

}
