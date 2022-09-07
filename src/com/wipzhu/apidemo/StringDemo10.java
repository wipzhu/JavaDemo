package com.wipzhu.apidemo;

import java.util.Scanner;

public class StringDemo10 {
    public static void main(String[] args) {
        /*
            abcde 旋转1次 bcdea 旋转2次 cdeab
            字符串A旋转若干次之后若等于字符串B则返回true
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符A：");
        String strA = sc.next();

        System.out.println("请输入字符B：");
        String strB = sc.next();

        int length = strA.length();
        boolean flag = false;
        int count = 0;
        String temp = strA;
        for (int i = 0; i < length; i++) {
            if (strB.equals(strA)) {
                flag = true;
                break;
            } else {
//                strA = strRotate(strA);
                strA = rotate(strA);
                count++;
            }
        }

        System.out.println(flag);
        if (flag) {
            System.out.println(temp + "旋转" + count + "次得到" + strB);
        }

    }

    /**
     * 旋转字符串
     *
     * @param str
     * @return
     */
    public static String strRotate(String str) {
        StringBuilder sb = new StringBuilder();

        char  first = str.charAt(0);
        String left = str.substring(1);

        return sb.append(left).append(first).toString();
    }

    public static String rotate(String str) {
        char[] arr = str.toCharArray();

        char first = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = first;

        return new String(arr);

    }
}
