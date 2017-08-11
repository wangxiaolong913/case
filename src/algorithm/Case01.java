/**
 * @FileName : case_01
 * @author : wang.xiaolong
 * @Date : 2017年8月11日 
 * @Description : 
 * 	
 * @check
 */
package algorithm;

import java.util.Arrays;

/**
 * @author wang.xiaolong
 *
 *         给定两个字符串，确定一个字符串重新排列后，是否与另一个字符串相等
 */
/*
 * 【第一种方法】 两个字符串利用Arrays.sort()方法都重新排序，判断是否相等 ;
 * Arrays.sort()方法,对基本类型用的是快速排序，对对象类型用的是归并排序，时间复杂度O(NlogN)
 */
public class Case01 {
	public static boolean permutation(String strA, String strB) {
		if (strA.length() != strB.length())
			return false;
		return sort(strA).equals(sort(strB));
	}

	// 排序
	private static String sort(String s) {
		char[] a = s.toCharArray();
		Arrays.sort(a);
		// return a.toString();
		return new String(a);

	}

	public static void main(String[] args) {
		// Case01 c1 = new Case01();
		System.out.println(Case01.permutation("hello", "hello"));

	}
}

