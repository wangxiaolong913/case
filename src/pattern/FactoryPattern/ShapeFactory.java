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
public class ShapeFactory {
	public Shape getShape(String shapeType){
		if(shapeType.equalsIgnoreCase("circle")){
			return new Circle();
		}else if(shapeType.equalsIgnoreCase("rectangle")){
			return new Rectangle();
		}else if(shapeType.equalsIgnoreCase("square")){
			return new Square();
		}
		else{
			return null;
		}
	}
}
