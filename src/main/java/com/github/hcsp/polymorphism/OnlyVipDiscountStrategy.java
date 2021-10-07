package com.github.hcsp.polymorphism;

public class OnlyVipDiscountStrategy extends DiscountStrategy {    //仅vip打折
    @Override
    public int discount(int price, User user) {          // 父类折扣
        if (user.isVip()) {
            return (int) (price * 0.95);
        } else {
            return price;
        }
    }
}
