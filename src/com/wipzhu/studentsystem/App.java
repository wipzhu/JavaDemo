package com.wipzhu.studentsystem;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("欢迎来到学生管理系统");
            System.out.println("请选择操作：1登录 2注册 3忘记密码");

            String opt = sc.next();
            switch (opt) {
                case "1" -> login();
                case "2" -> register();
                case "3" -> forgetPassword();
                case "4" -> {
                    System.out.println("谢谢使用，再见");
                    System.exit(0);
                }
                default -> System.out.println("没有这个选项！");
            }
        }
    }

    public static void login() {

    }

    public static void register() {

    }

    public static void forgetPassword() {

    }
}
