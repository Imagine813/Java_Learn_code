public class Test{
	public static void main(String[] args){
		Circle c1 = new Circle();
		PassObject o1 = new PassObject();
		o1.printAreas(c1,5);
	}//主方法结束
}//公共类结束

class Circle{
	double radius;
	public double findArea(){
		return Math.PI * this.radius * this.radius;
	}
}

class PassObject{
	public void printAreas(Circle c,int times){
		System.out.println("Radius \tArea \t");
		for(double i = 1;i <= times;i++){
			c.radius = i;
			System.out.println(c.radius + " \t" + c.findArea() + " \t");
		}
	}
}

//2023.1.26
//爽到。this弄明白了，编写方法也写明白了。
//接下来就是IDEA的世界了
//估计以后很少会用到Sublime了，虽然确实挺好用的。