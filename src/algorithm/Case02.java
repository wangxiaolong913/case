/**
 * @FileName : case_01
 * @author : wang.xiaolong
 * @Date : 2017年8月11日 
 * @Description : 
 * @check
 */
package algorithm;

/**
 * @author wang.xiaolong
 *
 *         实现基本的字符串压缩功能。如字符串abaabbcccd会变成a4b2c3d1,若压缩后的字符串没有变短，则返回原先的字符串。
 *         时间复杂度和空间复杂度均为O(N)
 */
public class Case02 {
	public void compressSameChar(String str) {
		StringBuffer strb = new StringBuffer();
		int counter = 1;
		char last = str.charAt(0);
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == last) {
				counter++;
			} else {
				strb.append(last);
				strb.append(counter);
				last = str.charAt(i);
				counter = 1;
			}
		}
		strb.append(last);
		strb.append(counter);
		System.out.println(strb);
	}
	public static void main(String[] args) {
		Case02 c2 = new Case02();
		c2.compressSameChar("abbcccdddd");
	}
}
