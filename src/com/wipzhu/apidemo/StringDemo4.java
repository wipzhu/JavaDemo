package com.wipzhu.apidemo;

import java.util.Scanner;

public class StringDemo4 {
    public static void main(String[] args) {
        //反转字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();

        String reverseStr = reverseString(str);
        System.out.println(reverseStr);
    }

    public static String reverseString(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result = result + str.charAt(i);
        }
        return result;
    }
}
