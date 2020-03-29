package com.github.hcsp.polymorphism;

public class OnlyVipDiscountStrategy extends DiscountStrategy {
    public int discount(int price, User user) {
        return (user.isVip() == true) ? (int) (price * 0.95) : price;
    }
}
