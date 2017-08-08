/**
 * @FileName : case_01
 * @author : wang.xiaolong
 * @Date : 2017年7月31日 
 * @Description : 时间处理
 * @check
 */
package case_01;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author wang.xiaolong
 *
 */
public class OpDate {

	public static void main(String[] args) {
		/*
		 * 一、时间转换成标准格式
		 */
		// Date date = new Date();
		// String strDateFromat =
		// "yyyy-MM-dd HH:mm:ss";//hh小写12小时制、MM大写-月份、mm小写-分钟
		// String sdf = new SimpleDateFormat(strDateFromat).format(date);
		// // System.out.println(sdf.format(date));
		// System.out.println(sdf);

		/*
		 * 二、 获取当前时间
		 */
		// String strDateFromat = "yyyy-MM-dd HH:mm:ss a";// a为am/pm的标记
		// String sdf = new SimpleDateFormat(strDateFromat).format(new Date());
		// System.out.println(sdf);

		/*
		 * 三、获取年份、月份等
		 */
		// Calendar cal = Calendar.getInstance();
		// System.out.println("当前时间："+new
		// SimpleDateFormat("yyyy-MM-dd HH:mm:ss a").format(cal.getTime()));
		// int day = cal.get(Calendar.DATE);
		// System.out.println("日期："+day);
		//
		// int month = cal.get(Calendar.MONTH)+1;
		// System.out.println("月份："+month);
		//
		// int year = cal.get(Calendar.YEAR);
		// System.out.println("年份："+year);
		//
		// int dow = cal.get(Calendar.DAY_OF_WEEK);//从星期日开始算起
		// System.out.println("一周的第几天："+dow);
		//
		// int dom = cal.get(Calendar.DAY_OF_MONTH);
		// System.out.println("一月的第几天:"+dom);
		//
		// int doy = cal.get(Calendar.DAY_OF_YEAR);
		// System.out.println("一年的第几天："+doy);

		/*
		 * 四、时间戳转换为时间
		 */
//		 long timeStamp = System.currentTimeMillis();
//		 String sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(Long.parseLong(String.valueOf(timeStamp))));
//		 String sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(timeStamp);
//		 System.out.println(sdf);
				
	}
}
