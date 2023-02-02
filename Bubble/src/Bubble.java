public class Bubble {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[]arr = {1,2,12,22,3,23,4,13};
        System.out.println("=====以下为原数组的输出结果=====");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        BubbleSort B1 = new BubbleSort();
        B1.sort(arr);
        System.out.println("=====以下为冒泡排序的输出结果=====");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }//主方法结束
}//公共类结束

class BubbleSort{
    public void sort(int[]arr){
        for (int i = 0; i < arr.length - 1 ; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
               if(arr[j] > arr[j+1]){
                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
               }
            }//判断并交换，沉积的值不用理会，减少时间复杂度
        }//将最大值沉到末尾，但最多只需要沉积（长度-1）次就足够
    }//排序方法结束
}//类结束

/*=====开发日志2023.1.27=====*/
/*冒泡排序实在是无聊。
虽然最开始乃至期末考试的冒泡排序题写的一塌糊涂，
但是现在确实掌握很熟练
就是有一点，时间复杂度的最坏情况为O(n*n)
很明显效率不高而且不够好玩
应该学学新的算法了
 */