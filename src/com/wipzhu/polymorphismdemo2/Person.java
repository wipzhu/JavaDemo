package com.wipzhu.polymorphismdemo2;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Person{name = " + name + ", age = " + age + "}";
    }

//    public void keepPet(Dog d, String sth) {
//        System.out.println("年龄为" + getAge() + "的" + getName() + "养了一只" + d.getColor() + "颜色的" + d.getAge() + "岁的狗");
//        d.eat(sth);
//    }
//
//    public void keepPet(Cat c, String sth) {
//        System.out.println("年龄为" + getAge() + "的" + getName() + "养了一只" + c.getColor() + "颜色的" + c.getAge() + "岁的猫");
//        c.eat(sth);
//    }

    public void keepPet(Animal a, String sth) {
        if (a instanceof Dog d) {
            System.out.println("年龄为" + getAge() + "的" + getName() + "养了一只" + d.getColor() + "颜色的" + d.getAge() + "岁的狗");
        } else if (a instanceof Cat c) {
            System.out.println("年龄为" + getAge() + "的" + getName() + "养了一只" + c.getColor() + "颜色的" + c.getAge() + "岁的猫");
        } else {
            System.out.println("没有这种类型");
            return;
        }
        a.eat(sth);
    }
}
