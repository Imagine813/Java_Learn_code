//constructor 意为构造器/构造方法
//构造器的作用：初始化对象的属性
//构造器需要在类中创建相同名字的方法
//类中默认存在一个隐藏起来的无形参构造器，但一旦创造有形参构造器后，这个隐藏起来的构造器将会消失
//构造器由于是方法，故可以重载
//本次任务 创建一个无形参构造器，并初始化age为18；创建一个双形参构造器，并初始化年龄和名字

public class Constructor{
	public static void main(String[] args){
		Person p1 = new Person();
		System.out.println("p1的姓名是：" + p1.name + ",p1的年龄是：" + p1.age);
		Person p2 = new Person("Styrax",18);
		System.out.println("美少女"+ p2.name +"今年"+ p2.age +"岁了");
	}//主方法结束
}//公共类结束

class Person{
	int age;
	String name;

	public Person(){
		age = 18;
	}//构造器1

	public Person(String pName,int pAge){
		name = pName;
		age = pAge;
	}//构造器2
	
}//Person类结束