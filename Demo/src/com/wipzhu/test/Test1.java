package com.wipzhu.test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("���������Լ���ʱ�ֶȣ�");
        int myFashion = scanner.nextInt();
        System.out.println("�����������׶����ʱ�ֶȣ�");
        int girlFashion = scanner.nextInt();

        boolean result = myFashion > girlFashion;

        if (result) {
            System.out.println("��ϲ�������׳ɹ���");
        } else {
            System.out.println("���ź���������ʧ�ܣ�");
        }
    }
}
