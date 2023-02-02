package com.Styrax.Inheritance;
//子类，创建了名为小学生的子类，测试是否可以继承父类的方法
//顺便，在我没有学习方法重写的情况下，我自己研究出来了方法重写，我真是太厉害啦
//纪念一下 2023.1.31 生日快乐
public class Pupil extends Students{
    @Override
    public void setName(String name) {
        super.setName(name);
        System.out.println("小学生"+name+"正在进行数学考试~");
    }

    public static void main(String[] args) {
        Students p1 = new Students();
        p1.setName("晏崽");
        p1.age = 10;
        p1.setScore(100);
        p1.showInfo();
    }//主方法结束
}
