package com.wipzhu.studentsystem;

import java.util.ArrayList;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        getCaptcha();
    }

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
//        String res = new String(chars);
//        System.out.println(res);
        return new String(chars);
    }
}
