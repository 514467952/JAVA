
public class Student {
	
	//属性
	int id;
	String name;
	int age;
	
	Computer comp; //计算机
	
	void study(){
		System.out.println("我在认真学习!!，使用电脑"+comp.brand);
	}
	
	void play(){
		System.out.println("我在玩游戏!!");
	}
	
	//构造方法。用于创建这个类的对象,无参的构造方法可以由系统自动创建
	Student()
	{}
	public static void main(String[] args)
	{
		Student stu = new Student();
		stu.id = 1001;
		stu.name = "LXY";
		stu.age = 18;
		
		Computer c1 = new Computer();
		c1.brand = "联想";

		stu.comp = c1;
		
		stu.play();
		stu.study();
	}
}


class Computer{
	String brand;
}




