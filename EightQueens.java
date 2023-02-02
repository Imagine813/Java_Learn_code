//试图写明白八皇后，这是首次尝试不看他人代码写出来递归
//八皇后思路：设置二维数组，利用回溯算法
//将第一个皇后放在0，0位置上，接着将第二个皇后放在1，0位置上
//判断1，0位置合适与否。如果不行，则调整位置
//使用if判断语句，判断所有的皇后是否不属于同一排，同一列，同一斜线上
//或者参考迷宫，将一个皇后标记为之后设置成2，该皇后的行，列，斜线全部标记为3
//判断第二个皇后的位置是否为3，如果是3，则接着找。
//因为八个皇后必然不属于同一排，所以每次皇后确定位置之后即可换行，然后列数+1寻找
//类似于迷宫里面的先下再右

//注释更新 2023.1.21
//并没有想出来如何使用递归来解决八皇后问题，c也一样，java也一样
//于是参考了csdn上的代码，下面要进行代码复制，并在接下来一段时间里认真琢磨

import java.util.Scanner;

public class EightQueens{
	public static void main(String[] args){
		EQ t = new EQ();
		int map[] = new int[8];
		t.putQueen(map,0);
		System.out.println("八皇后问题一共有" + t.count +"情况");


	}//主方法结束
}//公共类结束

class EQ{
	//验证功能:判断棋子放在第几行 是否符合八皇后的规则： 与其他棋子 不能同列 不能同行 不能同一斜线
	//如果符合八皇后游戏规则 返回 true 否则 返回false 使用boolean返回类型
	// arr 表示棋盘 n 表示放入棋子在第n+1行 arr[n] 表示放入棋子在第 arr[n] + 1列
	public boolean verify(int arr[],int n){
		for (int i = 0;i < n ;i++ ) {
			if (arr[n] == arr[i] || Math.abs(n - i) == Math.abs(arr[n] - arr[i])) {
				return false;
			}
		}
 
		return true;
	}
 
	//八皇后棋子放置策略：
	//用一维数组arr 表示棋盘 i 表示初始棋子放置棋盘第i+1行 
	//arr[i] 表示棋盘第arr[i]+1列
	//设置递归的出口 当棋子放到第8行 验证成功时 即 verify(arr,7) 返回true
	//打印八皇后放置棋子的8个位置
	
	int count = 0;//全局变量
	public void putQueen(int[] arr,int i){
		if (verify(arr,7)) {
 
			count++;
			System.out.println("\n第" + count + "种：");
			System.out.println("arr 数组：");
			//打印 符合条件的 arr[] 数组
			array(arr);
			
		}else{
 
			for (int j = 0;j < 8 ;j++ ) {
				//j 表示列  循环遍历 第0-7列 
				arr[i] = j;
				//验证是否符合八皇后规则
				if (verify(arr,i)) {
					//如果 验证返回true 则 递归调用 putQueen()方法
					//继续 放置下一行的棋子位置(行和列：i 和 j) 并验证 位置是否符合八皇后规则
					putQueen(arr,i + 1);	
				}
			}
			//如果 行为第i+1行 棋子 循环遍历 放置0——7列 
			//都不符合八皇后规则 即 verify(arr,i) 返回false
			//则 不会执行 if里面的语句 putQueen(arr,i+1);
			//即 不会继续下一行 放置棋子 而是回溯到 for语句
			//继续遍历 数组列表 即 这一行的第2列
		}
	}
 
		//一维数组变二维数组 并打印相对应的图形
		public void array(int[] arr){
 
			char[][] arr1 = new char[arr.length][arr.length];
			for (int i = 0;i < arr1.length ;i++ ) {
				for (int j = 0;j <arr1[i].length;j++ ) {
					arr1[i][j] = '*';
					arr1[i][arr[i]] = 'Q';
 
					System.out.print(arr1[i][j] + " ");
				}
				System.out.println();
			}
 
		}
 
	
 
}
