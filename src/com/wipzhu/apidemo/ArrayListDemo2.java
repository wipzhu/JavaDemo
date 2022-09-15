package com.wipzhu.apidemo;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        ArrayList<Character> list = new ArrayList<>();
        ArrayList<String> list = new ArrayList<>();

        list.add("点赞了吗？");
        list.add("收藏了吗？");
        list.add("投币了吗？");
        list.add("转发了吗？");


        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.print(list.get(i));
            } else {
                System.out.print(list.get(i) + ", ");
            }
        }
        System.out.print("]");
    }
}

