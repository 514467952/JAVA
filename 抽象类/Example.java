package 抽象类;
//定义抽象类 Animal
abstract class Animal{
	//定义抽象方法shout()
	public abstract void shout();
}

//定义DOg类继承抽象类Animal
class Dog extends Animal{
	//实现shout方法
	public void shout(){
		System.out.println("汪汪---");
	}
}
public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog =new Dog();
		dog.shout();
	}

}
