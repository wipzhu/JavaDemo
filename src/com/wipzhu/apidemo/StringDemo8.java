package com.wipzhu.apidemo;

public class StringDemo8 {
    public static void main(String[] args) {
        //StringBuilder使用
        String s1 = "aaa";
        String s2 = "bbb";
        String s3 = "ccc";
        String s4 = "ddd";
        String s5 = "eee";

        StringBuilder sb = new StringBuilder();

        sb.append("Hello world");
        sb.reverse();
        int len = sb.length();

        System.out.println(len);
        System.out.println(sb);
    }
}
