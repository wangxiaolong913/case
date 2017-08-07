/**
 * @FileName : case_01
 * @author : wang.xiaolong
 * @Date : 2017年8月7日 
 * @Description : 网络操作
 * @check
 */
package case_01;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author wang.xiaolong
 *
 */
public class OpNet {
	public static void main(String[] args) {
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

	}
}
