package com.wipzhu.functiondemo;

public class Test2 {

    public static void main(String[] args) {
        int[] arr = {99, 23, 39, 53, 12, 23};
        int res = getMax(arr);

        System.out.println("最大值是：" + res);
    }

    /**
     *  求数组最大值
     * @param arr
     * @return int
     */
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
}
