package LinkedList����;
import java.util.*;
public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList link = new LinkedList();
		//1.���Ԫ��
		link.add("stu1");
		link.add("stu2");
		System.out.println(link);//��������е�Ԫ��
		//�򼯺�β��׷��Ԫ��
		link.offer("offer");
		//�򼯺�ͷ�����Ԫ��
		link.push("push");
		System.out.println(link);
		
		//2.��ȡԪ��
		//��ȡ�����е�һԪ��
		Object obj = link.peek();
		System.out.println(obj);
		
		//3.ɾ��Ԫ��
		//ɾ�������е�һ��Ԫ��
		link.removeFirst();
		//ɾ�����������һ��Ԫ��
		link.pollLast();
		System.out.println(link);
	}

}
