package com.wipzhu.studentsystem;

import java.util.ArrayList;
import java.util.Random;
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
        Scanner sc = new Scanner(System.in);
        int errorNum = 3;

        System.out.println("请输入用户名：");
        String username = sc.next();
        int usernameIndex = getUsernameIndex(list, username);
        if (usernameIndex < 0) {
            System.out.println("用户名不存在，请先注册");
            return;
        }

        while (true) {
            String captcha = getCaptcha();
            System.out.println("当前的验证码为：" + captcha);
            System.out.println("请输入验证码：");
            String inputCaptcha = sc.next();
            if (captcha.equalsIgnoreCase(inputCaptcha)) {
                break;
            } else {
                System.out.println("验证码错误，请重新输入");
            }
        }

        User loginUser = list.get(usernameIndex);
        while (true) {
            System.out.println("请输入密码：");
            String password = sc.next();
            if (!password.equals(loginUser.getPassword())) {
                errorNum--;
                if (errorNum == 0) {
                    System.out.println("账号已被锁定，请联系管理员");
                    return;
                }
                System.out.println("密码错误，请重新输入，还有" + errorNum + "次机会");
            } else {
                break;
            }
        }

        System.out.println("恭喜，登录成功，可以开始使用学生管理系统了！");

        //创建对象，调用方法，启动学生管理系统
        StudentManage sm = new StudentManage();
        sm.startStudentManage();
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

            int index = getUsernameIndex(list, username);
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
        printRegisteredUser(list);
    }

    public static void forgetPassword(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入用户名：");
        String username = sc.next();
        int usernameIndex = getUsernameIndex(list, username);
        if (usernameIndex < 0) {
            System.out.println("用户名不存在，请先注册");
            return;
        }

        User u = list.get(usernameIndex);

        System.out.println("请输入身份证号码：");
        String personId = sc.next();
        System.out.println("请输入手机号码：");
        String phoneNumber = sc.next();

        if (!u.getPersonId().equals(personId) || !u.getPhoneNumber().equals(phoneNumber)) {
            System.out.println("身份证号码或者手机号码不匹配！");
            return;
        }

        String password, againPassword = null;
        while (true) {
            System.out.println("请输入密码：");
            password = sc.next();
            System.out.println("请输入确认密码：");
            againPassword = sc.next();
            if (!againPassword.equals(password)) {
                System.out.println("两次密码不一致，请重新输入");
            } else {
                break;
            }
        }

        u.setPassword(password);
        System.out.println("密码修改成功！");
        printRegisteredUser(list);
    }

    /**
     * 获取用户名索引
     * @param list
     * @param username
     * @return
     */
    public static int getUsernameIndex(ArrayList<User> list, String username) {
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

    /**
     * 校验手机号码合法性
     * @param phone
     * @return
     */
    public static boolean verifyPhone(String phone) {
        String regex = "^((13[0-9])|(14[5|7])|(15([0-3]|[5-9]))|(17[013678])|(18[0-9]))\\d{8}$";
        if (phone.length() != 11) {
            System.out.println("手机号应为11位数");
        } else {
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(phone);
            return m.matches();
        }
        return false;
    }

    /**
     * 生成验证码
     *
     * @return
     */
    public static String getCaptcha() {
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            list.add((char) ('a' + i));
            list.add((char) ('A' + i));
        }

        //随机抽取4个字母
        StringBuilder sb = new StringBuilder();
        Random rd = new Random();
        for (int i = 0; i < 4; i++) {
            int index = rd.nextInt(list.size());
            char c = list.get(index);

            sb.append(c);
        }

        //随机生成一位数字
        int number = rd.nextInt(10);
        sb.append(number);

        //将数字随机插入前几位字符串
        char[] chars = sb.toString().toCharArray();
        int randomIndex = rd.nextInt(chars.length);
        char temp = chars[randomIndex];
        chars[randomIndex] = chars[chars.length - 1];
        chars[chars.length - 1] = temp;
//        StringBuilder sb1 = new StringBuilder();
//        for (int i = 0; i < chars.length; i++) {
//            sb1.append(chars[i]);
//        }
//        return sb1.toString();
        return new String(chars);
    }

    /**
     * 输出注册用户信息
     * @param list
     */
    public static void printRegisteredUser(ArrayList<User> list) {
        for (int i = 0; i < list.size(); i++) {
            User registeredUser = list.get(i);
            System.out.println(registeredUser.getUsername() + ", " + registeredUser.getPassword()
                    + ", " + registeredUser.getPersonId() + ", " + registeredUser.getPhoneNumber());
        }
    }
}

