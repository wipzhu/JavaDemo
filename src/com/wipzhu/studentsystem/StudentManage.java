package com.wipzhu.studentsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManage {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        loop:while (true) {
            System.out.println("------------------欢迎来到学生管理系统-----------------");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查询学生");
            System.out.println("5.退出");
            System.out.println("请输入您的选择：");

            Scanner sc = new Scanner(System.in);
            String choose = sc.next();

            switch (choose) {
                case "1" -> addStudent(list);
                case "2" -> deleteStudent(list);
                case "3" -> updateStudent(list);
                case "4" -> queryStudent(list);
                case "5" -> {
                    //break loop;
                    System.exit(0);//停止虚拟机运行
                }
                default -> System.out.println("没有这个选项！");
            }
        }
    }

    public static void addStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();

        String id = null;
        while (true) {
            System.out.println("请输入学生ID：");
            id = sc.next();
            // 检查ID是否已经存在
            boolean exists = checkIdExists(list, id);
            if (exists) {
                System.out.println("当前ID已存在，请重新输入！");
            } else {
                s.setId(id);
                break;
            }
        }

        System.out.println("请输入学生姓名：");
        String name = sc.next();
        s.setName(name);

        System.out.println("请输入学生年龄：");
        int age = sc.nextInt();
        s.setAge(age);

        System.out.println("请输入学生家庭住址：");
        String address = sc.next();
        s.setAddress(address);

        list.add(s);
        System.out.println("学生信息添加成功！");
    }

    public static void deleteStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入要删除的ID：");
        String id = sc.next();

        int index = getIndex(list, id);
        if (index >= 0) {
            //删除
            list.remove(index);
            System.out.println("ID为" + id + "的学生删除成功!");
        } else {
            System.out.println("ID不存在，删除失败！");
        }
    }

    public static void updateStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的ID：");
        String id = sc.next();

        int index = getIndex(list, id);
        if (index < 0) {
            System.out.println("ID不存在，无法修改！");
        } else {
            Student s = list.get(index);

            System.out.println("请输入学生姓名：");
            String newName = sc.next();
            s.setName(newName);

            System.out.println("请输入学生年龄：");
            int newAge = sc.nextInt();
            s.setAge(newAge);

            System.out.println("请输入学生家庭住址：");
            String newAddress = sc.next();
            s.setAddress(newAddress);
        }
    }

    public static void queryStudent(ArrayList<Student> list) {
        if (list.size() == 0) {
            System.out.println("当前无学生信息，请添加后再查询！");
            return;
        }

        System.out.println("id\tname\tage\taddress");
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t" + stu.getAddress());
        }
    }

    public static boolean checkIdExists(ArrayList<Student> list, String id) {
//        for (int i = 0; i < list.size(); i++) {
//            Student s = list.get(i);
//            if (id.equals(s.getId())) {
//                return  true;
//            }
//        }
//        return false;

        return getIndex(list, id) >= 0;
    }

    public static int getIndex(ArrayList<Student> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            if (s.getId().equals(id)) {
                return i;
            }
        }

        return -1;
    }
}
