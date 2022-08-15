package com.wipzhu.loopdemo;

import java.util.Random;
import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        //猜1-100之间的数字
        Random rd = new Random();
        int num = rd.nextInt(100)  + 1;
        System.out.println("生成的随机数是：" + num);

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您猜的数字：");

        while (true) {
            int guessNumber = sc.nextInt();
            if (guessNumber > num) {
                System.out.println("大了");
            } else if (guessNumber < num) {
                System.out.println("小了");
            } else {
                System.out.println("恭喜猜中");
                break;
            }
        }
    }

}
