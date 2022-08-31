package com.wipzhu.apidemo;

import java.util.Scanner;

public class StringDemo1 {
    public static void main(String[] args) {
        String rightUserName = "zhangsasn";
        String rightPassword = "123456";

        Scanner sc = new Scanner(System.in);

        int maxErrorNum = 3;
        for (int i = 0; i < maxErrorNum; i++) {
            System.out.println("请输入用户名：");
            String userName = sc.next();
            System.out.println("请输入密码：");
            String password = sc.next();

            if (userName.equals(rightUserName) && password.equals(rightPassword)) {
                System.out.println("用户登录成功！");
                break;
            } else {
                if (i == (maxErrorNum - 1)) {
                    System.out.println("您的账户已被锁定，请联系管理员！");
                    break;
                }

                System.out.println("用户名或密码错误，还剩" + (maxErrorNum - i - 1) + "次机会哦");
            }
        }
    }
}
