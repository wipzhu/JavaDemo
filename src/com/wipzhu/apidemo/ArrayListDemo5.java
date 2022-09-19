package com.wipzhu.apidemo;

import java.util.ArrayList;

public class ArrayListDemo5 {
    public static void main(String[] args) {
        ArrayList<Phone> list = new ArrayList<>();

        Phone p1 = new Phone("小米", 1699);
        Phone p2 = new Phone("苹果", 6299);
        Phone p3 = new Phone("锤子", 2999);
        Phone p4 = new Phone("华为", 2499);

        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);

        ArrayList<Phone> phoneInfoList = getPhoneInfo(list);
        for (int i = 0; i < phoneInfoList.size(); i++) {
            Phone p = phoneInfoList.get(i);
            System.out.println(p.getBrand() + "," + p.getPrice());
        }
    }

    public static ArrayList<Phone> getPhoneInfo(ArrayList<Phone> list) {
        ArrayList<Phone> result = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            Phone p = list.get(i);
            if (p.getPrice() < 3000) {
                result.add(p);
            }
        }

        return result;
    }
}
