package com.atguigu.Day23;


/*
 * 此类用于演示线程的创建并启动的两种基本方式
 * 相关的API
 * Thread
 *    start 方法： 启动线程，并执行该现成的任务体
 */
public class Test6 {
    public static void main(String[] args) {
//		MyThread m = new MyThread();
//		m.start();
		MyThread2 a = new MyThread2();
		Thread thread = new Thread(a);
		thread.start();
		for(int i = 0; i<=1000;i++) {
			System.out.println("-----------------llllllllLLLLLL"+i);
			
		}
	}
}
class MyThread extends Thread{
	public void run() {
		for(int i = 1; i<=1000;i++) {
			System.out.println("杨豪和好厚生在玩游戏"+i);
		}
	}
}
class MyThread2 implements Runnable{

	@Override
	public void run() {
		for(int i = 0;i<=1000;i++) {
			System.out.println(Thread.currentThread().getName()+"你在都地主"+i);
		}
		
	}
	
}