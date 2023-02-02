package com.Styrax.Inheritance;

//inheritance，继承，是面向对象思想的第二大特点。
//通过编写父类，可以使多个子类来调用，这样可以提高代码的可替换性和可维护性。
//比如，许多平行类拥有许多共同或相似的属性或方法，则可以通过继承思想来减少代码量
public class Students {
    public int age;
    public String name;
    private int score;
    //编写一个无参构造器
    public Students() {
    }
    //编写一个三个参数的构造器
    public Students(int age,String name,int score){
        this.age = age;
        this.setName(name);
        this.score = score;
    }

    //设置传递参数方法
    public void setName(String name){
        this.name = name;
    }
    public void showInfo(){
        System.out.println("姓名：" + name +" 年龄：" + age + " 分数：" + score);
    }

    public void setScore(int score) {
        this.score = score;
    }
}
