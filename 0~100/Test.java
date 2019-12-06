
import java.util.Scanner;

 class ScoreException extends Exception{

	public ScoreException(){
		super();
	}
	public ScoreException(String message)
	{
		super(message);
	}
}

public class Test{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		try{
			System.out.println("请输入你的分数:\n");
			int score = input.nextInt();
			if(score<0 || score>100)
			{
			throw new ScoreException("分数必须在0~100之间\n");
			}
			System.out.println("分数为:"+score);
		}catch(ScoreException e){
			System.out.println("e.getMessage()");
			e.printStackTrace();
		}	
	}
}