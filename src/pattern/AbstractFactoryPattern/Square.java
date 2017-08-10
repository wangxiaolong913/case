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
public class Square implements Shape{

	/* (non-Javadoc)
	 * @see pattern.AbstractFactoryPattern.Shape#draw()
	 */
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("square");
	}
	
}
