import java.util.Scanner;

public class ArrayIncluding{
	public static void main(String[] args){
		int arr[] = {1,2,3};
		do{
			int arrNew[] = new int[arr.length + 1];
			for(int i = 0;i < arr.length;i++){
				arrNew[i] = arr[i];
				}
			Scanner myScanner = new Scanner(System.in);
			System.out.println("请输入一个整数，作为扩展：");
			int a = myScanner.nextInt();
			arrNew[arr.length] = a;
			arr = arrNew;
			System.out.println("扩展完毕");
			System.out.println("是否需要继续扩展？（y/n）");
			char cc = myScanner.next().charAt(0);
			if(cc =='n'){
				break;
				}
		}while(true);
	}//主方法结束
}//公共类结束