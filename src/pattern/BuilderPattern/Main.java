/**
 * @FileName : case_01
 * @author : wang.xiaolong
 * @Date : 2017年8月10日 
 * @Description :【这不是装饰者模式，需要在此基础上进行改进】 
 * 	
 * @check
 */
package pattern.BuilderPattern;

import java.util.ArrayList;

/**
 * @author wang.xiaolong
 *
 */
public class Main {
	public static void main(String[] args) {
		Benz b = new Benz();
//		ArrayList<String> s = new ArrayList<String>();
//		b.sequence.add("");
		b.sequence.add("start");
		b.sequence.add("alarm");
		b.sequence.add("stop");
//		b.getSequence(s);
		b.run();
	}
}
