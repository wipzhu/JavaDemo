package com.wipzhu.arraydemo;

import java.util.Random;

public class Demo3 {
    public static void main(String[] args) {
        // 随机生成1-100内10个随机数
        // 求和，求平均值，求比平均值小的个数
        Random rd = new Random();
        int[] arr = new int[10];

        int sum = 0, avg = 0, lAvgNum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(100) + 1;
            sum += arr[i];
        }

        avg = sum / (arr.length);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < avg) {
                lAvgNum++;
            }
            System.out.print(arr[i] + "\t");
        }

        System.out.println();

        System.out.println("随机数求和：" + sum);
        System.out.println("随机数的平均值：" + avg);
        System.out.println("比平均值小的个数：" + lAvgNum);
    }
}
