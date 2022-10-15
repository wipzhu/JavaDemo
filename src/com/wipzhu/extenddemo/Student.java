package com.wipzhu.extenddemo;

public class Student extends Person{
    @Override
    public void eat() {
        System.out.println("吃馒头、吃面条");
    }

    @Override
    public void drink() {
        System.out.println("喝可乐");
    }

    public void lunch() {
        this.eat();
        this.drink();

        super.eat();
        super.drink();
    }
}
