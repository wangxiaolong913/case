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
public class Man implements iHuman{

	/* (non-Javadoc)
	 * @see pattern.FactoryPattern.iHuman#say()
	 */
	@Override
	public void say() {
		// TODO Auto-generated method stub
		System.out.println("is man");
	}
	
}
