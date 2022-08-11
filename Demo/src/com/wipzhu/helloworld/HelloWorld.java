package com.wipzhu.helloworld;


import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("hello world!");

        String name = "朱小花";

        Scanner sc = new Scanner(System.in);

        //键盘录入
        System.out.println("请输入整数a：");
        int a = sc.nextInt();
        System.out.println("请输入整数b：");
        int b = sc.nextInt();

        System.out.println("a + b = " + (a + b));

    }

}
