package com.wipzhu.polymorphismdemo2;

public class Cat extends Animal {

    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String sth) {
        System.out.println(this.getAge() + "岁的" + this.getColor() + "颜色的猫眯着眼睛侧着头吃" + sth);
    }

    public void catchMouse() {
        System.out.println("猫正在抓老鼠");
    }
}
