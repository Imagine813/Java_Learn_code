//this关键字的使用
//在构造器中，可以使用this.属性来初始化
//可以在同一个类中，一个构造器中使用this（形参）来访问另一个构造器，但this语句必须放在构造器第一行
//this可以用来区分局部变量和当前类属性
//this.成员方法（形参）可以访问成员方法。这个暂时不展示，因为后面的继承会学到
//本程序中会将以上所有说明都表示出来

public class This{
	public static void main(String[] args){
		Person p1 = new Person("Styrax",18);
		System.out.println("美少女" + p1.name + "的年龄是" + p1.age);
		Person p2 = new Person();
		p2.PP();
	}//主方法结束
}//公共类结束

class Person{
	String name = "Peter";
	int age;

	public Person(String name,int age){
		this();
		this.name = name;
		this.age = age;
	}

	public Person(){
		System.out.println("构造方法Person()被调用");
	}

	public void PP(){
		String name = "Jack";
		System.out.println("PP方法内的局部变量name为：" + name);
		System.out.println("Person类中的属性name为：" + this.name);

	}
}//Person类结束


/*=====程序编写日志2023.1.25=====*/
/*	
在尝试使用this区分属性和局部变量时失败了，可能是出现了一些bug
浏览了中文互联网论坛以及Stackoverflow，断定不是语法问题
所以大概是jdk19的bug，只能期待后续的升级
之后会使用eclipse或者IDEA再尝试一遍本程序	
*/






/*=====程序编写日志2023.1.26=====*/
/*
我真蠢，真的
我应该想到画一个uml类图来看看自己程序运行情况的
PP()方法中如果不加String前缀的话，就是在p2指向的heap中开辟的内存中，将该内存name变量改为了Jack
而非创建stack中创建局部变量
解决方法：String name = "Jack"
更改之前：name = "Jack"
*/