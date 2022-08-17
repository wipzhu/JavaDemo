package com.wipzhu.functiondemo;

public class Test1 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};

        printArr(arr);
    }

    /**
     * 输出格式如[1,2,3]的数组
     * @param arr
     */
    public static void printArr(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ",");
            }
        }
        System.out.println("]");
    }
}
