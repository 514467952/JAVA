package ArrayList�ӿ�;
import java.util.*;
public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����ArrayList����
		ArrayList list = new ArrayList();
		//�򼯺������Ԫ��
		list.add("stu1");
		list.add("stu2");
		list.add("stu3");
		list.add("stu4");
		System.out.println("���ϵĳ���"+list.size());
		System.out.println("�ڶ���Ԫ����:"+list.get(1));
		Iterator iterator = list.iterator();
		
		//�ж��Ƿ������һ��Ԫ��
		while(iterator.hasNext()){
			Object obj =iterator.next();
			System.out.println(obj);
		}
		System.out.println(list);
	}

}
