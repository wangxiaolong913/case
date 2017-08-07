/**
 * @FileName : case_01
 * @author : wang.xiaolong
 * @Date : 2017年7月27日 
 * @Description : 数组操作
 * @check
 */
package case_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author wang.xiaolong
 *
 */
public class OpArray {
	/* Arrays.binarySearch方法使用前，需要对数组排序，才能定位值插入位置，因为binarySearch采用二分搜索法,源码: */

	/**
	 * 一、printArray 打印数组公共方法
	 * 
	 * @param array
	 */
	private static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (i != 0) {
				System.out.print(",");
			}
			System.out.print(array[i]);
		}
		// TODO Auto-generated method stub
		System.out.println();
	}

	/**
	 * 二、向数组插入元素方法 insertArray()
	 * 
	 * @param i
	 * @param array
	 * @return
	 */
	private static int[] insertArray(int arrayNum, int[] array, int index) {
		int[] destination = new int[array.length + 1];
		System.arraycopy(array, 0, destination, 0, index);

		destination[index] = arrayNum;
		System.out.println("array.length = " + array.length + " / index = "
				+ index);
		System.arraycopy(array, index, destination, index + 1, array.length
				- index);

		return destination;
		// TODO Auto-generated method stub

	}
	/**
	 * 十四、数组并集  arrayUnion
	 * @param array1
	 * @param array2
	 * @return
	 */
	private static String[] arrayUnion(String[] array1, String[] array2) {
		// TODO Auto-generated method stub
		Set<String> arraySet = new HashSet<String>();
		for(String a1 : array1){
			arraySet.add(a1);
		}
		
		for(String a2 : array2){
			arraySet.add(a2);
		}
		
		String[] result = {};
		return arraySet.toArray(result);
		
	}

	public static void main(String[] args) {
		/*
		 * 一、数组排序及数组查找
		 */
		// int array[] = {1,-5,-46,8,2,2,7,9,23,6,678,-4};
		// Arrays.sort(array);
		// int index = Arrays.binarySearch(array, 678);
		// System.out.println("数组元素 【678】所在的位置为："+index);
		// printArray(array);

		/*
		 * 二、向数组中添加元素
		 */
		// int array[] = {-3,5,1,4,2,6 };
		// int newIndex;
		// int index = Arrays.binarySearch(array,9);
		// newIndex = -index-1;
		// Arrays.sort(array);
		// array = insertArray(9, array,newIndex);
		// printArray(array);

		/*
		 * 三、获取数组长度
		 */
		// String[][] array = new String[2][5];
		// System.out.println("第一维数组长度 ： "+array.length);
		// System.out.println("第二维数组长度： "+array[1].length);

		/*
		 * 四、数组反转
		 */
		// ArrayList array = new ArrayList();
		// array.add("a");
		// array.add("b");
		// array.add("c");
		// System.out.println(array);
		// //调用Collections.reverse()方法实现数组反转
		// Collections.reverse(array);
		// System.out.println(array);

		/*
		 * 五、数组输出
		 */
		// String[] array = new String[2];
		// array[0] = "hello";
		// array[1] = "world";
		// // for(int i=0;i<array.length;i++){
		// // System.out.println(array[i]);
		// // }
		// for(String i:array){
		// System.out.println(i);
		// }

		/*
		 * 六、求数组的最大值和最小值 Arrays.asList() Collections.min()
		 */
		// Integer[] array = {1,2,3,4,7,1,24,6};
		// int min = Collections.min(Arrays.asList(array));
		// int max = Collections.max(Arrays.asList(array));
		// System.out.println(" min ="+min);
		// System.out.println(" max ="+max);

		/*
		 * 七、数组合并 先将数组1转换为集合1 再将转换为集合类型的数组2填进集合1 创建一个新的数组，将集合1转换为数组，输出
		 */
		// String array1[] = {"h","e","l","l","o"};
		// String array2[] = {"w","o","r","d"};
		// List list = new ArrayList(Arrays.asList(array1));
		// list.addAll(Arrays.asList(array2));
		// Object[] array = list.toArray();
		// System.out.println(Arrays.toString(array));
		/*
		 * 八、数组填充
		 */
		// int[] array = new int[5];
		// Arrays.fill(array,99);
		// for(int i =0;i<array.length;i++){
		// System.out.println(array[i]);
		// }
		// System.out.println("-------------");
		// Arrays.fill(array, 1, 2, 88);
		// for(int i=0;i<array.length;i++){
		// System.out.println(array[i]);
		// }

		/*
		 * 九、数组扩容
		 */
		// String[] array1 = {"A","B","C"};
		// String[] array2 = new String[5];
		// array2[3] = "D";
		// array2[4] = "E";
		// System.arraycopy(array1, 0, array2, 0, array1.length);
		// for(String ch : array2){
		// System.out.println(ch);
		// }

		/*
		 * 十、数组排序和查找
		 */
		// int[] array = {-3,6,-4,-1,4,9,2,1,9,3};
		// Arrays.sort(array);
		// printArray(array);
		// int index = Arrays.binarySearch(array, 2);
		// System.out.println(index);

		/*
		 * 十一、删除数组元素
		 */
		// ArrayList list = new ArrayList();
		// list.add("hello");
		// list.add("world");
		// System.out.println(list);
		// list.remove(0);
		// System.out.println(list);

		/*
		 * 十二、数组的差集（removeAll）、交集（retainAll）、查找数组中指定元素（contains）
		 */
		// ArrayList array1 = new ArrayList();
		// ArrayList array2 = new ArrayList();
		// array1.add(0, "hello");
		// array1.add(1, "world");
		// array1.add(2, "ok");
		//
		// array2.add(0, "hello");
		// array2.add(1, "world");
		// // array2.add(2, "end");
		//
		// System.out.println("1 : " + array1);
		// System.out.println("2 : " + array2);
		//
		// // array1.removeAll(array2);//差集
		// // array1.retainAll(array2);//交集
		// // System.out.println(array1);
		// System.out.println(array1.contains("hello"));//查找数组array1中是否包含hello字符串
		
		/*
		 * 十三、判断数组是否相等
		 */
		// int[] array1 = {1,2,3,4,5};
		// int[] array2 = {1,2,3,4,5};
		// int[] array3 = {1,2,3,3,4};
		//
		// Boolean b1 = Arrays.equals(array1, array2);
		// Boolean b2 = Arrays.equals(array1, array3);
		// System.out.println(b1);
		// System.out.println(b2);
		
		/*
		 * 十四、数组并集
		 */
		// String[] array1 = {"h","e","l","l","o"};
		// String[] array2 = {"w","o","r","d"};
		// String[] result_union = arrayUnion(array1,array2);
		// for(String ru : result_union){
		// System.out.println(ru);
		// }
	}

}
