package com.wipzhu.extenddemo;

public class DogTest {
    public static void main(String[] args) {
        Husky h = new Husky();
        h.eat();
        h.drink();
        h.lookHome();
        h.breakHome();
        System.out.println("=====================");

        ChineseDog c = new ChineseDog();
        c.eat();
        c.drink();
        c.lookHome();
        System.out.println("=====================");

        SharPei sp = new SharPei();
        sp.eat();
        sp.drink();
        sp.lookHome();

    }
}
