/**
 * @FileName : case_01
 * @author : wang.xiaolong
 * @Date : 2017年8月10日 
 * @Description : 
 * @check
 */
package pattern.AbstractFactoryPattern;

/**
 * @author wang.xiaolong
 *
 */

public class FacoryProducer {
	public AbstractFactory getFactory(String factory) {
		if (factory.equalsIgnoreCase("shape")) {
			return new ShapeFactory();
		} else if (factory.equalsIgnoreCase("color")) {
			return new ColorFacory();
		} else {
			return null;
		}

	}
}
