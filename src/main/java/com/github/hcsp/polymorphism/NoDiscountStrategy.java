package com.github.hcsp.polymorphism;

public class NoDiscountStrategy extends DiscountStrategy {     //不打折
    @Override
    public int discount(int price, User user) {          // 父类折扣
        return price;
    }
}
