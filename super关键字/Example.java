package super�ؼ���;
class Animal{
	//����Aniaml���вεĹ��췽��
	public Animal(String name){
		System.out.println("����һֻ"+name);
	}
}

class Dog extends Animal{
	public Dog(){
		super("��Ƥ��\n");
		
	}
}
public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog =new Dog();
	}

}
