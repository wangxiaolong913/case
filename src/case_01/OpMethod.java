/**
 * @FileName : case_01
 * @author : wang.xiaolong
 * @Date : 2017年7月31日 
 * @Description : 方法操作
 * @check
 */
package case_01;

import java.util.ArrayList;
import java.util.Vector;

/**
 * @author wang.xiaolong
 *
 */ 
public class OpMethod {

	/*
	 * 一、方法重载用到的属性和方法
	 */
	// int height;
	// public OpMethod(){
	// height = 4;
	// System.out.println("高度："+height);
	// }
	// public OpMethod(int i){
	// System.out.println("高度i："+i);
	// }
	// void info(){
	// System.out.println("高度height："+height);
	// }
	// void info(String s){
	// System.out.println(s+" -- 高度height:"+height);
	// }

	/**
	 * 二、阶乘 factorial()
	 * 
	 * @param counter
	 * @return
	 */
	// private static long factorial(long counter) {
	// // TODO Auto-generated method stub
	// if(counter <= 1){
	// return 1;
	// }else{
	// return counter*factorial(counter-1);
	// }
	// }

	/**
	 * 四、instanceof关键词用法用到的方法 displayObjectClass
	 * 
	 * @param al
	 */
	// private static void displayObjectClass(Object al) {
	// // TODO Auto-generated method stub
	// if(al instanceof ArrayList)
	// System.out.println("对象是ArrayList的实例");
	// else if(al instanceof Vector)
	// System.out.println("对象是Vector的实例");
	// else
	// System.out.println("对象是getClass()"+al.getClass()+"类的实例");
	// }
	public static void main(String[] args) {
		/*
		 * 一、方法重载
		 */
		// OpMethod om1 = new OpMethod();
		// OpMethod om2 = new OpMethod(1);
		// om1.info();
		// om1.info("重载方法");

		/*
		 * 二、阶乘
		 */
		// for (int counter = 0; counter < 10; counter++) {
		// System.out.printf("%d! = %d\n", counter, factorial(counter));
		// }

		/*
		 * 三、方法覆盖
		 */
		// People p = new People();
		// System.out.println("父类方法：" + p.getName());
		// Student s = new Student();
		// System.out.println("子类方法:" + s.getName());
		// People p2 = new Student();
		// System.out.println("子类覆盖父类:" + p2.getName());

		/*
		 * 四、instanceof关键字用法
		 */
		// Object al = new ArrayList();
		// displayObjectClass(al);

		/*
		 * 五、break的用法
		 */
		// int[] array = {1,2,4,1432,999,13,13};
		// int number = 999;
		// boolean f = false;
		// int i=0;
		// for(;i<array.length;i++){
		// if(array[i] == number){
		// f = true;
		// break;
		// }
		// }
		// if(f){
		// System.out.println(number+"位置为："+i);
		// }
		// else{
		// System.out.println("Not in");
		// }

		/*
		 * 六、continue关键字用法
		 */
		// StringBuffer sb = new StringBuffer("hello");
		// char ch = 'l';
		// int count = 0;
		// for(int i=0;i<sb.length();i++){
		// if(sb.charAt(i) != ch)
		// continue;
		// count++;
		// }
		// System.out.println("字母["+ch+"]出现"+count+"次");
	
	
	}

}

/*
 * 三、方法覆盖用到的父类和子类
 */
// class People {
// public String getName() {
// return "父类";
// }
// }
//
// class Student extends People {
// public String getName() {
// return "子类";
// }
// }
