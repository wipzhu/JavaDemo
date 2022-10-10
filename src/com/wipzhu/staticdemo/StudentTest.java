package com.wipzhu.staticdemo;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
//        Student.teacherName = "阿伟老师";
//
//        Student s1 = new Student();
//        s1.setName("张三");
//        s1.setAge(23);
//        s1.setGender("男");
//        s1.study();
//        s1.show();
//
//        Student s2 = new Student();
//        s2.setName("李四");
//        s2.setAge(24);
//        s2.setGender("女");
//        s2.study();
//        s2.show();

        ArrayList<Student> list = new ArrayList<>();
        Student stu1 = new Student("张三", 23, "男");
        Student stu2 = new Student("李四", 24, "女");
        Student stu3 = new Student("王五", 25, "男");

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        int maxAge = StudentUtil.getMaxAge(list);
        System.out.println("最大年龄：" + maxAge);

    }
}
