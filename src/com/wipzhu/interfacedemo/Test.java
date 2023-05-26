package com.wipzhu.interfacedemo;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//        Dog dog = new Dog("旺财", 2);
//        System.out.println(dog.toString());
//        dog.eat();
//        dog.swim();
//
//        Frog f = new Frog("小青", 1);
//        System.out.println(f.toString());
//        f.eat();
//        f.swim();
//
//        Rabbit r = new Rabbit("小白", 3);
//        System.out.println(r.toString());
//        r.eat();

        System.out.println(Inter.a);
        InterImpl ii = new InterImpl();
        ii.method();

        Scanner sc = new Scanner(System.in);
        sc.next();

    }
}
