package com.wipzhu.functiondemo;

public class Test3 {
    public static void main(String[] args) {

        int num =28;
        int[] arr = {12,23,45,29,232,54,24};

        boolean res = checkExist(num, arr);

        System.out.println(res);

    }

    /**
     * 判断一个数字是否存在于数组中
     * @param num
     * @param arr
     * @return
     */
    public static boolean checkExist(int num, int[] arr) {
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                flag = true;
                break;
            }
        }

        return flag;
    }
}
