/**
 * @FileName : case_01
 * @author : wang.xiaolong
 * @Date : 2017年8月10日 
 * @Description : 
 * @check
 */
package pattern.BuilderPattern;

import java.util.ArrayList;

/**
 * @author wang.xiaolong
 *
 */
public class Benz extends CarRun{

	/* (non-Javadoc)
	 * @see pattern.BuilderPattern.CarRun#start()
	 */
	@Override
	protected void start() {
		// TODO Auto-generated method stub
		System.out.println("benz start");
	}

	/* (non-Javadoc)
	 * @see pattern.BuilderPattern.CarRun#stop()
	 */
	@Override
	protected void stop() {
		// TODO Auto-generated method stub
		System.out.println("benz stop");
	}

	/* (non-Javadoc)
	 * @see pattern.BuilderPattern.CarRun#alarm()
	 */
	@Override
	protected void alarm() {
		// TODO Auto-generated method stub
		System.out.println("benz wuwuwu~");
	}
	
	
}
