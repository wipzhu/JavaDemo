package com.wipzhu.loopdemo;

public class Test3 {
    public static void main(String[] args) {
        // 不用加减乘除四则运算计算 被除数除以除数的商和余数

        int a = 187;
        int devidend = a;
        int b = 3;

        int count = 0; // 商

        // 更相减损法
        while (a >= b) {
            a -= b;
            count++;
        }

        System.out.println(devidend + " / " + b + " = " + count + " ... " + a);
    }
}
