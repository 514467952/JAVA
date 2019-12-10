package 成员内部类;
//定义外部类
class Outer
{
	int m = 0; //定义外部类的成员变量
	//定义外部类的成员方法
	void test1(){
		System.out.println("外部类成员方法\n");
	}
	
	class Inner{
		//定义成员内部类
		int n=1;
		void show1()
		{
			System.out.println("外部类成员变量m="+m);
			test1();
		}
		void show2(){
			System.out.println("内部类成员方法\n");
		}
		//2.定义外部类方法，访问内部类变量和方法
		void test2(){
			Inner inner =new Inner();
			System.out.println("内部类成员变量n="+inner.n);
			inner.show2();
		}
	}
}

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer outer =new Outer();
		Outer.Inner inner =outer.new Inner();
		inner.show1();
		
	}

}
