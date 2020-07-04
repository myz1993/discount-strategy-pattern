package com.github.hcsp.polymorphism;

import com.sun.org.apache.bcel.internal.generic.ARETURN;

public class Discount95Strategy extends DiscountStrategy {
    @Override
    public int discount(int price, User user) {
        return (int) (price * 0.95);
    }
}
