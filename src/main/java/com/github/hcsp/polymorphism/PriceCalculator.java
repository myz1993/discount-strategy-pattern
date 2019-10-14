package com.github.hcsp.polymorphism;

import com.sun.javaws.IconUtil;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class PriceCalculator {
    // 使用策略模式重构这个方法，实现三个策略：
    // NoDiscountStrategy 不打折
    // Discount95Strategy 全场95折
    // OnlyVipDiscountStrategy 只有VIP打95折，其他人保持原价
    // 重构后的方法签名：
    // public static int calculatePrice(DiscountStrategy strategy, int price, User user)

        public static int calculatePrice(DiscountStrategy strategy, int price, User user){
            return  strategy.discount(price,user);
        }

    public static void main(String[] args) {
        System.out.println(calculatePrice(new OnlyVipDiscountStrategy(),  100, User.vip("张三")));
    }
}
