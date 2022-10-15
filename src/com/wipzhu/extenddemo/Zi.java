package com.wipzhu.extenddemo;

public class Zi extends Fu{
    String name = "Zi";

    public void ziShow() {
        String name = "ZiShow";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
}
