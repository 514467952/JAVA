package 静态代码块;

class Person{
	static{
		System.out.println("执行了Person类种的静态代码块");
	}
}
public class Example {
	static{
		System.out.println("执行了测试类的静态代码块\n");
	}
	//类被加载时，静态代码块会被执行，由于类只被加载一次，因此静态代码块也只执行一次
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Person p1=new Person();
			Person p2=new Person();
	}

}
