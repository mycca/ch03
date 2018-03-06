package cn.itcast.day1;

/*
 * 线程的基本方法：
 * 		构造方法：
 * 		public Thread()
 * 		public Thread(String name)
 * 
 * 		普通方法：
 * 			public final String getName()
 * 			public final void setName(String name)
 * 			public static Thread currentThread()获取当前运行线程
 * 			
 */
public class Demo01Thread {
	public static void main(String[] args) {
		Thread thread= new Thread();
		thread.setName("唐嫣");
		System.out.println(thread.getName());
		
		Thread currentThread = thread.currentThread();
		System.out.println(currentThread);
	}
}
