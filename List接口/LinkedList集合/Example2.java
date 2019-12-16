package LinkedList集合;
import java.util.*;
public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList link = new LinkedList();
		//1.添加元素
		link.add("stu1");
		link.add("stu2");
		System.out.println(link);//输出集合中的元素
		//向集合尾部追加元素
		link.offer("offer");
		//向集合头部添加元素
		link.push("push");
		System.out.println(link);
		
		//2.获取元素
		//获取集合中第一元素
		Object obj = link.peek();
		System.out.println(obj);
		
		//3.删除元素
		//删除集合中第一个元素
		link.removeFirst();
		//删除集合中最后一个元素
		link.pollLast();
		System.out.println(link);
	}

}
