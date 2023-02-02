package com.Styrax.EncapTest;

//这里来介绍一下encapsulation
//encapsulation，意为封装，是面向对象思想中的一个重要部分
//封装思想可以解读为：对属性进行private化，再创建一个public方法来实现对私有属性的操作/改变
//private是访问修饰符之一，只有同一类可以访问private。
//故可以创建该类的对象，调用该类方法（set，get）来更改私有属性
//package为打包指令，可以将编写程序变成包，好处是避免一定程度的重名方法
//通过import.xx.yy.ss来调用即可
public class Account {
    //将属性统一设置成private
    private String name;
    private double balance;//(有余额的意思)
    private String pwd;

    //创建两个构造器

    public Account() {
    }

    public Account(String name, double balance, String pwd) {
        this.setName(name);
        this.setBalance(balance);
        this.setPwd(pwd);
    }

    public String getName() {
        return name;
    }
    //姓名长度为2-4
    public void setName(String name) {
        if(name.length() >= 2 && name.length() <= 4){
            this.name = name;
        }else {
            System.out.println("名字长度为2-4，现已自动调整为默认名字：张三");
            this.name = "张三";
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance >= 20){
            this.balance = balance;
        }else{
            System.out.println("余额至少为20");
            this.balance = 0.0;
        }
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        if(pwd.length() == 6){
            this.pwd = pwd;
        }else{
            System.out.println("密码必须为六位！已初始化密码：000000");
            this.pwd = "000000";
        }
    }

    public void showInfo(){
        System.out.println("name:" + name + "\n" + "balance:" + balance + "\n" + "Password" + pwd);
    }
}
