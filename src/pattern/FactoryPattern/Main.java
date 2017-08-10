/**
 * @FileName : case_01
 * @author : wang.xiaolong
 * @Date : 2017年8月10日 
 * @Description : 工厂模式
 * @check
 */
package pattern.FactoryPattern;

/**
 * @author wang.xiaolong
 *
 */
public class Main {
	public static void main(String[] args) {
		HumanFactory hf = new HumanFactory();
		iHuman ih = hf.getHumanInfo("man");
		ih.say();
		
		iHuman ih2 = hf.getHumanInfo("woman");
		ih.say();
	}
}
