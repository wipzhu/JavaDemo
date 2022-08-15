package com.wipzhu.switchdemo;

import java.util.Scanner;

public class SwitchDemo {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个整数：");
//        int number = sc.nextInt();
//
//        switch (number) {
//            case 1 -> {
//                System.out.println("输入的数值是1");
//            }
//            case 20 -> System.out.println("输入的数值是20");
//            default -> System.out.println("没有这个选项");
//        }

//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入今天是星期几");
//        int week = sc.nextInt();
//
//        switch (week) {
//            case 1,2,3,4,5 -> System.out.println("今天是工作日");
//
//            case 6,7 -> System.out.println("今天是休息日");
//            default -> System.out.println("没有这个星期");
//
//        }

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数表示您的选择：");

        int choose = sc.nextInt();

        switch (choose) {
            case 1 -> System.out.println("机票查询");
            case 2 -> System.out.println("机票预订");
            case 3-> System.out.println("机票改签");
//            case 4 -> System.out.println("退出服务");
            default -> System.out.println("退出服务");
        }
    }
}
