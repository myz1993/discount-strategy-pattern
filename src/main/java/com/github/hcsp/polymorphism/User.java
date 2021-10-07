package com.github.hcsp.polymorphism;

public class User {            //顾客 连个属性 名字和 是否vip
    private String name;
    private boolean vip;

    private User(String name, boolean vip) {
        this.name = name;
        this.vip = vip;
    }

    public static User vip(String name) {          //工厂方法创建对象
        return new User(name, true);
    }

    public static User dios(String name) {       //工厂方法创建对象
        return new User(name, false);
    }

    public String getName() {
        return name;
    }

    public boolean isVip() {
        return vip;
    }
}
