package com.wipzhu.apidemo;

import java.util.ArrayList;

public class ArrayListDemo4 {
    public static void main(String[] args)  {
        ArrayList<User> list = new ArrayList<>();

        User u1 = new User("heima001", "zhangsan", "123456");
        User u2 = new User("heima002", "lisi", "12345678");
        User u3 = new User("heima003", "wangwu", "qweasd11");

        list.add(u1);
        list.add(u2);
        list.add(u3);

        boolean flag = contains(list, "heima006");
        System.out.println(flag);
    }

    public static boolean contains(ArrayList<User> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                return true;
            }
        }

        return false;
    }

}
