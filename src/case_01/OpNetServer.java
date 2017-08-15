/**
 * @FileName : case_01
 * @author : wang.xiaolong
 * @Date : 2017年8月8日 
 * @Description : 
 * @check
 */
package case_01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author wang.xiaolong
 *
 */
public class OpNetServer {
	public static void main(String[] args) {
		try {
			//开启服务端8888端口
			ServerSocket ss = new ServerSocket(8888);
			System.out.println("服务端启动...");
			/*等待客户端连接服务端开启的指定端口*/
			Socket s = ss.accept();
			
			//读取客户端信息
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			String msg ;
			msg =  br.readLine();
			System.out.println("客户端say:"+msg);
			
			//接收到客户端信息，给客户端返回信息
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
			//字符串需要加换行符  \n 才可以读取信息....
			bw.write("OK\n");
			bw.flush();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
