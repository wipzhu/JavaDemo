package com.wipzhu.extenddemo;

public class Student extends Person{
    @Override
    public void eat() {
        System.out.println("吃馒头、吃面条");
    }

    @Override
    public void drink() {
        System.out.println("喝稀饭");
    }

    public void lunch() {
        System.out.println("============北方人===========");
        this.eat();
        this.drink();

        System.out.println("============南方人===========");
        super.eat();
        super.drink();
    }
}
