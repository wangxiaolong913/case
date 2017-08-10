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
public class Green implements Color{

	/* (non-Javadoc)
	 * @see pattern.AbstractFactoryPattern.Color#fill()
	 */
	@Override
	public void fill() {
		// TODO Auto-generated method stub
		System.out.println("green");
	}
	
}
