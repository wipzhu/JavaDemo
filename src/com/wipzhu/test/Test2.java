package com.wipzhu.test;

public class Test2 {
    public static void main(String[] args) {
        // 输出101-200之间的所有质数，并输出个数

        int count = 0;
        //遍历101-200
        for (int i = 101; i <= 200; i++) {
            boolean flag = true;
            //判断当前数是否是一个质数
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                count++;
                System.out.println("当前数字" + i + "是质数");
            }
        }

        System.out.println("共有" + count + "个质数");
    }
}
