package cn.itcast.day1;

/*
 * 多线程实现方式二：
 * 		实现Runnable接口：
 * 			1：自定义Runnable 的子类(非线程类，执行目标类)。在该类当中会定义线程的执行代码。
 * 			2：重写run方法
 * 			3：使用：public Thread(Runnable target)
 * 				  public Thread(Runnable target,String name)
 * 				1)创建Runnable子类对象
 * 				2)使用Runnable子类对象创建线程对象
 * 				3)开启线程
 */
public class Demo03Runnable {
	public static void main(String[] args) {
		MyRunnable mr = new MyRunnable();
		Thread thread = new Thread(mr, "唐嫣");
		Thread thread2 = new Thread(mr, "柳岩");

		thread.start();
		thread2.start();

		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}
}
