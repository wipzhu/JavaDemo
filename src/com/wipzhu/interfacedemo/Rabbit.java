package com.wipzhu.interfacedemo;

public class Rabbit extends Animal{
    public Rabbit() {
    }

    public Rabbit(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("兔子在吃胡萝卜");
    }

    public String toString() {
        return "Rabbit{name = " + name + ", age = " + age + "}";
    }
}
