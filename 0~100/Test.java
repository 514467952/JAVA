
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
			System.out.println("��������ķ���:\n");
			int score = input.nextInt();
			if(score<0 || score>100)
			{
			throw new ScoreException("����������0~100֮��\n");
			}
			System.out.println("����Ϊ:"+score);
		}catch(ScoreException e){
			System.out.println("e.getMessage()");
			e.printStackTrace();
		}	
	}
}