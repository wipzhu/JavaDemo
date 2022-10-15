package com.wipzhu.extenddemo;

public class Employee {
    private String id;
    private String name;
    private double salary;

    public Employee() {

    }

    public Employee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    /**
     * 获取
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * 设置
     * @param salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Employee{id = " + id + ", name = " + name + ", salary = " + salary + "}";
    }

    public void work() {
        System.out.println("员工在工作");
    }

    public void eat() {
        System.out.println("员工在吃米饭");
    }
}
