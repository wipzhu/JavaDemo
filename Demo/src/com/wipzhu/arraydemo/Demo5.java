package com.wipzhu.arraydemo;

import java.util.Random;

public class Demo5 {

    public static void main(String[] args) {
        // 随机打乱数组
        int[] arr = {1,2,3,4,5,6,7,8};

        Random rd = new Random();
        for (int i = 0; i < arr.length; i++) {
            int randomIndex = rd.nextInt(arr.length);

            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
