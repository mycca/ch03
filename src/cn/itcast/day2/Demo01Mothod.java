package cn.itcast.day2;

/*
 * 
 * 		public final int getPriority()获取优先级
 * 		public final void setPriority(int newPriority)更改优先级
 * 	public static void sleep(long millis) throws InterruptedException  将当前线程休眠，指定毫秒值
 * public final void join()  等待该线程终止。 即当前线程等待调用join方法的线程执行结束..加入线程：
 * public static void yield()暂停当前正在执行的线程对象，并执行其他线程..线程礼让
 * public final void setDaemon(boolean on)设置守护线程的方法
 * public void interrupt()  抛出异常，处理异常，后边代码继续执行,线程中断
 *  stop方法直接停止线程，方法过于暴力。直接导致sleep后的代码无法执行。
 */
public class Demo01Mothod {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.setName("唐嫣");
		// mt.setPriority(10);
		System.out.println(mt.getPriority());

		MyThread mt2 = new MyThread();
		mt2.setName("柳岩");
		mt2.setPriority(1);

		mt.start();
		mt2.start();
		// mt.sleep(3000);
	}
}
