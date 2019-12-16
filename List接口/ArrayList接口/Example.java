package ArrayList接口;
import java.util.*;
public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建ArrayList集合
		ArrayList list = new ArrayList();
		//向集合中添加元素
		list.add("stu1");
		list.add("stu2");
		list.add("stu3");
		list.add("stu4");
		System.out.println("集合的长度"+list.size());
		System.out.println("第二个元素是:"+list.get(1));
		Iterator iterator = list.iterator();
		
		//判断是否存在下一个元素
		while(iterator.hasNext()){
			Object obj =iterator.next();
			System.out.println(obj);
		}
		System.out.println(list);
	}

}
