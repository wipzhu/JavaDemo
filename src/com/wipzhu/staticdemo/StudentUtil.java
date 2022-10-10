package com.wipzhu.staticdemo;

import java.util.ArrayList;

public class StudentUtil {
    public static int getMaxAge(ArrayList<Student> list) {
        int sum = 0;
//        int avg = 0;
        int maxAge = list.get(0).getAge();
        for (int i = 1; i < list.size(); i++) {
            int age = list.get(i).getAge();
            sum = sum +age;
            if (maxAge < age) {
                maxAge = age;
            }
        }
//        avg = sum / list.size();

        return maxAge;
    }

}
