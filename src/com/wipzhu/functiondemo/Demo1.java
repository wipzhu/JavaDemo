package com.wipzhu.functiondemo;

public class Demo1 {

    public static void main(String[] args) {
        // 求两个数的和
        getSum(12, 23);

        // 求长方形周长
        getLength(12.4, 8.5);

        // 求圆形面积
        getArea(10);
    }

    public static void getSum(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    public static void getLength(double length, double width) {
        System.out.println((length + width) * 2);
    }

    public static void getArea(double radius) {
        System.out.println(radius * radius * Math.PI);
    }
}
