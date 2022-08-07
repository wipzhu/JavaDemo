package com.wipzhu.test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {

        // 输入的两个整数有一个6或者两个整数的和是6的倍数输出为true，其他为false
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入一个整数：");
        int a = scanner.nextInt();
        System.out.println("请输入另一个整数：");
        int b = scanner.nextInt();

        System.out.println(a == 6 || b ==6 || ((a + b) % 6 == 0));
    }
}
