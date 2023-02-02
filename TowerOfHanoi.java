//汉诺塔的递归实现。
//很难，代码很难理解，需要自己画stack图
//简单介绍思维方式：移动最下面的盘子，需要空余柱子做辅助，这就是递归

public class TowerOfHanoi{
	public static void main(String[] args){
		TOH t1 = new TOH();
		t1.move(3,'A','B','C');
	}//主方法结束
}//公共类结束

class TOH{

	//num表是要移动的个数，a,b,c代表三个柱子
	public void move(int num,char a,char b,char c){
		if(num == 1){
			System.out.println(a + "->" + c);
		}
		else{
			//如果有多个盘，可以看成两个盘，最下面的盘和上面所有的盘（num-1）
			//（1）借助c，移动所有的盘到b
			move(num - 1,a,c,b);
			//（2）把最下面的盘移动到c
			System.out.println(a + "->" + c);
			//（3）再把b盘上所有的盘移动到c盘，借助a盘
			move(num - 1,b,a,c);
		}
	}
}