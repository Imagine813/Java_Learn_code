package com.Styrax.Detali;
/*
继承细节之一：
子类继承了所有的属性和方法，但是父类中私有的属性和方法不可以直接访问，要通过公共的方法去访问
继承细节之二：
子类必须调用父类的构造器，完成父类的初始化
继承细节之三：
当创建子类对象时，不管使用子类哪个构造器，默认总会使用父类的无参构造器。
如果父类没有提供无参构造器，则必须在子类的构造器中用super去指定使用父类哪个构造器完成对父类的初始化。
否则，编译器不会通过。
继承细节之四：
如果希望指定父类的某个构造器，则需要显式地调用一下：super(形参列表)
继承细节之五：
super在使用时，需要放在构造器第一行
继承细节之六：
super()和this()都要放在构造器第一行，因此这两个方法不能同时出现在同一个构造器中
继承细节之七：
Java所有类都是Object类的子类，Object类是所有类的基类
继承细节之八：
父类构造器的调用不限于直接父类，将一直追溯直到Object类（顶级父类）
ctrl+H可以看到类的继承关系
继承细节之九：
一个子类只能最多直接继承一个父类
继承细节之十：
子类和父类的继承要满足is-a，不可滥用继承
比如 cat is an animal
这样才符合逻辑关系
*/

public class ExtendsDetail {
    public static void main(String[] args) {
        //演示细节二和三
        System.out.println("=====The first object=====");
        Base p1 = new Base("Peter",20);
        //这里会输出Derrick，18。虽然构造器没有编写年龄，但是由于super了父类构造器，根据就近原则，输出了1
        System.out.println("=====The second object=====");
        Sub p2 = new Sub("Derrick");
    }
}
