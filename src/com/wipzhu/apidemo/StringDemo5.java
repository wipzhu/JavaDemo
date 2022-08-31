package com.wipzhu.apidemo;

import java.util.Scanner;

public class StringDemo5 {
    public static void main(String[] args) {
        //输入字符串转换成大写的金额

        //1、输入金额
        int money;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入一个金额：");
            money = sc.nextInt();
            if (money >= 0 && money <= 9999999) {
                break;
            } else {
                System.out.println("金额无效[0,9999999]，请重新输入！");
            }
        }

        //2、转成大写中文并拼接
        String moneyStr = "";
        while (true) {
            int ge = money % 10;// 取出末尾的数字
            //System.out.println(ge);

            // 把数字转换成大写中文
            String capitalNumber = getCapitalNumber(ge);
            //System.out.println(capitalNumber);
            moneyStr = capitalNumber + moneyStr;//倒序拼接

            money = money / 10;// 去掉末尾的数字

            if (money == 0) {
                break;
            }
        }

        //3、在前边补0，补齐7位
        int zeroCount = 7 - moneyStr.length();

        for (int i = 0; i < zeroCount; i++) {
            moneyStr = getCapitalNumber(0) + moneyStr;
        }

        String result = "";
        // 4、插入单位
        String[] unitArr = {"佰", "拾", "萬", "仟","佰", "拾","圆"};
        for (int i = 0; i < moneyStr.length(); i++) {
//            System.out.print(unitArr[i]);
//            System.out.print(moneyStr.charAt(i));
//            System.out.println("");
            result =  result + moneyStr.charAt(i) + unitArr[i];
        }


        System.out.println(result);
    }

    /**
     * 获取大写汉字
     * @param number
     * @return
     */
    public static String getCapitalNumber(int number) {
        String[] upperCaseArr = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        return upperCaseArr[number];
    }

}
