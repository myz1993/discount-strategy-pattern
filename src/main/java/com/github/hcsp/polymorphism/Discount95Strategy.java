package com.github.hcsp.polymorphism;

public class Discount95Strategy extends DiscountStrategy {    //95折
    @Override
    public int discount(int price, User user) {          // 父类折扣
        return (int) (price * 0.95);
    }
}
