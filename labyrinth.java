/*
写在前面 
labyrinth 意为迷宫。
这是走迷宫的雏形，是本人接触到的第一个实现游戏的代码
代码使用递归实现，而经过多日的学习，逐渐认识到了递归的有趣和复杂
尤其，在老师讲解完之后，很多时候有可能弄不明白，必须花时间弄清楚实现的思路和规则
自顶而下，逐步求精
感谢韩顺平老师教授和传递的宝贵思路
*/

public class labyrinth{
	public static void main(String[] args){
		//首先使用多个for循环初始化地图，将地图设置为二维数组
		int map[][] = new int[8][7];
		for(int i = 0;i < 8;i++){
			map[i][0] = 1;
			map[i][6] = 1;
		}
		for(int j = 0;j < 7;j++){
			map[0][j] = 1;
			map[7][j] = 1;
		}
		map[3][1] = 1;
		map[3][2] = 1;

		//输出当前地图
		System.out.println("=====当前地图情况为=====");

		for(int i = 0;i < map.length;i++){
			for(int j = 0;j < map[i].length;j++){
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}//打印当前地图结束



		Migong m1 = new Migong();//新建对象
		m1.findway(map,1,1);

		System.out.println("\n=====找路的情况如下=====");

		for(int i = 0;i < map.length;i++){
			for(int j = 0;j < map[i].length;j++){
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}//验证找路方法，并打印路径


	}//主类结束
}//公共类结束


//0代表可以走，1代表障碍物，2代表走过，3代表死路
//使用递归回溯思想，建立迷宫类与找路方法
//设置找路方法返回布尔值，找路成功返回true，找路失败返回false
//i，j是初始位置，设置成1，1
//结束位置，也就是终点，设置成6，5
class Migong{
	public boolean findway(int[][] map,int i,int j){
		if(map[6][5] == 2){
			return true;
		}
		else{
			if(map[i][j] == 0){
				map[i][j] = 2;

				//原理：将找路拆解为寻找上下左右四个方向，如果为0，则改写为2
				//开始递归回溯，寻找方向的顺序为下->右->上->左
				if(findway(map,i+1,j)){
					return true;
				}
				else if(findway(map,i,j+1)){
					return true;
				}
				else if(findway(map,i-1,j)){
					return true;
				}
				else if(findway(map,i,j-1)){
					return true;
				}
				else{
					map[i][j] = 3;
					return false;
				}
			}//递归找路结束

		
			else{
			return false;
			//当非0时返回false
			}
		}
	}//找路方法结束
}//迷宫类结束