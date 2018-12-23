package com.guigu.thread;
/*
 * sleep:休眠 是一个静态的方法 让当前线程休眠指定的毫秒数
 *     Thread.sleep(xxms)
 *     interrupt 中断 并没有真正停止线程，如果中断的线程正在休眠或wait 
 */
public class fangfa2 {
     public static void main(String[] args) {
		  SleepThread s = new SleepThread();
        s.start();
}
}
class SleepThread extends Thread{
	public void run() {
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			System.out.println("郝厚生吃屎");
		}
//		for(int i = 0;i<=100;i++) {
//			try {
//				Thread.sleep(10);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		System.out.println("郝厚生吃屎完毕");
//		}
	}
}
