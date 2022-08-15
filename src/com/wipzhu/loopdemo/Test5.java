package com.wipzhu.loopdemo;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        //求质数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int maxInt = sc.nextInt();

        boolean flag = true;// 是否是质数
        for (int i = 2; i < maxInt; i++) {
            //判断区间内，maxInt能否被i整除，如果没有则是质数
            if (maxInt % i == 0) {
                flag = false;
                break;
            }
        }
        System.out.println(maxInt + (flag ? "是质数" : "不是质数"));

        // 优化方案
        // 一个数如果是质数，那么[2,这个数的算术平方根]区间的数都不能被这个数整除
        /*for (int i = 2; i <= 这个数的算数平方根; i++) {
        }*/
    }

}
