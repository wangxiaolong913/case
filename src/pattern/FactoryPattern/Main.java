/**
 * @FileName : case_01
 * @author : wang.xiaolong
 * @Date : 2017年8月8日 
 * @Description : 
 * @check
 */
package pattern.FactoryPattern;

/**
 * @author wang.xiaolong
 *
 */
public class Main {
	public static void main(String[] args) {
		ShapeFactory sf = new ShapeFactory();
		Shape s1 = sf.getShape("circle");
		s1.draw();

		Shape s2 = sf.getShape("square");
		s2.draw();

		Shape s3 = sf.getShape("rectangle");
		s3.draw();

	}
}
