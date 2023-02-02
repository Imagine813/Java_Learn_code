//使用this来比较两个实例化对象是否相同

public class TestPerson{
	public static void main(String[] args){
		Person p1 = new Person("Styrax",18);
		Person p2 = new Person("Mokie",18);
		System.out.println("p1和p2的比较情况为：" + p1.compareTo(p2));
	}//主方法结束
}//公共类结束

class Person{
	String name;
	int age;

	public Person(String name,int age){
		this.name = name;
		this.age  = age;
	}

	public boolean compareTo(Person p){
		return this.name.equals(p.name) && this.age == p.age;
	}
}//Person类结束