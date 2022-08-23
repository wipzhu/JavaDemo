package com.wipzhu.test;

public class Test5 {
    public static void main(String[] args) {
        //数字加密
        // 规则：每位数字加上5，再对10求余，最后将数字反转

        System.out.println("---------------------加密----------------------");
        int[] arr = {1, 9, 8, 3};

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] + 5) % 10;
        }

        // 将数字反转
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            number = number * 10 + arr[i];
        }

        System.out.println(number);

        System.out.println("---------------------解密----------------------");
        int[] arr1 = {8, 3, 4, 6};
        // 反转数组
        for (int i = 0, j = arr1.length - 1; i < j; i++, j--) {
            int temp = arr1[i];
            arr1[i] = arr1[j];
            arr1[j] = temp;
        }

        // 取余之前的数组
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] >= 0 && arr1[i] <= 4) {
                arr1[i] = arr1[i] + 10;
            }
            arr1[i] = arr1[i] - 5;

            System.out.print(arr1[i]);
        }

    }
}
