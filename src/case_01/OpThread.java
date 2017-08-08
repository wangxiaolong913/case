/**
 * @FileName : case_01
 * @author : wang.xiaolong
 * @Date : 2017年8月3日 
 * @Description : 线程:http://www.runoob.com/java/java-multithreading.html
 * 				【未实现】：1、状态监测
 * 						2、线程优先级设置
 * 						3、死锁及解决办法
 * 						4、获取线程ID
 * 						5、线程挂起
 * 				【增加】： 1、线程同步
 * 					   2、生产-消费者
 * 				
 * @check
 * 
 * extends Thread：三个线程各自卖出10张票
 * implement Runnable：三个线程一共卖出10张票
 */
package case_01;

import java.util.LinkedList;

import javax.swing.JTable.PrintMode;

/**
 * @author wang.xiaolong
 *
 */ 
// public class OpThread extends Thread {
// public class OpThread extends Thread {

/*
 * 一、查看线程是否存活 isAlive()
 */
// public void run(){
// System.out.println("start run");
// for(int i=0;i<5;i++){
// printMsg();
// }
// }
// public void printMsg(){
// Thread t = Thread.currentThread();//获取当前线程
// String name = t.getName();
// System.out.println("ThreadName = "+name);
// }
// public static void main(String[] args) {
// OpThread op = new OpThread();
// OpThread op2 = new OpThread();
// op2.setName("Run_T_2");
// op.setName("Run_T_1");
// System.out.println(op.isAlive());
// op.start();
// op2.start();
// System.out.println(op.isAlive());
// }

/*
 * 二、获取当前线程名称
 */
// public void run(){
// Thread t = Thread.currentThread();
// System.out.println(t.getName());
// }
// public static void main(String[] args) {
// OpThread ot = new OpThread();
// ot.start();
// }

/*
 * 【未实现】监测线程状态
 */
/*
 * 【未实现】线程优先级设置
 */
/*
 * 【未实现】死锁及解决办法
 */
/*
 * 【未实现】获取线程id
 */
/*
 * 【未实现】线程挂起
 */

/*
 * 【增加-1】线程同步 synchronized
 */
// private String name;// 线程名
// private User u;// 账户
// private int y;// 增加的金额
//
// /**
// * @param string
// * @param u
// * @param i
// */
// public OpThread(String name, User u, int y) {
// // TODO Auto-generated constructor stub
// super(name);
// this.u = u;
// this.y = y;
// }
//
// public void run() {
// u.oper(y);
// }
//
// public static void main(String[] args) {
// User u = new User("张三", 1000);// 账户：张三, 初始金额：1000
// OpThread ot1 = new OpThread("A", u, 340);// 线程A从u(张三的账户)中增加了340
// OpThread ot2 = new OpThread("B", u, -140);
// OpThread ot3 = new OpThread("C", u, 530);
// OpThread ot4 = new OpThread("D", u, -148);
// OpThread ot5 = new OpThread("E", u, 290);
// ot1.start();
// ot2.start();
// ot3.start();
// ot4.start();
// ot5.start();
// }
// }
//
// class User {
// private String username;// 账户名
// private int cash;// 当前账户金额
//
// /**
// * @param string
// * @param i
// */
// public User(String username, int cash) {
// // TODO Auto-generated constructor stub
// this.setUsername(username);
// this.setCash(cash);
// }
//
// /**
// * @param y
// * 业务方法
// */
// public synchronized void oper(int x) {
// // TODO Auto-generated method stub
// try {
// Thread.sleep(1000);
// } catch (InterruptedException e) {
// // TODO Auto-generated catch block
// e.printStackTrace();
// }
// this.cash += x;
// System.out.println("线程 " + Thread.currentThread().getName() + " 增加了"
// + x + ",当前余额为" + cash);
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
// }

/*
 * 【增加】生产-消费者
 */
// 三个类：仓库类、生产类、消费类
// 仓库类
public class OpThread extends Thread {
	// 初始变量：仓库最大容量大小、仓库产品list
	private final int MAX_SIZE = 1000;
	private LinkedList<Object> list = new LinkedList<Object>();

	// 生产方法

	/**
	 * @param num
	 *            :向仓库生产产品的数量
	 */
	public void producer(int num) {
		// 设置为同步方法
		synchronized (list) {
			// 判断 if 新添产品后，当前仓库容量大于最大容量 无法生产
			while (list.size() + num > MAX_SIZE) {
				System.out.println("无法生产，当前仓库容量为：" + list.size() + ",生产的数量为:"
						+ num);
				try {
					// 无法生产，即当前线程进入阻塞状态
					list.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			// else
			for (int i = 0; i < num; i++) {
				// 将num生产进list。产品加入仓库
				list.add(new Object());
			}
			System.out.println("生产|生产的数量为：" + num + ",当前仓库容量为：" + list.size());
		}
	}

	// 消费方法
	public void consumer(int num) {
		synchronized (list) {
			// if 当前仓库容量小于要消费出的产品数量 不能消费
			while (list.size() < num) {
				System.out.println("无法消费，当前仓库容量为：" + list.size() + ",消费的数量为："
						+ num);
				try {
					list.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			// else
			for (int i = 0; i < num; i++) {
				// 产品从仓库中删除
				list.remove();
			}
			System.out.println("消费|消费的数量为:" + num + ",当前仓库容量为：" + list.size());
		}
	}

	public int getMAX_SIZE() {
		return MAX_SIZE;
	}

	public LinkedList<Object> getList() {
		return list;
	}

	public void setList(LinkedList<Object> list) {
		this.list = list;
	}

	public static void main(String[] args) {
		// 仓库类
		OpThread ot = new OpThread();

		// 生产类
		ProduceClass pc1 = new ProduceClass(ot);
		ProduceClass pc2 = new ProduceClass(ot);
		ProduceClass pc3 = new ProduceClass(ot);
		ProduceClass pc4 = new ProduceClass(ot);
		ProduceClass pc5 = new ProduceClass(ot);
		// 消费类
		ConsumeClass cc1 = new ConsumeClass(ot);
		ConsumeClass cc2 = new ConsumeClass(ot);
		ConsumeClass cc3 = new ConsumeClass(ot);

		pc1.setNum(300);
		pc2.setNum(100);
		pc3.setNum(150);
		pc4.setNum(450);
		pc5.setNum(200);

		cc1.setNum(400);
		cc2.setNum(350);
		cc3.setNum(100);
		pc1.start();
		pc2.start();
		pc3.start();
		pc4.start();
		pc5.start();
		cc1.start();
		cc2.start();
		cc3.start();
	}
}

// 生产类
class ProduceClass extends Thread {
	private int num;
	private OpThread ot;

	/**
	 * @param ot2
	 */
	public ProduceClass(OpThread ot) {
		// TODO Auto-generated constructor stub
		this.ot = ot;
	}

	public OpThread getOt() {
		return ot;
	}

	public void setOt(OpThread ot) {
		this.ot = ot;
	}

	public void run() {
		ot.producer(num);
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

}

// 消费类
class ConsumeClass extends Thread {
	private int num;
	private OpThread ot;

	/**
	 * @param ot2
	 */
	public ConsumeClass(OpThread ot) {
		// TODO Auto-generated constructor stub
		this.ot = ot;
	}

	public void run() {
		ot.consumer(num);
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public OpThread getOt() {
		return ot;
	}

	public void setOt(OpThread ot) {
		this.ot = ot;
	}

}
