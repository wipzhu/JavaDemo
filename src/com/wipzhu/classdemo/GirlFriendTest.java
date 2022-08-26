package com.wipzhu.classdemo;

public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend gf1 = new GirlFriend("小美美", 18, "萌妹子","睡觉");
//        gf1.setName("小美美");
//        gf1.setAge(18);
//        gf1.setGender("萌妹子");
        System.out.println(gf1.getName());
        System.out.println(gf1.getAge());
        System.out.println(gf1.getGender());
        gf1.eat();
        gf1.sleep();

        System.out.println("======================");
//        GirlFriend gf2 = new GirlFriend("小丹丹", 19, "萌妹子");
        GirlFriend gf2 = new GirlFriend();
        gf2.setName("小丹丹");
        gf2.setAge(19);
        gf2.setGender("萌妹子");
        System.out.println(gf2.getName());
        System.out.println(gf2.getAge());
        System.out.println(gf2.getGender());
        gf2.sleep();
        gf2.eat();
    }
}
