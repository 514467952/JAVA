package ������;
//��������� Animal
abstract class Animal{
	//������󷽷�shout()
	public abstract void shout();
}

//����DOg��̳г�����Animal
class Dog extends Animal{
	//ʵ��shout����
	public void shout(){
		System.out.println("����---");
	}
}
public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog =new Dog();
		dog.shout();
	}

}
