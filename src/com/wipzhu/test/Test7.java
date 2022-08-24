package com.wipzhu.test;

import java.util.Random;
import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        // 双色球，7个号码，6个红色(1-33)，1个蓝色(1-16)
        // 生成中奖号码
        int[] arr = createNumber();
        System.out.println("============================");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        System.out.println("============================");

        // 用户输入彩票号码
        int[] userInputArr = inputUserNumber();

        // 判断中奖情况
        int redCount = 0;
        int blueCount = 0;
        // 判断红球，userInputArr.length-1
        for (int i = 0; i < (userInputArr.length - 1); i++) {
            int redNumber = userInputArr[i];
            for (int j = 0; j < (arr.length - 1); j++) {
                if (redNumber == arr[j]) {
                    redCount++;
                    // 跳出循环，判断下一个红球是否中奖
                    break;
                }
            }
        }
        //判断蓝球
        int blueNumber = userInputArr[userInputArr.length - 1];
        if (blueNumber == arr[arr.length - 1]) {
            blueCount++;
        }

        System.out.println("红球中奖个数：" + redCount);
        System.out.println("蓝球中奖个数：" + blueCount);

        if (redCount == 6 && blueCount == 1) {
            System.out.println("恭喜您，中一等奖，奖1000万");
        } else if (redCount == 6 && blueCount == 0) {
            System.out.println("恭喜您，中二等奖，奖500万");
        } else if (redCount == 5 && blueCount == 1) {
            System.out.println("恭喜您，中三等奖，奖3000元");
        } else if ((redCount == 5 && blueCount == 0) || (redCount == 4 && blueCount == 1)) {
            System.out.println("恭喜您，中四等奖，奖200元");
        } else if ((redCount == 4 && blueCount == 0) || (redCount == 3 && blueCount == 1)) {
            System.out.println("恭喜您，中五等奖，奖10元");
        } else if ((redCount == 2 && blueCount == 1) || (redCount == 1 && blueCount == 1) || (redCount == 0 && blueCount == 1)) {
            System.out.println("恭喜您，中六等奖，奖5元");
        } else {
            System.out.println("很遗憾，您没有中奖，谢谢参与！");
        }

    }

    /**
     * 用户购买的号码
     *
     * @return
     */
    public static int[] inputUserNumber() {
        int[] arr = new int[7];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; ) {
            System.out.println("请输入第" + (i + 1) + "个红球号码：");
            int redNumber = sc.nextInt();
            if (redNumber >= 1 && redNumber <= 33) {
                if (contains(arr, redNumber)) {
                    System.out.println("号码重复，请重新输入！");
                    continue;
                }
            } else {
                System.out.println("红球号码超出范围，请重新输入！");
                continue;
            }
            arr[i] = redNumber;
            i++;
        }

        System.out.println("请输入蓝球号码：");
        while (true) {
            int blueNumber = sc.nextInt();
            if (blueNumber >= 1 && blueNumber <= 16) {
                arr[6] = blueNumber;
                break;
            } else {
                System.out.println("蓝球号码超出范围，请重新输入！");
            }
        }

        return arr;
    }

    /**
     * 生成开奖号码
     *
     * @return
     */
    public static int[] createNumber() {
        int[] arr = new int[7];

        // 生成红球号码，添加到数组中
        Random rd = new Random();
        for (int i = 0; i < 6; ) {
            int redNumber = rd.nextInt(33) + 1;
            if (contains(arr, redNumber)) {
                continue;
            }
            arr[i] = redNumber;
            i++;
        }
        // 生成蓝球号码，添加到数组中
        int blueNumber = rd.nextInt(16) + 1;
        arr[6] = blueNumber;

        return arr;
    }

    /**
     * 判断号码是否已经存在
     *
     * @param arr
     * @param number
     * @return
     */
    public static boolean contains(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return true;
            }
        }
        return false;
    }
}
