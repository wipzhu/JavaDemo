package com.wipzhu.loopdemo;

public class Test1 {

    public static void main(String[] args) {
        double paperThick = 0.1;

        double mountHeight = 8844430;

        int count = 0;

        while (paperThick < mountHeight ) {
            paperThick *= 2;
            count++;
        }

        System.out.println("ÕÛµþµÄ´ÎÊý£º" + count);
    }
}
