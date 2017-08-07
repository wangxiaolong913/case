/**
 * @FileName : case_01
 * @author : wang.xiaolong
 * @Date : 2017年8月2日 
 * @Description : 操作数据结构
 * 				    【未实现】：
 *					 1、利用堆栈将中缀表达式转换成后缀 
 *					 2、栈的实现
 *					 3、压栈出栈的方法实现字符串反转
 * @check
 */
package case_01;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

/**
 * @author wang.xiaolong
 */
public class OpDataStructure {
	/*
	 * 链表是一种数据的存储方式，其保存的数据在内存中是不连续的，采用指针对数据进行访问;
	 * 队列是一种数据结构，其特点是先进先出，后进后出;队列的存储方式可以使用线性表进行存储，也可以使用链表进行存储; 栈是先进后出;
	 */
	/*
	 * 五、获取链表元素方法 push()：向链表添加元素 ;top():获取链表第一个元素 ;pop():删除列表第一个元素,返回删除的元素.
	 */
	// private LinkedList linkList = new LinkedList();
	//
	// public void push(Object v) {
	// linkList.addFirst(v);
	// }
	//
	// public Object top() {
	// return linkList.getFirst();
	// }
	//
	// public Object pop() {
	// return linkList.removeFirst();
	// }

	public static void main(String[] args) {
		// LinkedList<Integer> link = new LinkedList<Integer>();
		// link.add(1);
		// link.add(2);
		// link.add(3);
		// System.out.println("initLink: " + link);
		/*
		 * 一、数字求和运算 do...while
		 */
		// int sum = 0;
		// int limit = 100;
		// int i = 1;
		// do{
		// sum = sum+i;
		// i++;
		// }while(i <= limit);
		// System.out.println("sum="+sum);

		/*
		 * 【未实现】利用堆栈将中缀表达式转换成后缀
		 */

		/*
		 * 二、在链表LinkedList的开头和结尾添加元素 addFirst() addLast()
		 */
		// link.addFirst(0);
		// System.out.println("addFirstLink: " + link);
		// link.addLast("4");
		// System.out.println("addLastLink: " + link);

		/*
		 * 三、获取链表（LinkedList）的第一个元素和最后一个元素 getFirst() getLast()
		 */
		// System.out.println("link的第一个元素：" + link.getFirst());
		// System.out.println("link的最后一个元素: " + link.getLast());

		/*
		 * 四、删除链表（LinkedList）指定元素 subList() clear()
		 */
		// link.subList(1, 3).clear();
		// System.out.println("删除第二个和第三个元素:"+link);

		/*
		 * 五、获取链表元素 top() pop()
		 */
		// OpDataStructure ods = new OpDataStructure();
		// for(int i=30;i <= 40;i++)
		// ods.push(i);
		// System.out.println(ods.linkList);
		// System.out.println(ods.top());
		// System.out.println(ods.pop());//返回删除的元素
		// System.out.println(ods.linkList);

		/*
		 * 六、对向量进行排序，并获取向量元素的索引值 Collections.sort():向量排序;
		 * Collections.binarySearch():获取向量元素的索引值;
		 */
		// Vector v = new Vector();
		// v.add("l");
		// v.add("a");
		// v.add("z");
		// Collections.sort(v);
		// System.out.println(v);
		// int index = Collections.binarySearch(v, "z");
		// System.out.println(index);

		/*
		 * 【未实现】栈的实现
		 */

		/*
		 * 七、链表元素查找 indexOf(); lastIndexOf()
		 */
		// LinkedList<String> link = new LinkedList<String>();
		// link.add("1");
		// link.add("9");
		// link.add("8");
		// link.add("19");
		// System.out.println(link.indexOf("1"));
		// System.out.println(link.indexOf("9"));
		// System.out.println(link.lastIndexOf("19"));

		/*
		 * 【未实现】压栈出栈的方法实现字符串反转
		 */

		/*
		 * 八、队列的用法
		 * offer()/add()区别：一些队列有大小限制,如果向一个满的队列加入一个新的元素,多出的项就会被拒绝，offer()返回false
		 * ,add()抛出unchecked异常
		 * 
		 * poll()/remove()区别：都是删除队列第一个元素,如果队列是空,poll()返回null
		 * 
		 * element()/peek():查询队列头部元素,如果队列是空，element()抛出一个异常,而peek()返回null
		 */
		// Queue<String> qe = new LinkedList<String>();//
		// LinkedList实现了Queue接口,因此可以把LinkList当作Queue来用
		// qe.offer("a");
		// qe.offer("b");
		// qe.offer("c");
		//
		// System.out.println("initQueue:" + qe);
		// System.out.println("删除队列第一个元素：" + qe.poll());
		// for (String str : qe) {
		// System.out.print(str);
		// }
		// System.out.println();
		// System.out.println("返回队列第一个元素：" + qe.element());
		// System.out.println(qe.peek());

		/*
		 * 九、获取向量最大元素 Collections.max()
		 */
		// Vector v = new Vector();
		// v.add("a");
		// v.add("b");
		// v.add("c");
		// System.out.println(v);
		// Object max = Collections.max(v);
		// System.out.println(max);

		/*
		 * 十、修改链表 add();set()
		 */
		// LinkedList link = new LinkedList();
		// link.add("a");
		// link.add("b");
		// link.add("c");
		// System.out.println(link);
		// link.set(1, "new1");
		// System.out.println(link);
		// link.add(2, "new2");
		// System.out.println(link);

		/*
		 * 十一、旋转向量
		 */
		// Vector v = new Vector();
		// v.add(1);
		// v.add(2);
		// v.add(3);
		// v.add(4);
		// Collections.swap(v, 0, 3);
		// System.out.println(v);
	}

}
