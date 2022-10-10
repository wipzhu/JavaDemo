package com.wipzhu.staticdemo;

public class TestDemo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        String str = ArrayUtil.printArr(arr);
        System.out.println(str);

        double[] arr2 = {2.3, 3.4, 4.5, 5.6, 6.7};
        double avg = ArrayUtil.getAverage(arr2);
        System.out.println(avg);
    }
}
