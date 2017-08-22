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
public class TestTimer implements Runnable {
	private String threadName;
	private Thread t;
	/**
	 * @param string
	 */
	public TestTimer(String threadName) {
		// TODO Auto-generated constructor stub
		this.threadName = threadName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("R..."+threadName);
		for(int i = 4;i>0;i--){
			System.out.println("Thread:"+threadName+"	"+i);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Thread:"+threadName+"	exit");
	}

	public void start() {
		System.out.println("Start..."+threadName);
		if(t == null){
			t = new Thread(this,threadName);
			t.start();
		}
	}

	public static void main(String[] args) {
		TestTimer tt1 = new TestTimer("ThreadA");
		tt1.start();
		TestTimer tt2 = new TestTimer("ThreadB");
		tt2.start();
	}
}