package com.wipzhu.arraydemo;

public class Demo2 {
    public static void main(String[] args) {
        int[] fightPower = {22, 43, 45, 6, 32, 18};

        int max = fightPower[0];

        for (int i = 1; i < fightPower.length; i++) {
            if (fightPower[i] > max) {
                max = fightPower[i];
            }
        }

        System.out.println("最大值是：" + max);
    }
}
