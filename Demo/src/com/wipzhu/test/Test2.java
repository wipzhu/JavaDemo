package com.wipzhu.test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {

        // ���������������һ��6�������������ĺ���6�ı������Ϊtrue������Ϊfalse
        Scanner scanner = new Scanner(System.in);

        System.out.println("������һ��������");
        int a = scanner.nextInt();
        System.out.println("��������һ��������");
        int b = scanner.nextInt();

        System.out.println(a == 6 || b ==6 || ((a + b) % 6 == 0));
    }
}
