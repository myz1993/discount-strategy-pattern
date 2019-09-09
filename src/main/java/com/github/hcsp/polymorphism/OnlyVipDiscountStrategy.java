package com.github.hcsp.polymorphism;

public class OnlyVipDiscountStrategy extends DiscountStrategy{
    final double rate=0.95;
    @Override
    public int discount(int price, User user) {
        return  (int)(price*(user.isVip()?rate:1));
    }
}
