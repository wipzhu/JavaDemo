package com.wipzhu.helloworld;


import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("hello world!");

        String name = "��С��";

        Scanner sc = new Scanner(System.in);

        //����¼��
        System.out.println("����������a��");
        int a = sc.nextInt();
        System.out.println("����������b��");
        int b = sc.nextInt();

        System.out.println("a + b = " + (a + b));

    }

}
