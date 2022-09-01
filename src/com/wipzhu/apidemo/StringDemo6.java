package com.wipzhu.apidemo;

public class StringDemo6 {
    public static void main(String[] args) {
        //手机号码脱敏
        String phoneNumber = "17686594592";

        String start = phoneNumber.substring(0,3);
        System.out.println(start);

        String end = phoneNumber.substring(7);

        System.out.println(start + "****" + end);
    }
}
