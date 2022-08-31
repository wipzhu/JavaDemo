package com.wipzhu.apidemo;

import java.util.Scanner;

public class StringDemo2 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();

//        for (int i = 0; i < str.length(); i++) {
//            System.out.println(str.charAt(i));
//        }

        //输入一个字符串，统计大小写字符个数和数字个数
        int upperCaseCount = 0;
        int lowerCaseCount = 0;
        int numericalCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                lowerCaseCount++;
            }
            if (c >= 'A' && c <= 'Z') {
                upperCaseCount++;
            }
            if (c >= '0' && c <= '9') {
                numericalCount++;
            }
        }

        System.out.println("大写字符数：" + upperCaseCount);
        System.out.println("小写字符数：" + lowerCaseCount);
        System.out.println("数字字符数：" + numericalCount);

    }
}
