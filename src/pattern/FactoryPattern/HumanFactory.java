/**
 * @FileName : case_01
 * @author : wang.xiaolong
 * @Date : 2017年8月10日 
 * @Description : 
 * @check
 */
package pattern.FactoryPattern;

/**
 * @author wang.xiaolong
 *
 */
public class HumanFactory {
	public iHuman getHumanInfo(String sex) {
		if (sex.equalsIgnoreCase("man")) {
			return new Man();
		} else if (sex.equalsIgnoreCase("woman")) {
			return new Woman();
		} else {
			return null;
		}

	}
}
