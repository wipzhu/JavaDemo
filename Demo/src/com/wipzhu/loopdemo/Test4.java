package com.wipzhu.loopdemo;

public class Test4 {
    public static void main(String[] args) {
        //���߹�
        for (int i = 1; i <= 100; i++) {
            //7�ı�������λ����7��ʮλ����7
            if ((i % 7 == 0) || (i % 10 == 7) || (i / 10 % 10 == 7)) {
                System.out.println("��");
                continue;
            }

            System.out.println(i);
        }
    }

}
