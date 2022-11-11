package com.wipzhu.polymorphismdemo2;

public class Dog extends Animal {

    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String sth) {
        System.out.println(this.getAge() + "岁的" + this.getColor() + "颜色的狗两只前腿死死的抱住" + sth + "猛吃");
    }

    public void lookHome() {
        System.out.println("狗正在看家");
    }
}
