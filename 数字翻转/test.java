import java.util.Scanner;

public class test
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ������:");
		int num = sc.nextInt();
		int result = 0; //��ת�������
		while(true)
		{
			int n =num%10;
			result = result*10+n;
			num = num/10;
			if(num == 0)
			{
				break;
			}
		
		}
		System.out.println(result);
	}
};