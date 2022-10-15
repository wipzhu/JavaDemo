package com.wipzhu.extenddemo;

public class ChineseDog extends Dog{
    String name = "中华田园犬";

    @Override
    public void eat() {
        System.out.println(this.name + "在吃剩饭");
    }
}
