
public class Student {
	
	//����
	int id;
	String name;
	int age;
	
	Computer comp; //�����
	
	void study(){
		System.out.println("��������ѧϰ!!��ʹ�õ���"+comp.brand);
	}
	
	void play(){
		System.out.println("��������Ϸ!!");
	}
	
	//���췽�������ڴ��������Ķ���,�޲εĹ��췽��������ϵͳ�Զ�����
	Student()
	{}
	public static void main(String[] args)
	{
		Student stu = new Student();
		stu.id = 1001;
		stu.name = "LXY";
		stu.age = 18;
		
		Computer c1 = new Computer();
		c1.brand = "����";

		stu.comp = c1;
		
		stu.play();
		stu.study();
	}
}


class Computer{
	String brand;
}




