/**
 * @FileName : case_01
 * @author : wang.xiaolong
 * @Date : 2017年8月14日 
 * @Description : 基础排序(冒泡、选择、插入)
 * @check
 */
package sort;

/**
 * @author wang.xiaolong
 *
 */
public class BaseSort {
	/*
	 * 一、冒泡排序 时间复杂度:最好的情况是正序，只扫描一次O(N);最坏的情况反序O(N的平方);空间复杂度O(1),不需要额外的空间
	 */
	public void maoPao(int[] source) {
		System.out.println("冒泡排序：");
		// 外层循环：循环几轮。如数组[2,1]，循环1轮；数组[2,3,1]循环3轮...；循环n-1轮
		for (int j = 0; j < source.length - 1; j++) {
			// 内层循环:将最大的数字放在数组最后.
			/*
			 * i<source.length-1-j中的-j意义:
			 * 比如经过第一轮排序，最大的数已经排在最后了，所以最后一个数字不参加第二轮的排序； 经过第二轮排序,次大的数已经排在倒数第二的位置;
			 */
			for (int i = 0; i < source.length - 1 - j; i++) {
				if (source[i] > source[i + 1]) {
					// 元素交换
					int temp = source[i];
					source[i] = source[i + 1];
					source[i + 1] = temp;
				}
			}
		}
		// 输出数组
		for (int i : source) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	/*
	 * 二、选择排序
	 */
	public void selectSort(int[] source) {
		System.out.println("选择排序：");
		int min;
		//8 2 5 4 1  
		/*
		 * 第一次排序过程：
		 * i=0,min=0,j=1;source[1]<source[0]-->min=1
		 * i=0,min=1,j=2;source[2]>source[1]-->min=1
		 * i=0,min=1,j=3;source[3]<source[2]-->min=3
		 * i=0,min=1,j=4;source[4]<source[3]-->min=4
		 * temp=source[0]=8
		 * source[0]=source[4]=1
		 * source[4]=temp=8
		 * 1 2 5 4 8
		 */
		for (int i = 0; i < 1; i++) {
			// 定义当前元素下标为最小值下标
			min = i;
			// 将当前元素和下一个元素进行比较
			for (int j = i + 1; j < source.length; j++) {
				// 如果下一个元素比当前元素还小
				if (source[j] < source[min])
					// 则当前元素下标为它的下一个元素的下标
					min = j;
			}
			// 进行元素替换
			int temp = source[i];
			source[i] = source[min];
			source[min] = temp;
		}
		// 输出
		for (int num : source) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

	/*
	 * 三、插入排序
	 */
	public void insertSort(int[] source) {
		System.out.println("插入排序:");
		for (int i = 1; i < source.length; i++) {
			/*
			 * 第一次排序过程
			 * i=1,j=1,source[1]=2<source[0]=8
			 * temp=source[1]=2,source[1]=source[0]=8,source[0]=temp=2
			 * 2 8 5 4 1
			 */
			/*
			 * 第二次排序过程
			 * i=2,j=2,source[2]=5<source[1]=8
			 * temp=source[2]=5
			 * source[2]=source[1]=8
			 * source[1]=temp=5
			 * 2 5 8 4 1 
			 * 
			 * i=2,j=1,source[1]> source[0]
			 */
			for (int j = i; j > 0; j--) {
				if (source[j] < source[j - 1]) {
					int temp = source[j];
					source[j] = source[j - 1];
					source[j - 1] = temp;
				}
			}
		}
		for (int i : source) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		BaseSort bs = new BaseSort();
		int[] source = { 8, 6, 5, 4, 1 };
//		bs.maoPao(source);// 第一次排序结果：2 5 4 1 8
//		bs.selectSort(source);//第一次排序结果：1 2 5 4 8
		bs.insertSort(source);// 第一次排序结果：2 8 5 4 1
	}
}
