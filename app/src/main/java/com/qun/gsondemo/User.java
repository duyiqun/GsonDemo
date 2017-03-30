package com.qun.gsondemo;

public class User {

    public String name;
    public int age;
    public boolean married;

    @Override
    public String toString() {
        return "User [name=" + name + ", age=" + age + ", married=" + married
                + "]";
    }
}
