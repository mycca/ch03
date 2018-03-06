package cn.itcast.day1;

/*
 * 定义线程类
 *  * 多线程实现方式一：
 * 		继承Thread类：
 * 			1：自定义线程类，继承Thread类
 * 			2：重写run方法
 * 			3：创建自定义线程类对象
 * 			4：调用线程start方法，开启线程
 * 			public void start()使该线程开始执行；
 * 			Java 虚拟机调用该线程的 run 方法。 
 */
public class MyThread extends Thread {
	//run方法：该线程所要执行的代码。
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(getName() + ":" + i);
		}
	}
}
