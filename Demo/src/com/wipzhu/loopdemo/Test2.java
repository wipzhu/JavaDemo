package com.wipzhu.loopdemo;

import java.util.Scanner;

/**
 * �ж�һ�������ǲ��ǻ�����
 */
public class Test2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������һ���������ж��ǲ��ǻ�������");
        int x = sc.nextInt();
        // ��¼xԭʼֵ���������ıȽ�
        int temp = x;
        // ��¼x��ת֮���ֵ
        int num = 0;

        while (x != 0) {
            // ��������ȡÿһ������
            int g = x % 10;
            // ȡ�����һλ����֮�����¸�x��ֵ
            // ����/�������Ϊ������������������
            x /= 10;
            // �ѵ�ǰȡ��������ƴ�ӵ�����
            num = num * 10 + g;
        }
        String flag = (num == temp) ? "�������ǻ�����" : "�����ֲ��ǻ�����";
        System.out.println(temp + "===>" + flag);
    }
}
