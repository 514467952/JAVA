package ��Ա�ڲ���;
//�����ⲿ��
class Outer
{
	int m = 0; //�����ⲿ��ĳ�Ա����
	//�����ⲿ��ĳ�Ա����
	void test1(){
		System.out.println("�ⲿ���Ա����\n");
	}
	
	class Inner{
		//�����Ա�ڲ���
		int n=1;
		void show1()
		{
			System.out.println("�ⲿ���Ա����m="+m);
			test1();
		}
		void show2(){
			System.out.println("�ڲ����Ա����\n");
		}
		//2.�����ⲿ�෽���������ڲ�������ͷ���
		void test2(){
			Inner inner =new Inner();
			System.out.println("�ڲ����Ա����n="+inner.n);
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
