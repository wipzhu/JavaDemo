package com.wipzhu.polymorphismdemo;

public class Test {
    public static void main(String[] args) {
//        Student s = new Student();
//        s.setName("张三");
//        s.setAge(25);
//
//        Teacher t = new Teacher();
//        t.setName("王建国");
//        t.setAge(42);
//
//        Admin admin = new Admin();
//        admin.setName("管理员");
//        admin.setAge(36);
//
//        register(s);
//        register(t);
//        register(admin);

        //多态：
        // 调用成员变量：编译看左边，运行也看左边
        // 调用成员方法：编译看左边，运行看右边
        Animal a = new Dog();
        System.out.println(a.name);
        a.show();

    }

    public static void register(Person p) {
        p.show();
    }
}
