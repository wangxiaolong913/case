/**
 * @FileName : case_01
 * @author : wang.xiaolong
 * @Date : 2017年8月21日 
 * @Description : 
 * @check
 */
package practice;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author wang.xiaolong
 *
 */  
public class TestTimer implements Runnable{

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		ScheduledExecutorService ses = Executors.newSingleThreadScheduledExecutor();
		ses.scheduleAtFixedRate(start(), 10, 20, TimeUnit.SECONDS);
	}

	public Runnable start(){
		System.out.println("thread start...");
		return null;
	
	}
	public static void main(String[] args) {
		TestTimer tt = new TestTimer();
		tt.start();
	}

}
