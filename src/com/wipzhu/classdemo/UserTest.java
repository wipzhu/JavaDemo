package com.wipzhu.classdemo;

public class UserTest {
    public static void main(String[] args) {
        User user1 = new User();
        user1.setUserName("阿强");
        User user2 = user1;// 地址引用
        user2.setUserName("阿珍");

        System.out.println(user1.getUserName() + "===" + user2.getUserName());
    }
}
