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
public class ShapeFactory extends AbstractFactory{
	public Shape getShape(String shape) {
		if (shape.equalsIgnoreCase("circle")) {
			return new Circle();
		} else if (shape.equalsIgnoreCase("square")) {
			return new Square();
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see pattern.AbstractFactoryPattern.AbstractFactory#getColor(java.lang.String)
	 */
	@Override
	Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}
}
