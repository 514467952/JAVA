public class test
{
	public static void main(String[] args)
	{
		System.out.printf("�����¶�\t  �����¶�\n");
		double ss=0;
		int i =1;
 		while(i <= 10 && ss<=250){
			double hs = ss*9/5.0+32;
			System.out.println(ss+"--------"+hs);
			ss= ss+20;
		}
	}
};