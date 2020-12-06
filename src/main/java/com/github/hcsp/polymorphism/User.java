package com.github.hcsp.polymorphism;

public class User {
    //姓名和VIP信息
    private String name;
    private boolean vip;

    private User(String name, boolean vip) {
        this.name = name;
        this.vip = vip;
    }

    public static User vip(String name) {
        return new User(name, true);
    }

    public static User dios(String name) {
        return new User(name, false);
    }

    public String getName() {
        return name;
    }

    public boolean isVip() {
        return vip;
    }
}
