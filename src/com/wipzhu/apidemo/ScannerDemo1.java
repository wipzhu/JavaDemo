package com.wipzhu.apidemo;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个小数：");
        double num = sc.nextDouble();
        System.out.println(num);
    }
}
