package com.github.hcsp.polymorphism;

public class Discount95Strategy extends DiscountStrategy{
    final double rate=0.95;
    @Override
    public int discount(int price, User user) {
        return (int)(price*rate);
    }
}
