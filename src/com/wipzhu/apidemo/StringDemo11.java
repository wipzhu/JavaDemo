package com.wipzhu.apidemo;

import java.util.Random;
import java.util.Scanner;

public class StringDemo11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串:");
        String str = sc.next();
        String result = shuffle(str);

        System.out.println(result);
    }

    /**
     * 打乱字符串
     * @param str
     * @return
     */
    public static String shuffle(String str) {
        char[] arr = str.toCharArray();

        Random rd = new Random();
        for (int i = 0; i < arr.length; i++) {
            int index = rd.nextInt(arr.length);
            char temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }


        return new String(arr);
    }
}
