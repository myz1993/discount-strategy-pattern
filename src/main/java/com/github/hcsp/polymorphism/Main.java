package com.github.hcsp.polymorphism;

public class Main {
    public static void main(String[] args) {
        User user1 = User.vip("yaoyao");
        User user2 = User.dios("lili");
        int price = PriceCalculator.calculatePrice(new Discount95Strategy(), 200, user1);
        int price2 = PriceCalculator.calculatePrice(new OnlyVipDiscountStrategy(), 400, user1);
        System.out.println(price);
        System.out.println(price2);
    }
}
