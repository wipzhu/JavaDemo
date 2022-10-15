package com.wipzhu.extenddemo;

public class EmployeeTest {
    public static void main(String[] args) {
        Manager m = new Manager("heima001", "张三", 15000, 8000);
        String strM = m.toString();

        m.work();
        System.out.println(strM);

        System.out.println("======================");

        Cooker ck = new Cooker();
        ck.setId("heima002");
        ck.setName("李四");
        ck.setSalary(12000);

        ck.work();
        String strC = ck.toString();
        System.out.println(strC);
    }
}
