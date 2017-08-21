/**
 * @FileName : case_01
 * @author : wang.xiaolong
 * @Date : 2017年8月21日 
 * @Description : 
 * @check
 */
package practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/**
 * @author wang.xiaolong
 *
 */
public class TestThread extends Thread {
	public static void tFun() {
		System.out.println("hello");
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
	}

	
	public static void main(String[] args) throws ParseException {
		/*
		 * 一、线程定时执行;
		 *  从当前时间开始，每隔1min，执行定时任务，输出hello
		 * 线程开始执行时间：当前时间
		 * 线程执行间隔时间：1min
		 * 可以设置指定开始时间：
		 * SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		 * Date firstTime = sdf.parse("2017/08/21 10:55:00");
		 */

		/*
		 * 一、scheduleAtFixedRate与schedule的区别：
		 * scheduleAtFixedRate：
		 * 如：指定开始执行时间为：2017/08/21 10:00:00,当前时间为：2017/08/21 11:00:00,时间间隔为30min
		 * 那么执行任务从2017/08/21 10:00:00开始计算，而不是从2017/08/21 11:00:00
		 * 
		 * schedule：
		 * 从当前时间开始计算
		 */
		String strDateFormate = "yyyy-MM-dd HH:mm:ss";
		Date date = new Date();
		String  sdf = new SimpleDateFormat(strDateFormate).format(date);	
		Date firstTime = new SimpleDateFormat(strDateFormate).parse(sdf);
		Timer timer = new Timer();
		
		//指定一个开始时间 scheduleAtFixedRate()
		SimpleDateFormat sdf2 = new SimpleDateFormat(strDateFormate);
		Date date2 = sdf2.parse("2017-08-21 11:00:00");
		timer.scheduleAtFixedRate(new TimerTask() {
			private int count;
			@Override
			public void run() {
				this.count++;
				System.out.println(count);
				// TODO Auto-generated method stub
				tFun();
				if(count == 5){
					System.out.println("中止定时任务");
					timer.cancel();//cancel()：中止定时任务
				}
			}
		}, firstTime, 1*5*1000);
		
		//从当前时间开始 schedule()
//		timer.schedule(new TimerTask(){
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				tFun();
//			}		
//		}, 1*60*1000);
	}
}
