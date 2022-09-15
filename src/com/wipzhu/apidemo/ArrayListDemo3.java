package com.wipzhu.apidemo;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

//        Student s1 = new Student("张三", 23);
//        Student s2 = new Student("李四", 24);
//        Student s3 = new Student("王五", 25);
//
//        list.add(s1);
//        list.add(s2);
//        list.add(s3);
//
//        for (int i = 0; i < list.size(); i++) {
//            Student stu = list.get(i);
//            System.out.println(stu.getName() + "：" + stu.getAge());
//        }

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            Student stu = new Student();

            System.out.println("请输入学生姓名：");
            String name = sc.next();
            stu.setName(name);

            System.out.println("请输入学生年龄：");
            int age = sc.nextInt();
            stu.setAge(age);

            list.add(stu);
        }

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName() + "：" + stu.getAge());
        }
    }
}
