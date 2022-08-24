package com.wipzhu.test;

import java.util.Random;

public class Test6 {
    public static void main(String[] args) {
        // 抽奖，随机且不重复，{2,588,888,1000,10000}
        int[] arr = {2, 588, 888, 1000, 10000};//奖池

        Random rd = new Random();

        //******************一个方案*******************//
        //随机打乱数组输出即可
        for (int i = 0; i < arr.length; i++) {
            int index = rd.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "已抽出");
        }

        //******************另一个方案*******************//
//        int[] newArr = new int[arr.length];//已抽出的奖项
//        for (int i = 0; i < arr.length;) {
//            int index = rd.nextInt(arr.length);
//            int prize = arr[index];
//            // 判断奖项是否已经存在
//            if (contains(newArr, prize)) {
//                continue;
//            }
//            newArr[i] = prize;
//            i++;
//            System.out.println(arr[index] + "已抽出");
//        }

    }

    /**
     * 判断奖项是否已经抽出
     *
     * @param arr
     * @param prize
     * @return
     */
    public static boolean contains(int[] arr, int prize) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == prize) {
                return true;
            }
        }
        return false;
    }
}
