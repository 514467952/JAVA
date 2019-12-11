package super关键字;
class Animal{
	//定义Aniaml类有参的构造方法
	public Animal(String name){
		System.out.println("我是一只"+name);
	}
}

class Dog extends Animal{
	public Dog(){
		super("哈皮狗\n");
		
	}
}
public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog =new Dog();
	}

}
