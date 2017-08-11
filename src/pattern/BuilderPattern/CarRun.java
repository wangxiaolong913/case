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
/*
 * 功能：benz和bmw运行，客户可以创建一个车的类型，并指定车的run顺序
 */
public abstract class CarRun {
	public ArrayList<String> sequence = new ArrayList<String>();

	protected abstract void start();

	protected abstract void stop();

	protected abstract void alarm();

	final public void run() {
		for (int i = 0; i < sequence.size(); i++) {
			String acName = sequence.get(i);
			if (acName.equalsIgnoreCase("start")) {
				start();
			} else if (acName.equalsIgnoreCase("stop")) {
				stop();
			} else if (acName.equalsIgnoreCase("alarm")) {
				alarm();
			}
		}
	}

	final public void getSequence(ArrayList<String> sequence) {
		this.sequence = sequence;
	}
}
