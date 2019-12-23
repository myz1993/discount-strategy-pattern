package com.github.hcsp.polymorphism;

public class DiscountStrategy {
    private double discount;

    public DiscountStrategy() {
        // No Discount
        this.discount = 1;
    }

    public DiscountStrategy(double discount) {
        this.discount = discount;
    }

    public int calculate(int price, User user) {
        return (int)(discount*price);
    }
}
