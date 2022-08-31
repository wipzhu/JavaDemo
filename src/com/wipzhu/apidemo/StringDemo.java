package com.wipzhu.apidemo;

import java.util.Scanner;

public class StringDemo {

    public static void main(String[] args) {
//        //====================================
//        //传递字符数组创建字符串对象
//        char[] chs = {'a','b','c','d'};
//        String s = new String(chs);
//        System.out.println(s);
//
//        //====================================
//        //传递字节数组创建字符串对象
//        char[] bytes = {97, 98, 99, 100};// ASCII值
//        String s0 = new String(bytes);
//        System.out.println(s0);

//        //====================================
//        String s1 = "abc";
//        String s2 = "abc";
//        String s3 = new String("Abc");
//
////        System.out.println(s1 == s3); // false
////        System.out.println(s1 == s2); // true
//        System.out.println(s1.equals(s3));
//        System.out.println(s1.equalsIgnoreCase(s3));

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入abc");
        String str1 = sc.next();
        String str2 = "abc";

//        System.out.println(s1 == s2); // false
        System.out.println(str1.equals(str2));

    }


}
