package com.wipzhu.apidemo;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("wipzhu");
        list.add("aaaaaa");
        list.add("vvvvvv");
        list.add("bbbbbbb");

//        boolean flag = list.remove("aaaaaa");
//        String item = list.remove(1);
//        System.out.println(flag);
//        System.out.println(item);

        String result = list.set(1, "abcdefg");
        System.out.println(result);

        String res = list.get(2);
        System.out.println(res);

        int length =  list.size();
        for (int i = 0; i < length; i++) {
            System.out.println(list.get(i));
        }
        
        System.out.println(list);
    }
}

