//variety patameter 可变参数
//表示一个方法中可以传入不定数目的参数，范围0-n
//可以当作数组来看
//可变参数可以和普通参数一起放在形参列表中，但必须放在形参列表最后
//可变参数的实参可以是数组
//一个形参列表只能出现一个可变参数

public class VarParameter{
	public static void main(String[] args){

	}//主方法结束
}//公共类结束

class VP01{
	public int sum(int... nums){
		for(int i = 0;i < nums.length;i++){
			int res = 0;
			res += nums[i];
		}

		return res;
	}
}