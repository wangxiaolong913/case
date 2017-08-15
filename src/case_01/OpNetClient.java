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
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author wang.xiaolong
 *
 */
public class OpNetClient {
	public static void main(String[] args) {
		try {
			//开启客户端8888端口
			Socket s = new Socket("127.0.0.1",8888);
			System.out.println("客户端启动...");
			
			//传递给服务端信息
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));			
			bw.write("hello\n");/*字符串需要加换行符  \n 才可以读取信息....*/
			bw.flush();
			
			//读取服务端返回的信息
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			String msg ;			
			msg = br.readLine();
			System.out.println("服务器say:"+msg);
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
