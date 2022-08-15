package com.wipzhu.loopdemo;

import java.util.Scanner;

/**
 * 判断一个整数是不是回文数
 */
public class Test2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数，判断是不是回文数：");
        int x = sc.nextInt();
        // 记录x原始值，用于最后的比较
        int temp = x;
        // 记录x反转之后的值
        int num = 0;

        while (x != 0) {
            // 从右至左取每一个数字
            int g = x % 10;
            // 取完最后一位数字之后重新给x赋值
            // 整数/整数结果为整数（余数被舍弃）
            x /= 10;
            // 把当前取到的数字拼接到最后边
            num = num * 10 + g;
        }
        String flag = (num == temp) ? "该数字是回文数" : "该数字不是回文数";
        System.out.println(temp + "===>" + flag);
    }
}
