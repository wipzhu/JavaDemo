package com.wipzhu.arraydemo;

public class Demo1 {
    public static void main(String[] args) {
        int[] ages = {1,2,3,4,5};

        String[] names = {"小明","张三","小花","小刚","小红"};

        double[] height = {1.82,1.78,1.84,1.73};

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        double sum = 0;
        for (int i = 0; i < height.length; i++) {
            sum += height[i];
        }

        System.out.println(sum);
    }

}

