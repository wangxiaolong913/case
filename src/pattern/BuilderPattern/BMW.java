/**
 * @FileName : case_01
 * @author : wang.xiaolong
 * @Date : 2017年8月10日 
 * @Description : 
 * @check
 */
package pattern.BuilderPattern;

/**
 * @author wang.xiaolong
 *
 */
public class BMW extends CarRun{

	/* (non-Javadoc)
	 * @see pattern.BuilderPattern.CarRun#start()
	 */
	@Override
	void start() {
		// TODO Auto-generated method stub
		System.out.println("bmw start...");
	}

	/* (non-Javadoc)
	 * @see pattern.BuilderPattern.CarRun#stop()
	 */
	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("bmw stop...");
	}

	/* (non-Javadoc)
	 * @see pattern.BuilderPattern.CarRun#alarm()
	 */
	@Override
	void alarm() {
		// TODO Auto-generated method stub
		System.out.println("bmw oooo~");
	}

	

}
