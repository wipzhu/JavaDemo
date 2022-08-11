package com.wipzhu.loopdemo;

import java.util.Scanner;

public class forDemo {
    public static void main(String[] args) {
//        for (int i = 1; i <= 10; i++) {
//            System.out.println("当前值是：" + i);
//        }
//
//        System.out.println('\n');
//
//        for (int i = 10; i >= 1;i--) {
//            System.out.println("当前值是：" + i);
//        }

//        int sum = 0;
//        for (int i = 1; i <= 100; i++) {
//            if (i % 2 == 0) sum += i;
//        }
//
//        System.out.println("1到100内偶数求和：" + sum);

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int a = sc.nextInt();
        System.out.println("请输入第二个整数：");
        int b = sc.nextInt();

        int num = 0, sum = 0;
        for (int i = a; i <= b; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                num += 1;
                sum += i;
            }
        }
        System.out.println(a + "和" + b + "之间共有" + num + "个数能同时被3和5整除");
        System.out.println("这些数的和是：" + sum);


    }
}
