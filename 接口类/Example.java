package 接口类;
interface Animal{
	int ID =1;
	void breathe();
	int GetID();
}
class Dog implements Animal{
	//实现breathe()方法
	public void breathe(){
		System.out.println("狗在呼吸");
	}
	public int GetID(){
		return ID;
	}
}

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println();
		Dog dog =new Dog();
		System.out.println(dog.ID);
		dog.breathe();
	}

}
