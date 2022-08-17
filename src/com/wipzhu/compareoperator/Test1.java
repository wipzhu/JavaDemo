package com.wipzhu.compareoperator;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入您自己的时髦度：");
        int myFashion = scanner.nextInt();
        System.out.println("请输入您相亲对象的时髦度：");
        int girlFashion = scanner.nextInt();

        boolean result = myFashion > girlFashion;

        if (result) {
            System.out.println("恭喜您，相亲成功！");
        } else {
            System.out.println("很遗憾，您相亲失败！");
        }
    }
}
