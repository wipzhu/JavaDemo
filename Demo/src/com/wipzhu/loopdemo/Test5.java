package com.wipzhu.loopdemo;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        //������
        Scanner sc = new Scanner(System.in);
        System.out.println("������һ����������");
        int maxInt = sc.nextInt();

        boolean flag = true;// �Ƿ�������
        for (int i = 2; i < maxInt; i++) {
            //�ж������ڣ�maxInt�ܷ�i���������û����������
            if (maxInt % i == 0) {
                flag = false;
                break;
            }
        }
        System.out.println(maxInt + (flag ? "������" : "��������"));

        // �Ż�����
        // һ�����������������ô[2,�����������ƽ����]������������ܱ����������
        /*for (int i = 2; i <= �����������ƽ����; i++) {
        }*/
    }

}
