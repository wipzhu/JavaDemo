package com.wipzhu.loopdemo;

import java.util.Scanner;

public class forDemo {
    public static void main(String[] args) {
//        for (int i = 1; i <= 10; i++) {
//            System.out.println("��ǰֵ�ǣ�" + i);
//        }
//
//        System.out.println('\n');
//
//        for (int i = 10; i >= 1;i--) {
//            System.out.println("��ǰֵ�ǣ�" + i);
//        }

//        int sum = 0;
//        for (int i = 1; i <= 100; i++) {
//            if (i % 2 == 0) sum += i;
//        }
//
//        System.out.println("1��100��ż����ͣ�" + sum);

        Scanner sc = new Scanner(System.in);
        System.out.println("�������һ��������");
        int a = sc.nextInt();
        System.out.println("������ڶ���������");
        int b = sc.nextInt();

        int num = 0, sum = 0;
        for (int i = a; i <= b; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                num += 1;
                sum += i;
            }
        }
        System.out.println(a + "��" + b + "֮�乲��" + num + "������ͬʱ��3��5����");
        System.out.println("��Щ���ĺ��ǣ�" + sum);


    }
}
