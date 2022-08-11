package com.wipzhu.loopdemo;

public class Test4 {
    public static void main(String[] args) {
        //封七过
        for (int i = 1; i <= 100; i++) {
            //7的倍数，个位包含7，十位包含7
            if ((i % 7 == 0) || (i % 10 == 7) || (i / 10 % 10 == 7)) {
                System.out.println("过");
                continue;
            }

            System.out.println(i);
        }
    }

}
