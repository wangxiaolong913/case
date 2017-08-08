/**
 * @FileName : case_01
 * @author : wang.xiaolong
 * @Date : 2017年7月31日 
 * @Description : 文件操作
 * @check
 * 				【A】
 * 				八、buf值
 */
package case_01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author wang.xiaolong
 *
 */ 
public class OpFile {

	/**
	 * 八、获取文件大小 getFileName()
	 * 
	 * file.length() 获取文件大小方法 file.isFile()、file.exists()判断文件是否存在方法
	 * 
	 * @param fileName
	 * @return
	 * 
	 */
	// private static long getFileSize(String fileName) {
	// // TODO Auto-generated method stub
	// File file = new File(fileName);
	// if (!file.isFile() || !file.exists()) {
	// return -1;
	// } else {
	// return file.length();
	// }
	//
	// }

	public static void main(String[] args) throws IOException {
		String fileName = "newFile.txt";
		String copyFile = "fromCopy.txt";

		/*
		 * 一、写入文件
		 */
		// BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
		// bw.write("hello world");
		// bw.close();
		// System.out.println("ok");

		/*
		 * 二、读文件 调用readLine()方法
		 */
		// BufferedReader br = new BufferedReader(new FileReader(fileName));
		// String str;
		// while ((str = br.readLine()) != null) {
		// System.out.println(str);
		// }

		/*
		 * 三、删除文件 调用File的delete()方法
		 */
		// File file = new File("test.txt");
		// if(file.delete()){
		// System.out.println(file.getName()+"删除成功");
		// }
		// else{
		// System.out.println("删除失败");
		// }

		/*
		 * 四、将文件内容复制到另一个文件
		 */
		// InputStream is = new FileInputStream(new File(fileName));
		// OutputStream os = new FileOutputStream(new File(newFile));
		// byte[] buf = new byte[1024];
		// int len;
		// //buf值怎么来的？？
		// while ((len = is.read(buf)) > 0) {
		// os.write(buf);
		// }
		// is.close();
		// os.close();
		// BufferedReader br = new BufferedReader(new FileReader(newFile));
		// String str;
		// while ((str = br.readLine()) != null) {
		// System.out.println(str);
		// }

		/*
		 * 五、向文件中追加数据
		 */
		// BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
		// bw.write("hello world\nhello kitty\n");
		// bw.close();
		// /*
		// * public FileWriter(File file, boolean append)
		// *
		// * append:
		// * true,则将字节写入文件末尾处
		// * false,则写入文件开始处
		// * 默认是false
		// */
		//
		// bw = new BufferedWriter(new FileWriter(fileName, true));
		// bw.write("hello moto");
		// bw.close();
		// BufferedReader br = new BufferedReader(new FileReader(fileName));
		// String str;
		// while ((str = br.readLine()) != null) {
		// System.out.println(str);
		// }

		/*
		 * 六、创建临时文件 createTempFile() 创建临时文件方法 deleteOnExit() 删除临时文件方法
		 */
		// File temp = File.createTempFile("pattern", ".suffix");
		// temp.deleteOnExit();
		// BufferedWriter out = new BufferedWriter(new FileWriter(temp));
		// out.write("hello world");
		// System.out.println("临时文件已创建:");
		// out.close();

		/*
		 * 七、修改文件最后的修改日期 lastModified() 获取最后修改日期 setLastModified() 修改最后修改日期
		 */
		// File file = new File(fileName);
		// // file.createNewFile();
		// Date fileTime = new Date(file.lastModified());
		// // String sdf = new
		// SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(fileTime);
		// System.out.println(fileTime);
		// // System.out.println(sdf);
		// file.setLastModified(System.currentTimeMillis());
		// fileTime = new Date(file.lastModified());
		// System.out.println(fileTime);

		/*
		 * 八、获取文件大小
		 */
		// long size = getFileSize(fileName);
		// System.out.println(fileName+"的大小为："+size+" bytes");

		/*
		 * 九、文件重命名 oldFile.renameTo(newFile)
		 */
		// File oldFile = new File(fileName);
		// File newFile = new File("newFile.txt");
		// if(oldFile.renameTo(newFile)){
		// System.out.println("rename success");
		// }
		// else{
		// System.out.println("rename failure");
		// }

		/*
		 * 十、设置文件为只读 setReadOnly() canWrite() - 验证是否为只读
		 */
		// File file = new File("newFile.txt");
		// System.out.println(file.setReadOnly());
		// System.out.println(file.canWrite());
		// BufferedWriter bw = new BufferedWriter(new FileWriter("newFile.txt",
		// true));
		// bw.write("end");

		/*
		 * 十一、判断文件是否存在 file.exists()
		 */
		// File file = new File(fileName);
		// System.out.println(file.exists());

		/*
		 * 十二、判断两个文件路径名是否一致 compareTo() 一致返回0
		 */
		// File file1 = new File(fileName);
		// File file2 = new File(copyFile);
		// if(file1.compareTo(file2) == 0){
		// System.out.println("一致");
		// }else{
		// System.out.println("不一致");
		// }
	}

}
