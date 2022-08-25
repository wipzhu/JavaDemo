package com.wipzhu.classdemo;

public class GirlFriend {
    private String name;
    private int age = 10;
    private String gender;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        if (age >= 18 && age <= 24) {
            this.age = age;
        } else {
            System.out.println("年龄不合适");
        }
    }

    public int getAge() {
        return this.age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return this.gender;
    }

    public void sleep() {
        System.out.println(this.getName() + "在睡觉");
    }

    public void eat() {
        System.out.println(this.getName() + "在吃饭");
    }
}
