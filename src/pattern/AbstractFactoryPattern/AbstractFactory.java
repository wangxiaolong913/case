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
public abstract class AbstractFactory {
	abstract Color getColor(String color);
	abstract Shape getShape(String shape);
}
