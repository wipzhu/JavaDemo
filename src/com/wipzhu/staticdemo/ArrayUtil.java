package com.wipzhu.staticdemo;

public class ArrayUtil {
    /**
     * 私有化构造方法，防止工具类被实例化
     */
    private ArrayUtil() {
    }

    /**
     * 打印数组
     *
     * @param arr
     * @return
     */
    public static String printArr(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i]).append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /**
     * 求平均值
     *
     * @param arr
     * @return
     */
    public static double getAverage(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum / arr.length;
    }

}
