package com.wipzhu.logicoperator;

public class LogicOperatorDemo {
    public static void main(String[] args) {

        int a = 10;
        int b = 10;

        boolean result = ++a < 5 && ++b < 5;
        System.out.println(result);
        System.out.println(a);
        System.out.println(b);
    }
}
