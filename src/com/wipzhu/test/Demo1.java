package com.wipzhu.test;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        /*卖机票：输入机票原价，淡旺季，折扣力度，计算现价*/
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票原价：");
        int ticket = sc.nextInt();
        System.out.println("请输入月份：");
        int month = sc.nextInt();
        System.out.println("请输入机票坐席：0-头等舱 1-经济舱");
        int seat = sc.nextInt();

        if (month >= 5 && month <= 10) {
            // 旺季
            ticket = getTicket(seat, ticket, 0.9, 0.85);
//            ticket = getTicketBySeatAndMonth(ticket, seat, 0.9, 0.85);
        } else if ((month >= 1 && month <= 4) || (month >= 11 && month <= 12)) {
            // 淡季
            ticket = getTicket(seat, ticket, 0.7, 0.65);
        } else {
            System.out.println("输入的月份不合法！");
        }
        System.out.println("机票现在的价格是：" + ticket);
    }

    /**
     * ctrl + alt + m 抽取方法
     * @param seat
     * @param ticket
     * @param x
     * @param x1
     * @return int
     */
    private static int getTicket(int seat, int ticket, double x, double x1) {
        if (seat == 0) {
            ticket = (int) (ticket * x);
        } else if (seat == 1) {
            ticket = (int) (ticket * x1);
        } else {
            System.out.println("没有这个舱位");
        }
        return ticket;
    }

//    public static int getTicketBySeatAndMonth(int ticket, int seat, double v0,double v1) {
//        if (seat == 0) {
//            ticket = (int) (ticket * v0);
//        } else if (seat == 1) {
//            ticket = (int) (ticket * v1);
//        } else {
//            System.out.println("没有这个舱位");
//        }
//
//        return ticket;
//    }
}
