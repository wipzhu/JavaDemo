package com.wipzhu.test;

import java.util.Arrays;
import java.util.Scanner;


public class Test4 {
    public static void main(String[] args) {
        // 评委打分,去掉最高分,最低分剩余的求平均
        int max = 0;
        int min = 0;
        int sum = 0;
        int avg = 0;
        int[] scores = new int[6];
        scores = getScores();

//        for (int i = 0; i < scores.length; i++) {
//            System.out.println(scores[i]);
//        }

        max = getMax(scores);
        System.out.println(max);

        min = getMin(scores);
        System.out.println(min);

        // 求和
        sum = Arrays.stream(scores).sum();
        System.out.println(sum);

        avg = (sum - max -min)/(scores.length - 2);
        System.out.println(avg);
    }

    // 获取分数数组
    public static int[] getScores() {
        int[] scores = new int[6];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; ) {
            System.out.println("请输入第" + (i + 1) + "个分数");

            int score = sc.nextInt();
            if (score >= 0 && score <= 100) {
                scores[i] = score;
                i++;
            }
        }

        return scores;
    }

    /**
     * 获取最大值
     *
     * @param arr
     * @return
     */
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    /**
     * 获取最小值
     *
     * @param arr
     * @return
     */
    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }
}
