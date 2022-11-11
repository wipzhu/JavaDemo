package com.wipzhu.polymorphismdemo;

public class Dog extends Animal {
    String name = "狗";

    @Override
    public void show() {
        System.out.println("狗-------show方法");
    }
}
