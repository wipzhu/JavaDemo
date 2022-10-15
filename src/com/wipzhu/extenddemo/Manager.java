package com.wipzhu.extenddemo;

public class Manager extends Employee{
    private double bonus;

    public Manager() {
    }

    public Manager(String id, String name, double salary, double bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String toString() {
        return "Employee{id = " + getId() + ", name = " + getName() + ", salary = " + getSalary() +", bonus = " + getBonus() + "}";
    }

    @Override
    public void work() {
        System.out.println("经理正在管理其他人");
    }
}
