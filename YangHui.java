import java.util.Scanner;



//简简单单写一个5层的杨辉三角
public class YangHui{
	public static void main(String[] args){
		int yangHui[][] = new int[5][];//创建杨辉三角的动态二维数组，第一个中括号可以改变，表示层数
		for(int i = 0;i < yangHui.length;i++){
			yangHui[i] = new int[i+1];//为一维数组开辟空间（很重要，经常弄错）
			for(int j = 0;j < yangHui[i].length;j++){
				if(j == 0||j == yangHui[i].length - 1){
					yangHui[i][j] = 1;
				}//表示杨辉三角的每一行的第一个数字和最后一个数字都是1
				else{
					yangHui[i][j] = yangHui[i-1][j] + yangHui[i-1][j-1];//表示杨辉三角的一般情况，三角加和
				}
			}
		}//最大的for循环，杨辉三角的核心代码

		for(int i = 0;i < yangHui.length;i++){
			for(int j = 0;j < yangHui[i].length;j++){
				System.out.print(yangHui[i][j]);
			}
			System.out.println();
		}//打印杨辉三角
	}
}