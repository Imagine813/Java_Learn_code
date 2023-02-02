import java.util.Random;
import java.util.Scanner;

/*
编写一个猜拳游戏
有个人Styrax，设计他的成员变量，成员方法，可以电脑猜拳，电脑每次随机生成0，1，2
0表示石头，1表示剪刀，2表示布
并显示Styrax的输赢次数，假定玩三次
*/

public class FingerGuessingGame{

	public static void main(String[] args){
		//创建玩家Styrax
		Styrax S = new Styrax();
		//记录最后的输赢次数
		int isWinCount = 0;

		//创建一个二维数组，用来接受局数，Styrax出拳情况以及电脑出拳情况

		int arr1[][] = new int[3][3];
		int j = 0;

		//创建一个一维数组，用来接受输赢情况
		String arr2[] = new String[3];

		Scanner myScanner = new Scanner(System.in);
		for(int i = 0;i < 3;i++){
			//获取玩家的出拳
			System.out.println("请输入你的出拳（0-石头，1-剪刀，2-布）：");
			int num = myScanner.nextInt();
			S.setStyraxGuessNum(num);
			int styraxGuess = S.getStyraxGuessNum();
			arr1[i][j+1] = styraxGuess;

			//获取电脑的出拳
			int comGuess = S.computerNum();
			arr1[i][j+2] = comGuess;

			//将玩家的出拳和电脑作比较
			String isWin = S.vsComputer();
			arr2[i] = isWin;
			arr1[i][j] = S.count;

			//对每一局情况进行输出
			System.out.println("=================================================");
			System.out.println("局数\t玩家的出拳\t电脑的出拳\t输赢情况");
			System.out.println(S.count + "\t" + styraxGuess + "\t\t" + comGuess + "\t\t" + arr2[i]);
			System.out.println("=================================================");
			System.out.println("\n\n");
			isWinCount = S.winCount(isWin);
		}

		//对游戏的最终结果进行输出
		System.out.println("局数\t玩家的出拳\t电脑的出拳\t\t输赢情况");
		for(int a = 0;a < arr1.length;a++){
			for(int b =0;b < arr1[a].length;b++){
				System.out.print(arr1[a][b] + "\t\t\t");
			}

			System.out.print(arr2[a]);
			System.out.println();
		}
		System.out.println("你赢了" + isWinCount + "次");

	}//主方法结束
}//公共类结束

//Styrax类
class Styrax{
	//玩家出拳的类型
	int styraxGuessNum;
	//电脑出拳的类型
	int comGuessNum;
	//玩家赢的次数
	int winCountNum;
	//比赛的次数
	int count = 1;


	public void showInfo(){

	}

	/**
	 * 电脑随机生成猜拳的数字的方法
	 * @return
	 */
	public int computerNum(){
		Random r = new Random();
		comGuessNum = r.nextInt(3); //方法：返回0-2的随机数
		//System.out.println(comGuessNum);
		return comGuessNum;
	}

	/**
	 * 设置玩家猜拳的数字的方法
	 * @param styraxGuessNum
	 */
	public void setStyraxGuessNum(int styraxGuessNum){
		if(styraxGuessNum > 2||styraxGuessNum < 0){
			//抛出异常
			throw new IllegalArgumentException("数字输入错误！请输入0，1，2");
		}
		this.styraxGuessNum = styraxGuessNum;
	}

	public int getStyraxGuessNum(){
		return styraxGuessNum;
	}

	/**
	 * 比较猜拳的结果
	 * @return 玩家赢返回true，否则返回false
	 */
	public String vsComputer(){

		if(styraxGuessNum == 0 && comGuessNum == 1){
			return "你赢了";
		}
		else if(styraxGuessNum == 1 && comGuessNum == 2){
			return "你赢了";
		}
		else if(styraxGuessNum == 2 && comGuessNum == 0){
			return "你赢了";
		}
		else if(styraxGuessNum == comGuessNum){
			return "平局";
		}
		else {
			return "你输了";
		}
	}

	/**
	 * 记录玩家赢的次数
	 * @return
	 */
	public int winCount(String s){
		count++;
		if(s.equals("你赢了")){
			winCountNum++;
		}
		return winCountNum;
	}

}