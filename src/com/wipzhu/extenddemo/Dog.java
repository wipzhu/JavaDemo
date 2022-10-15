package com.wipzhu.extenddemo;

public class Dog extends Animal{
    String name = "狗";

    public void eat() {
        System.out.println(this.name + "在吃狗粮");
    }

    public void drink() {
        System.out.println(this.name + "在喝水");
    }

    public void lookHome() {
        System.out.println(this.name + "在看家");
    }
}
