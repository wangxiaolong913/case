/**
 * @FileName : case_01
 * @author : wang.xiaolong
 * @Date : 2017年7月27日 
 * @Description :  字符串操作
 * @check
 */
package case_01;

/**
 * @author wang.xiaolong
 *
 */
public class OpString {
	/*
	 * 三、removeChart()
	 */
	// public static String removeChart(String str,int index){
	// return str.substring(0,index)+str.substring(index + 1);
	//
	// }
	public static void main(String[] args) {
		/*
		 * 一 、字符串比较，如果两个字符串相等，返回0，不相等返回字符串中第一个字母ASCII的差值 compareToIgnoreCase
		 * 忽略大小写
		 */
		// String str1 = "hello kitty";
		// String str2 = "Hello WiTTY";
		// System.out.println(str1.compareTo(str2));
		// System.out.println(str1.compareToIgnoreCase(str2));

		/*
		 * 二、 查找子字符串 str2 在 str1 出现的位置
		 */
		// String str1 = "hello world";
		// String str2 = "world";
		// String str3 = "ok";
		// System.out.println(str1.lastIndexOf(str3));

		/*
		 * 三、利用substring删除字符串中的一个字符 ,调用removeChart()方法
		 */
		// String str1 = "helloiworld";
		// System.out.println(removeChart(str1, 5));

		/*
		 * 四、字符串替换
		 */
		// String str1 = "hello kitty,hello kitty,hello kitty";
		// System.out.println(str1.replace("kitty", "world"));
		// System.out.println(str1.replaceFirst("kitty", "world"));
		// System.out.println(str1.replaceAll("kitty", "world"));

		/*
		 * 五、字符串反转 reverse()方法调用将使 StringBuffer对象的值反转。
		 */
		// StringBuffer buffer = new StringBuffer("hello world").reverse();
		// System.out.println(buffer);

		/*
		 * 六、查找子字符串在字符串中出现的位置
		 */
		// String str1 = "hello world ahello";
		// String str2 = "ahello";
		// int t = str1.indexOf(str2);
		// if (t == -1) {
		// System.out.println("no");
		// } else {
		// System.out.println(t);
		// }

		/*
		 * 七、通过指定分隔符将字符串分割为数组
		 */
		// String str1 = "hello-world-end";
		// String[] temp;
		// temp = str1.split("-");
		// for(int i=0;i<temp.length;i++){
		// System.out.println(temp[i]);
		// }
		//
		// String str2 = "www.baidu.com";
		// String[] temp2 = str2.split("\\.");// . 需要转义
		// for(String i : temp2){
		// System.out.println(i);
		// }

		/*
		 * 八、 字符串大小写转换
		 */
		// String str1 = "hello world";
		// String str2 = "HELLO WORLD";
		// System.out.println(str1.toUpperCase());
		// System.out.println(str2.toLowerCase());

		/*
		 * 九、regionMatches()方法测试两个字符串区域是否相等
		 */
		// String str1 = "world hello";
		// String str2 = "kitty iHELlo";
		// Boolean flag1 = str1.regionMatches(6, str2, 7, 5);
		// System.out.println(flag1);
		// Boolean flag2 = str1.regionMatches(true,6, str2, 7, 5);//忽略大小写
		// System.out.println(flag2);
		
		/*
		 * 十、两种方式创建字符串，并测试性能
		 */
////		long startTimeStr = System.currentTimeMillis();//当前时间毫秒数
//		long startTimeStr = System.nanoTime();
//		for(int i = 0;i<50000;i++){
//			String str1 = "helloword";
//		}
//		
//		long endTimeStr =System.nanoTime();
//		
//		long startTimeNew = System.nanoTime();
//		for(int i = 0; i < 50000;i++){
//			String str2 = new String("hellokitty");
//		}
//		
//		long endTimeNew = System.nanoTime();
//		System.out.println("String : "+(endTimeStr - startTimeStr)+"微秒");
//		System.out.println("New : "+(endTimeNew - startTimeNew)+"微秒");
		
		
	}
}