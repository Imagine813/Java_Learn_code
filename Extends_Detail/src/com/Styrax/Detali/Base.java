package com.Styrax.Detali;

public class Base {
    public int age;
    protected String name;
    private String Sex;

    public Base(String name,int age){
        this.name = name;
        this.age = age;
        System.out.println("父类构造器Base(String name,int age)被调用");
        System.out.println(name + "," + age);
    }
}
