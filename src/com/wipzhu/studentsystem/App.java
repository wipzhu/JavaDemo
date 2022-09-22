package com.wipzhu.studentsystem;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.wipzhu.studentsystem.IDCardUtil.isIdCardValidate;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<User> list = new ArrayList<>();
        while (true) {
            System.out.println("-------------------------欢迎来到学生管理系统-------------------------");
            System.out.println("请选择操作：1登录 2注册 3忘记密码 4退出");

            String opt = sc.next();
            switch (opt) {
                case "1" -> login(list);
                case "2" -> register(list);
                case "3" -> forgetPassword(list);
                case "4" -> {
                    System.out.println("谢谢使用，再见");
                    System.exit(0);
                }
                default -> System.out.println("没有这个选项！");
            }
        }
    }

    public static void login(ArrayList<User> list) {
        System.out.println("登录");

    }

    public static void register(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);

        User u = new User();
        while (true) {
            System.out.println("请输入用户名：");
            String username = sc.next();

            boolean check = checkUsername(username);
            if (!check) {
                System.out.println("用户名格式非法，请重新输入");
                continue;
            }

            int index = getIndex(list, username);
            if (index >= 0) {
                System.out.println("用户名" + username + "已存在，请重新输入");
            } else {
                u.setUsername(username);
                break;
            }
        }
        while (true) {
            System.out.println("请输入密码：");
            String password = sc.next();
            System.out.println("请输入确认密码：");
            String againPassword = sc.next();
            if (password.equals(againPassword)) {
                u.setPassword(password);
                break;
            } else {
                System.out.println("两次密码输入不一致，请重新输入！");
            }
        }

        while (true) {
            System.out.println("请输入身份证号：");
            String personId = sc.next();
            if (isIdCardValidate(personId)) {
                u.setPersonId(personId);
                break;
            } else {
                System.out.println("身份证号非法，请重新输入");
            }
        }
        while (true) {
            System.out.println("请输入手机号：");
            String phoneNumber = sc.next();
            if (verifyPhone(phoneNumber)) {
                u.setPhoneNumber(phoneNumber);
                break;
            } else {
                System.out.println("手机号格式非法，请重新输入");
            }
        }

        list.add(u);
        System.out.println("恭喜，注册成功！");

        for (int i = 0; i < list.size(); i++) {
            User registeredUser = list.get(i);
            System.out.println(registeredUser.getUsername() + ", " + registeredUser.getPassword()
                    + ", " +registeredUser.getPersonId() + ", " + registeredUser.getPhoneNumber());
        }
    }

    public static void forgetPassword(ArrayList<User> list) {
        System.out.println("忘记密码");

    }

    public static boolean checkUsernameExists(ArrayList<User> list, String username) {
        return getIndex(list, username) >= 0;
    }

    public static int getIndex(ArrayList<User> list, String username) {
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            if (u.getUsername().equals(username)) {
                return i;
            }
        }

        return -1;
    }

    /**
     * 检查用户名是否合法
     *
     * @param username
     * @return
     */
    public static boolean checkUsername(String username) {
        int len = username.length();
        if (len < 3 || len > 15) {
            return false;
        }

        boolean isNumeric = username.matches("[0-9]+");
        if (isNumeric) {
            return false;
        }

        Pattern pattern = Pattern.compile("[a-zA-Z0-9]*");
        return pattern.matcher(username).matches();
    }

    public static boolean checkPersonId(String personId) {
        return isIdCardValidate(personId);
    }

    public static boolean verifyPhone(String phone) {
        String regex = "^((13[0-9])|(14[5|7])|(15([0-3]|[5-9]))|(17[013678])|(18[0,5-9]))\\d{8}$";
        if (phone.length() != 11) {
            System.out.println("手机号应为11位数");
        } else {
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(phone);
            return m.matches();
        }
        return false;
    }
}

