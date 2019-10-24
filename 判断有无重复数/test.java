public class test{

//检验元素值是否合法
private static void checkArrayFormat(int[] testArray)
{
	for(int i = 0; i < testArray.length; i++){
		if(testArray[i] >= testArray.length || testArray[i] < 0 ){
			System.out.printf("数组越界\n");
		}
	}
}

private static void swap(int[] array, int index1, int index2){
	int tmp =array[index1];
	array[index1]= array[index2];
	array[index2] = tmp;
}

//主功能
public static void fun(int[] testArray)
{
	if(testArray == null || testArray.length == 0)
	{
		return;
	}
	
	checkArrayFormat(testArray);
	
	int length = testArray.length;

	for(int i = 0 ; i < length; i++){
		while(i != testArray[i]){
			int index = testArray[i];
			if(testArray[index] == testArray[i]){
				System.out.printf("重复\n");
				return ;
			}
			swap(testArray, i ,index);
		}
	}
  }

public static void main(String[] args)
{
   int[] testArray = new int[] {1,6,5,3,12,2,3,2,0,1,7,4,5};
	fun(testArray);	
}

};
