package com.Styrax.Detali;

public class Sub extends Base{
    public Sub(String name){
        //因为父类中没有无参构造器，所以如果这里子类编写构造器时没有super，系统会提示报错
        //编写子类构造器时默认总会引用父类构造器，如果没有super语句则默认super.父类无参构造器
        //其实这也体现出了在编写构造器时习惯性编写无参构造器的作用
        super("Styrax",18);
        this.name = name;
        System.out.println("子类构造器Sub(String name)被调用");
        System.out.println(name + "," + age);
    }
}
