/**
 * @FileName : case_01
 * @author : wang.xiaolong
 * @Date : 2017年7月27日 
 * @Description : 数组操作
 * @check
 */
package case_01;

import java.util.Arrays;

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
	 * @param i
	 * @param array
	 */
	private static void insertArray(int i, int[] array) {
		// TODO Auto-generated method stub
		
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
		int array[] = {-3,3,5,1,-5,4,1,6};
		Arrays.sort(array);
		insertArray(9,array);
	}



}
