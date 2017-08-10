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
public class ColorFacory extends AbstractFactory{
	public Color getColor(String color) {
		if (color.equalsIgnoreCase("red")) {
			return new Red();
		} else if (color.equalsIgnoreCase("green")) {
			return new Green();
		} else {
			return null;
		}
	}

	/* (non-Javadoc)
	 * @see pattern.AbstractFactoryPattern.AbstractFactory#getShape(java.lang.String)
	 */
	@Override
	Shape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}
}
