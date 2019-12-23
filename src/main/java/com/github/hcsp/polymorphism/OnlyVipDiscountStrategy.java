package com.github.hcsp.polymorphism;

public class OnlyVipDiscountStrategy extends DiscountStrategy {
    public OnlyVipDiscountStrategy() {
        super();
    }

    @Override
    public int calculate(int price, User user) {
        if (user.isVip()) {
            return (int) (price * 0.95);
        } else {
            return price;
        }
    }
}
