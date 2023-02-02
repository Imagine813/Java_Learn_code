import java.util.Scanner;

//overload 重载，表示某些不同的方法可以公用一个方法名
//规则：不同方法的形参必须不同，但返回值不做要求
//引入：print和println方法可以输入不同类型值
//形参类型或个数或顺序，至少有一样不同，参数名无要求

public class overload{
	public static void main(String[] args){
		System.out.println("您想输入几个数字，2还是3？");
		Scanner myScanner = new Scanner(System.in);
		char cc = myScanner.next().charAt(0);
		if(cc == '2'){
			System.out.println("请输入第一个数字：");
			double n1 = myScanner.nextDouble();
			System.out.println("请输入第二个数字");
			int n2 = myScanner.nextInt();
			OL01 newCalculate = new OL01();
			double n3 = newCalculate.calculate(n1,n2);
			System.out.println("这两个数字的和是：" + n3);
		}else if(cc == '3'){
			System.out.println("请输入第一个数字：");
			int n1 = myScanner.nextInt();
			System.out.println("请输入第二个数字");
			int n2 = myScanner.nextInt();
			System.out.println("请输入第三个数字");
			int n3 = myScanner.nextInt();
			OL01 newCalculate = new OL01();
			double n4 = newCalculate.calculate(n1,n2,n3);
			System.out.println("这三个数字的和是：" + n4);
		}else{
			System.out.println("Error!无效的输入，请输入2或3！");
		}  
	}//主方法结束
}//公共类结束


class OL01{
	public double calculate(int n1,int n2){
		return n1 + n2;
	}

	public double calculate(double n1,int n2){
		return n1 + n2;
	}

	public double calculate(int n1,double n2){
		return n1 + n2;
	} 

	public double calculate(double n1,double n2,double n3){
		return n1 + n2 + n3;
	}
}

