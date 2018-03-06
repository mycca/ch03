package cn.itcast.day1;

/*
 * 多线程实现方式一：
 * 		继承Thread类：
 * 			1：自定义线程类，继承Thread类
 * 			2：重写run方法
 * 			3：创建自定义线程类对象
 * 			4：调用线程start方法，开启线程
 * 			public void start()使该线程开始执行；
 * 			Java 虚拟机调用该线程的 run 方法。 
 */
public class Demo02MyThread {
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		MyThread myThread2 = new MyThread();

		myThread.start();
		myThread2.start();
	}
}
