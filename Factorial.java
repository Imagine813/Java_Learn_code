import java.util.Scanner; 

//用递归思想实现阶乘，但是大概在stack中会占用很多空间吧 
//第一次写递归 同时也是第一次尝试面向对象。
//但是既然有c语言中函数的基础，应该不是很困难吧

public class Factorial{
	public static void main(String[] args){
		FF F1 = new FF();
		Scanner myScanner = new Scanner(System.in);
		System.out.print("请输入一个正整数：");
		int a = myScanner.nextInt();
		int res = F1.factorial(a);
		System.out.println(a + "的阶乘为：" + res);
	}//主方法结束
}//Factorial公共类结束

class FF{
	public int factorial(int n){
		if(n == 1){
			return 1;
		}
		else{
			return factorial(n-1)*n;
		}
	}//递归实现阶乘方法
}//faction factorial,简称FF类


/*  测试结果显示，
    输入的整数最大值为31，
	当输入32时输出结果变为负数，
	当输入33以上的数字时结果变为0
	判断是与int的范围有关  		*/