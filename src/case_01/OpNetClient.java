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
			Socket s = new Socket("127.0.0.1",8888);
			System.out.println("客户端启动...");
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
			bw.write("hello\n");
			bw.flush();
			
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
