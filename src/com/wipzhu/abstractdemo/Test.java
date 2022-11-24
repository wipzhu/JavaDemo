package com.wipzhu.abstractdemo;

public class Test {
    public static void main(String[] args) {

//        Student s = new Student("zhangsan",23);
//        System.out.println(s.getName() + "," + s.getAge());

        Frog f = new Frog("小绿",1);
        System.out.println(f.toString());

        f.eat();
        f.drink();
    }
}
