/**
 * @FileName : case_01
 * @author : wang.xiaolong
 * @Date : 2017年8月4日 
 * @Description : 
 * @check
 */
package case_01;

import java.util.LinkedList;

import javax.print.attribute.standard.MediaSize.Other;

import org.apache.commons.httpclient.UsernamePasswordCredentials;

/**
 * @author wang.xiaolong
 *
 */
public class Others extends Thread {
	// private int ticket = 5;

	// private String name;
	// private User u;
	// private int y;
	//
	// public void run() {
	// u.oper(y);
	// }
	//
	/**
	 * @param string
	 * @param string2
	 * @param i
	 */
	// public Others(String name, User u, int y) {
	// // TODO Auto-generated constructor stub
	// super(name);
	// this.u = u;
	// this.y = y;
	// }

	/**
	 * @param string
	 */
	// public Others(String name) {
	// // TODO Auto-generated constructor stub
	// super(name);
	// this.name = name;
	// }

	// /*
	// * (non-Javadoc)
	// *
	// * @see java.lang.Runnable#run()
	// */
	// @Override
	// public void run() {
	// // TODO Auto-generated method stub
	// for (int i = 1; i <= 5; i++) {
	// if (this.ticket > 0) {
	// System.out.println(Thread.currentThread().getName() + " sell "+
	// this.ticket--);
	// }
	// }
	// }
	//
	// public static void main(String[] args) {
	// Others o = new Others();
	// Thread t1 = new Thread(o);
	// Thread t2 = new Thread(o);
	// Thread t3 = new Thread(o);
	// t1.start();
	// t2.start();
	// t3.start();
	// }

	// public void run() {
	// System.out.println(Thread.currentThread().getName() + " 线程开始");
	// for (int i = 0; i < 5; i++) {
	// System.out.println("子线程 " + name + " 运行_" + i);
	// }
	// System.out.println(Thread.currentThread().getName() + " 线程结束");
	// }
	//
	// public static void main(String[] args) {
	// System.out.println(Thread.currentThread().getName() + " 线程开始");
	// // new Thread(new Others("A")).start();
	// // new Thread(new Others("B")).start();
	// Others o1 = new Others("A");
	// Others o2 = new Others("B");
	// o1.start();
	// o2.start();
	// System.out.println(Thread.currentThread().getName() + " 线程结束");
	// }
	// private String name;
	//
	// public Others(String name) {
	// /*
	// * 不加super()会取不到name的值 ,super()是无参构造方法里默认执行, 在有参数的的构造方法里加super()
	// */
	// // super(name);
	// this.name = name;
	// }

	// public void run() {
	// System.out.println(Thread.currentThread().getName() + " 线程开始");
	// for (int i = 0; i < 5; i++) {
	// System.out.println("子线程 " + name + " 运行_" + i);
	// try {
	// sleep((int) (Math.random() * 10));
	// } catch (InterruptedException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// }
	// System.out.println(Thread.currentThread().getName() + " 线程结束");
	// }
	//
	// // join子线程结束 主线程才能结束
	// public static void main(String[] args) throws InterruptedException {
	// System.out.println(Thread.currentThread().getName() + " 线程开始");
	// /*
	// * 这种实例化方法不行，会取不到name的值
	// */
	// // new Thread(new Others("A")).start();
	// // new Thread(new Others("B")).start();
	// Others ot1 = new Others("A");
	// Others ot2 = new Others("B");
	// ot1.start();
	// ot2.start();
	//
	// // ot1.join();
	// // ot2.join();
	// System.out.println(Thread.currentThread().getName() + " 线程结束");
	// }

	// private String name;
	//
	// /**
	// * @param string
	// */
	// public Others(String name) {
	// // TODO Auto-generated constructor stub
	// super(name);
	// this.name = name;
	// }
	//
	// public void run() {
	// for (int i = 0; i < 5; i++) {
	// System.out.println(name+i);
	// if(i==3){
	// this.yield();
	// System.out.println("---------P");
	// }
	// }
	// }
	//
	// public static void main(String[] args) {
	// Others ot1 = new Others("A");
	// Others ot2 = new Others("B");
	// ot1.start();
	// ot2.start();
	// }
	//
	// public static void main(String[] args) {
	// User u = new User("张三", 1000);// 张三的初始账户金额为1000
	// Others o1 = new Others("A", u, 300);
	// Others o2 = new Others("B", u, -200);
	// Others o3 = new Others("C", u, 400);
	// Others o4 = new Others("D", u, -190);
	// Others o5 = new Others("E", u, 288);
	// o1.start();
	// o2.start();
	// o3.start();
	// o4.start();
	// o5.start();
	//
	// }
	//
	// }
	//
	// class User {
	// private String username;
	// private int cash;
	//
	// /**
	// * @param string
	// * @param i
	// */
	// public User(String username, int cash) {
	// // TODO Auto-generated constructor stub
	// this.username = username;
	// this.cash = cash;
	// }
	//
	// /**
	// * @param x
	// */
	// public void oper(int x) {
	// // TODO Auto-generated method stub
	// try {
	// Thread.sleep(1000);
	// } catch (InterruptedException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// this.cash += x;
	// System.out.println(Thread.currentThread().getName()+" 增加了"+x+",当前余额为："+cash);
	// }
	//
	// public String getUsername() {
	// return username;
	// }
	//
	// public void setUsername(String username) {
	// this.username = username;
	// }
	//
	// public int getCash() {
	// return cash;
	// }
	//
	// public void setCash(int cash) {
	// this.cash = cash;
	// }

	// 当前类Others为仓库类
//	private final int MAX_SIZE = 100;
//	private LinkedList<Object> list = new LinkedList<Object>();// 进行初始化，否则会报空指针异常
//
//	public void producer(int num) {
//		synchronized (list) {
//			while (list.size() + num > MAX_SIZE) {
//				System.out.println("不能生产,当前仓库大小为" + list.size() + ",生产的num为"
//						+ num);
//
//				try {
//					list.wait();
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//			for (int i = 1; i <= num; ++i) {
//				list.add(new Object());
//			}
//			System.out.println("生产了" + num + ",当前仓库list为" + list.size());
//			list.notifyAll();
//		}
//
//	}
//
//	public void consumer(int num) {
//		synchronized (list) {
//			while (list.size() <= num) {
//				System.out.println("不能消费,当前仓库大小为" + list.size() + ",消费的num为"
//						+ num);
//
//				try {
//					list.wait();
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//			for (int i = 1; i <= num; ++i) {
//				list.remove();
//			}
//			System.out.println("消费了" + num + ",当前仓库大小为" + list.size()
//					+ ",消费的num为" + num);
//			list.notifyAll();
//		}
//
//	}
//
//	public LinkedList<Object> getList() {
//		return list;
//	}
//
//	public void setList(LinkedList<Object> list) {
//		this.list = list;
//	}
//
//	public int getMAX_SIZE() {
//		return MAX_SIZE;
//	}
//
//	public static void main(String[] args) {
//		// 仓库对象
//		Others ot1 = new Others();
//
//		// 生产者对象
//		Producer p1 = new Producer(ot1);
//		Producer p2 = new Producer(ot1);
//		Producer p3 = new Producer(ot1);
//		Producer p4 = new Producer(ot1);
//		Producer p5 = new Producer(ot1);
//		Producer p6 = new Producer(ot1);
//		Producer p7 = new Producer(ot1);
//
//		// 消费者对象
//		Consumer c1 = new Consumer(ot1);
//		Consumer c2 = new Consumer(ot1);
//		Consumer c3 = new Consumer(ot1);
//
//		// 设置生产者生产产品数量
//		p1.setNum(10);
//		p2.setNum(10);
//		p3.setNum(10);
//		p4.setNum(10);
//		p5.setNum(80);
//
//		// 设置消费者消费产品数量
//		c1.setNum(30);
//		c2.setNum(50);
//		c3.setNum(20);
//
//		// 开始执行线程
//		c1.start();
//		c2.start();
//		c3.start();
//		p1.start();
//		p2.start();
//		p3.start();
//		p4.start();
//		p5.start();
//
//	
//	}
//}
//
//class Producer extends Thread {
//	private int num;
//	private Others others;
//
//	public Producer(Others others) {
//		this.others = others;
//	}
//
//	public void run() {
//		produce(num);
//	}
//
//	public void produce(int num) {
//		others.producer(num);
//	}
//
//	public int getNum() {
//		return num;
//	}
//
//	public void setNum(int num) {
//		this.num = num;
//	}
//
//	public Others getOthers() {
//		return others;
//	}
//
//	public void setOthers(Others others) {
//		this.others = others;
//	}
//
//}
//
//// 消费者类
//class Consumer extends Thread {
//	private int num;
//	private Others others;
//
//	public Consumer(Others others) {
//		this.others = others;
//	}
//
//	public void run() {
//		consumer(num);
//	}
//
//	public void consumer(int num) {
//		others.consumer(num);
//	} 
//
//	public int getNum() {
//		return num;
//	}
//
//	public void setNum(int num) {
//		this.num = num;
//	}
//
//	public Others getOthers() {
//		return others;
//	}
//
//	public void setOthers(Others others) {
//		this.others = others;
//	}
	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		System.out.println(i++);
		System.out.println(++j);
	}
}