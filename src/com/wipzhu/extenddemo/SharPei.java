package com.wipzhu.extenddemo;

public class SharPei extends Dog{
    String name = "沙皮狗";

    @Override
    public void eat() {
        super.eat();
        System.out.println(this.name + "在啃骨头");
    }
}
