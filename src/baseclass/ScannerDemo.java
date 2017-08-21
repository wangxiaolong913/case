/**
 * @FileName : case_01
 * @author : wang.xiaolong
 * @Date : 2017年8月18日 
 * @Description : Scannner类
 * @check
 */
package baseclass;

import java.util.*;
import java.awt.*;
import java.awt.event.*;

/**
 * @author wang.xiaolong
 *
 */
public class ScannerDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入：");
		/*
		 * 一、hasNext(); next();输入一个字符串，中间有空格。会只输出空格前一部分
		 */
		// if (sc.hasNext()) {
		// String inputStr = sc.next();
		// System.out.println("输入的数据为：" + inputStr);
		// }

		/*
		 * 二 、hasNextLine();nextLine();输入一个字符串，中间有空格。输出为原始字符串
		 */
		// if (sc.hasNextLine()) {
		// String inputStr = sc.nextLine();
		// System.out.println("输入的数据为：" + inputStr);
		// }

		/*
		 * 三、hasNextInt();nextInt();hasNextFloat();nextFloat();
		 */
		// int i = 0;
		// float f = 0.0f;
		// if (sc.hasNextInt()) {
		// i= sc.nextInt();
		// System.out.println("输入的int数据为："+i);
		// }else {
		// System.out.println("输入的不是int类型");
		// }
		// if(sc.hasNextDouble()){
		// f = sc.nextFloat();
		// System.out.println("输入的double数据为:"+f);
		// }else {
		// System.out.println("输入的不是float类型");
		// }

		double sum = 0;
		int m = 0;
		while (sc.hasNextDouble()) {
			double x = sc.nextDouble();
			m = m + 1;
			sum += x;
		}
		System.out.println("average" + sum / m);
		System.out.println("sum=" + sum);
	}
}
