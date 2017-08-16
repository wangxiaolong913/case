/**
 * @FileName : case_01
 * @author : wang.xiaolong
 * @Date : 2017年8月3日 
 * @Description : 集合操作
 * @check
 * 【
 * ArrayList / LinkedList / Vector /
 * -ArrayList:用数组形式保存对象，这种方式将对象放在连续的位置中，所以最大的缺点是插入和删除麻烦 ，适合get()和set()操作;没有同步方法
 * -LinkedList:采用的方式是将对象保存在独立的空间中，而且在每个空间中还保存下一个链接的索引，但是查找麻烦，要从第一个索引开始查找，适合add()和remove()操作;没有同步方法
 * -Vector:使用了synchronized方法，线程安全的，性能比ArrayList差,由Vector创建的iterator，当一个iterator正在被使用，另一个改变Vector状态（添加或修改），这时调用的iterator方法会抛出ConcurrentModificationException异常	
 * 
 * HashSet / TreeSet / LinkedHashSet /
 * -HashSet:无序(速度最快)
 * -TreeSet:有序
 * -LinkedHashSet:输出的顺序就是插入的顺序
 * 
 * HashMap / HashTable
 * -HashMap几乎可以等价HashTable; HashMap是非schronized的,并且可以接收null;
 * -HashTble是synchronized的,不能接收null(慢)
 * -HashMap的迭代器（Iterator），HashTable的迭代器（enumeration）
 * 	HashMap / TreeMap / LinkedHashMap /(区别同set)
 * 
 * 	Queue(OpDataStructure - 八)】
 */
package case_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * @author wang.xiaolong
 *
 */
public class OpCollection {
	public static void main(String[] args) {
		/*
		 * 一、数组转集合 Arrays.asList()
		 */
		// int n = 5;
		// String[] array = new String[n];
		// for (int i = 0; i < n; i++) {
		// array[i] = String.valueOf(i);
		// }
		// List<String> list = Arrays.asList(array);
		// for(String a:array){
		// System.out.print(a+" ");
		// }

		/*
		 * 二、集合比较 Collections.min(); Collections.max()
		 */
		// TreeSet是通过TreeMap实现的,只不过Set用的只是Map的key,TreeMap：唯一、排序.
		// String[] array = { "aa", "c", "b", "d", "ab" };
		// Set set = new TreeSet();
		// for (int i = 0; i < array.length; i++)
		// set.add(array[i]);
		// System.out.println(set);
		// System.out.println(Collections.min(set));// 集合最小值
		// System.out.println(Collections.max(set));// 集合最大值

		/*
		 * 三、集合遍历
		 */
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("k1", "v1");
		hm.put("k2", "v2");
		hm.put("k3", "v3");
		Collection c1 = hm.values();
		Iterator itr = c1.iterator();
		while (itr.hasNext()) {// hasNext()检查序列中是否还有元素
			System.out.println(itr.next());// 获得序列中的下一个元素
		}

		/*
		 * 四、集合反转 reverse()
		 */
		// String[] array = { "a", "b", "c" };
		// ArrayList al = new ArrayList();
		// for (int i = 0; i < array.length; i++) {
		// al.add(array[i]);
		// }
		// // System.out.println(al);
		// Iterator it = al.listIterator();
		// while (it.hasNext()) {
		// System.out.println(it.next());
		// }
		// Collections.reverse(al);// 集合反转
		// System.out.println(al);

		/*
		 * 五、删除集合指定元素 remove()
		 */
		// HashSet<String> hs = new HashSet<String>();
		// String str1 = "hello", str2 = "world", str3 = "end", str4 = "hello";
		// hs.add(str1);
		// hs.add(str2);
		// hs.add(str3);
		// hs.add(str4);
		// System.out.println(hs);
		// Iterator<String> it = hs.iterator();
		// while (it.hasNext()) {//it.haseNext() 集合元素是否遍历完成，是否还有下一个元素
		// System.out.println(it.next() + " ");//输出集合元素
		// }
		// hs.remove(str2);
		// System.out.println(hs.size());//获取当前集合大小

		/*
		 * 六、设置集合为只读集合 Collections.unmodifiableSet
		 */
		// List stuff = Arrays.asList(new String[] { "a", "b" });
		// List list = new ArrayList(stuff);
		// list = Collections.unmodifiableList(list);
		// stuff.set(0, "c");
		// System.out.println(stuff);
		// Set set = new HashSet<String>(stuff);
		// set = Collections.unmodifiableSet(set);
		// try{
		// set.add("zz");
		// }
		// catch(Exception e){
		// System.out.println("Exception = "+e);
		// }
		// System.out.println(set);
		//
		// Map map = new HashMap();
		// Collections.unmodifiableMap(map);

		/*
		 * 七、集合输出
		 */
		// TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		// tm.put(1, "all");
		// tm.put(3, "cs");
		// tm.put(2, "but");
		// System.out.println(tm);
		// System.out.println(tm.firstKey());// 获取第一个key
		// System.out.println(tm.keySet());// 获取所有key
		// System.out.println(tm.lastKey());// 最后一个key
		// System.out.println(tm.get(1));// key为1的值
		// System.out.println(tm.values());// 获取所有值
		// tm.remove(tm.firstKey());// 删除第一个key
		// System.out.println(tm);

		/*
		 * 八、集合转数组 Object[] array = list.toArray(); 或者 String[] array =
		 * list.toArray(new String[0]);
		 */
		// List<String> list = new ArrayList<String>();
		// list.add("hello");
		// list.add("world");
		// list.add("end");
		// System.out.println(list);
		// Object[] array = list.toArray();
		// for(int i=0;i<array.length;i++){
		// System.out.print(array[i]+" ");
		// }

		/*
		 * 九、List循环移动元素rotate()
		 */
		// List list = Arrays.asList("a b c d e".split(" "));
		// System.out.println(list);
		// Collections.rotate(list, 2);// rotate：旋转、交替.第二个参数为要移动的元素的起始位置
		// System.out.println(list);

		/*
		 * 十、查找的最大值和最小值 Collections.max(); Collections.min();
		 */
		// List list = Arrays.asList("d e c a b z m".split(" "));
		// System.out.println(Collections.max(list));
		// System.out.println(Collections.min(list));

		/*
		 * 十一、遍历HashTable的键值
		 * 
		 * HashMap几乎可以等价HashTable; HashMap是非schronized的,并且可以接收null;
		 * HashTble是synchronized的,不能接收null
		 */
		// Hashtable<String, String> ht = new Hashtable<String, String>();
		// ht.put("1", "all");
		// ht.put("3", "cs");
		// ht.put("2", "but");
		// System.out.println(ht);
		// Enumeration enKey = ht.keys();// 获取key
		// Collection<String> enValue = ht.values();// 获取value
		// while (enKey.hasMoreElements()) {
		// System.out.println(enKey.nextElement());
		// }

		/*
		 * 十二、List元素替换 Collections.replaceAll()
		 */
		// List list = Arrays.asList("d c a b e a".split(" "));
		// Collections.replaceAll(list, "a", "A");
		// System.out.println(list);

		/*
		 * 十三、List截取 Collections.indexOfList(list,subList);
		 * Collections.lastIndexOfList(list,subList);
		 */
		// List list =
		// Arrays.asList("begin hello world end hello world hello world".split(" "));
		// List subList = Arrays.asList("hello world".split(" "));
		// System.out.println(Collections.indexOfSubList(list, subList));
		// System.out.println(Collections.lastIndexOfSubList(list, subList));

	}
}
