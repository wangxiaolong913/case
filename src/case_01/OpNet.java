/**
 * @FileName : case_01
 * @author : wang.xiaolong
 * @Date : 2017年8月7日 
 * @Description : 网络操作
 * 		          【未实现】Socket 实现多线程服务器程序
 * @check
 */
package case_01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author wang.xiaolong
 *
 */
public class OpNet {
	public static void main(String[] args) throws Exception {
		/*
		 * 一、获取指定主机的IP地址
		 * 
		 * getHostName():获取主机名; getHostAddress():获取主机IP; getByName():获取主机名和IP
		 * 调用InetAddress类的方法
		 */
		// try {
		// InetAddress address = InetAddress.getByName("www.baidu.com");
		// System.out.println(address);
		// System.out.println(address.getHostName() + "="
		// + address.getHostAddress());
		// } catch (UnknownHostException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

		/*
		 * 二、查看端口号是否被占用 new Socket(host,port)
		 */
		// Socket skt;
		// for (int i = 8079; i < 8082; i++) {
		// try {
		// // System.out.println(i);
		// skt = new Socket("localhost", i);
		// System.out.println(i + " 已被占用");
		// } catch (UnknownHostException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// // break;
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// // e.printStackTrace();//注释掉，否则会报Connection refused: connect异常
		// }
		// }
		//

		/*
		 * 三、获取本机IP和主机名 InetAddress.getLocalHost();
		 */
		// InetAddress address;
		// try {
		// address = InetAddress.getLocalHost();
		// System.out.println(address);// wang-xiaolong/169.254.16.59
		// System.out.println(address.getHostName());// 主机名
		// System.out.println(address.getHostAddress());// 主机IP
		// } catch (UnknownHostException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

		/*
		 * 四、获取远程主机文件的大小
		 */
		// int size = 0;
		// // 获取url
		// URL url = new URL(
		// "http://www.runoob.com/wp-content/themes/runoob/assets/img/newlogo.png");
		// // 打开URL连接 openConnection()
		// URLConnection uconn = url.openConnection();
		//
		// // 获取文件大小 getContentLength()
		// size = uconn.getContentLength();
		//
		// if (size < 0) {
		// System.out.println("无法获取文件大小");
		// }
		// System.out.println("文件大小为：" + size + "bytes");
		//
		// // 关闭连接 getInputStream().close()
		// uconn.getInputStream().close();

		/*
		 * 【未实现】Socket 实现多线程服务器程序
		 */

		/*
		 * 五、获取主机指定文件最后修改时间
		 * 
		 * getLastModified()
		 */
		// URL url = new
		// URL("http://www.runoob.com/wp-content/themes/runoob/assets/img/newlogo.png");
		// URLConnection uconn = url.openConnection();
		// uconn.setUseCaches(false);
		// long timestamp = uconn.getLastModified();
		// System.out.println(timestamp);
		// String sdf = new
		// SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(timestamp);
		// System.out.println(sdf);
		// uconn.getInputStream().close();

		/*
		 * 六、使用Socket连接到指定主机
		 * 
		 * getInetAddress();
		 */
		// Socket sok= new Socket("www.runoob.com",80);
		// InetAddress adress = sok.getInetAddress();
		// System.out.println("连接到: "+adress);
		// sok.close();

		/*
		 * 七、抓取整个网页内容
		 * 
		 * URL获取网页、BufferedReaderd读取内容、BufferedWriter写入文件
		 */
		// URL url = new URL("http://www.runoob.com");
		// BufferedReader br = new BufferedReader(new InputStreamReader(
		// url.openStream()));
		// BufferedWriter bw = new BufferedWriter(new FileWriter("data.html"));
		//
		// String line;
		// while ((line = br.readLine()) != null) {
		// System.out.println(line);
		// bw.write(line);
		// bw.newLine();// newLine()：换行
		// }
		// br.close();
		// bw.close();

		/*
		 * 八、获取URL响应头的日期信息
		 */
		// URL url = new URL("http://www.runoob.com");
		// HttpURLConnection huc = (HttpURLConnection) url.openConnection();
		// long date = huc.getDate();
		// if(date == 0)
		// System.out.println("无法获取信息");
		// else
		// System.out.println(new Date(date));

		/*
		 * 九、获取URL响应头信息
		 * 
		 * uc.getHeaderFileds() 获取相应头所有信息; header.keySet() 获取所有key;
		 * uc.getHeaderFiled(key) 获取key的值;
		 */
		// URL url = new URL("http://www.runoob.com");
		// URLConnection uc = url.openConnection();
		// Map header = uc.getHeaderFields();
		// System.out.println(header);
		// Set<String> keys = header.keySet();
		// System.out.println(keys);
		// for (String key : keys) {
		// String val = uc.getHeaderField(key);
		// System.out.println(key + "    " + val);
		// }

		/*
		 * 十、解析URL地址
		 */
		// URL url = new URL("http://www.runoob.com");
		// System.out.println("地址是：" + url.toString());
		// System.out.println("端口号是：" + url.getPort());
		// System.out.println("默认端口号是： " + url.getDefaultPort());
		// System.out.println("协议是： " + url.getProtocol());
		// System.out.println("路径是" + url.getPath());
		// System.out.println("文件名是：" + url.getFile());
		// System.out.println("主机是：" + url.getHost());

		/*
		 * 十一、客户端Socket和服务端ServerSocket通信
		 * 
		 * OpNetClient-客户端; OpNetServer-服务端
		 */
	}
}
