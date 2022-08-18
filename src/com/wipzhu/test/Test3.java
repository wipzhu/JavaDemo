package com.wipzhu.test;

import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        //随机生成长度为5的验证码，前4为是大小写字母，最后一位是数字

        char[] chs = new char[52];

        //给数组赋值
        for (int i = 0; i < chs.length; i++) {
            if (i < (chs . length/ 2) ) {
                chs[i] = (char)(97 + i); // a-z
            } else {
                chs[i] = (char)(65 + i -26);
            }
        }

        //遍历数组，生成验证码
        Random rd = new Random();
        String cpt = "";
        for (int i = 0; i < 4; i++) {
            int index = rd.nextInt(chs.length);
            cpt = cpt + chs[index];
        }
        System.out.print(cpt + rd.nextInt(10));


    }
}
