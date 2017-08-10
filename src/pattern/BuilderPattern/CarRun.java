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
public abstract class CarRun {
	private ArrayList<String> sequence = new ArrayList<String>();

	abstract void start();

	abstract void stop();

	abstract void alarm();

	public void run() {
		for (int i = 0; i < sequence.size(); i++) {
			String runName = sequence.get(i);
			if (runName.equalsIgnoreCase("start")) {
				start();
			} else if (runName.equalsIgnoreCase("stop")) {
				stop();

			} else if (runName.equalsIgnoreCase("alarm")) {
				alarm();
			}
		}
	}
}
