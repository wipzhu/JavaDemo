package com.wipzhu.apidemo;

import java.util.Scanner;
import java.util.StringJoiner;

public class StringDemo9 {
    public static void main(String[] args) {
//        //键盘输入一个字符串判断是不是对称字符串
//        String str = getStr();
//        String result = new StringBuilder().append(str).reverse().toString();
//
//        if (str.equals(result)) {
//            System.out.println(str + "是一个对称字符串");
//        } else {
//            System.out.println(str + "不是一个对称字符串");
//        }

        // 将数组拼接成字符串
//        int[] arr = {1,2,3};
//        String str1 = arrToString(arr);
//        System.out.println(str1);

        String[] arr1 = {"Hello", "World"};
        StringJoiner sj = new StringJoiner(", ", "[", "]");
        for (int i = 0; i < arr1.length; i++) {
            sj.add(arr1[i]);
        }
        System.out.println(sj);
    }

    public static String arrToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(i).append("]");
            } else {
                sb.append(i).append(", ");
            }
        }
        return sb.toString();
    }

    public static String getStr() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        return sc.next();
    }
}
