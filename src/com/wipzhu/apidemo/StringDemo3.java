package com.wipzhu.apidemo;

public class StringDemo3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        //数组转字符串
        String res = arrayToString(arr);
        System.out.println(res);
    }

    public static String arrayToString(int[] arr) {
        if (arr == null) {
            return "";
        }

        if (arr.length == 0) {
            return "[]";
        }

        String result = "[";
        for (int i = 0; i < arr.length; i++) {

            if (i == arr.length - 1) {
                result = result + arr[i] + "]";
            } else {
                result = result + arr[i] + ", ";
            }
        }

        return result;
    }
}
