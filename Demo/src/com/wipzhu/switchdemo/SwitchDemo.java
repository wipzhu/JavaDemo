package com.wipzhu.switchdemo;

import java.util.Scanner;

public class SwitchDemo {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("������һ��������");
//        int number = sc.nextInt();
//
//        switch (number) {
//            case 1 -> {
//                System.out.println("�������ֵ��1");
//            }
//            case 20 -> System.out.println("�������ֵ��20");
//            default -> System.out.println("û�����ѡ��");
//        }

//        Scanner sc = new Scanner(System.in);
//        System.out.println("��������������ڼ�");
//        int week = sc.nextInt();
//
//        switch (week) {
//            case 1,2,3,4,5 -> System.out.println("�����ǹ�����");
//
//            case 6,7 -> System.out.println("��������Ϣ��");
//            default -> System.out.println("û���������");
//
//        }

        Scanner sc = new Scanner(System.in);
        System.out.println("������һ��������ʾ����ѡ��");

        int choose = sc.nextInt();

        switch (choose) {
            case 1 -> System.out.println("��Ʊ��ѯ");
            case 2 -> System.out.println("��ƱԤ��");
            case 3-> System.out.println("��Ʊ��ǩ");
//            case 4 -> System.out.println("�˳�����");
            default -> System.out.println("�˳�����");
        }
    }
}
