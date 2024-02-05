package com.chap6.interf.mart;

import java.math.BigDecimal;

public interface Promotion {
    public BigDecimal getDiscountAmount(BigDecimal total_delivery_price,BigDecimal total_price);
}
