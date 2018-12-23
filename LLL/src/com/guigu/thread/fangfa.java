package com.guigu.thread;
/*
 * 此类用于演示线程的常见方法之一：
 * setName 设置线程对象名称
 * getNmae 获取线程对象名称
 * 注意 新线程如果不设置名称，系统将自动提供默认名称：Thread-0
 */
public class fangfa {
  public static void main(String[] args) {
	 Thread1 a = new Thread1("NNN");
//	 a.setName("sss");
	 a.start();
	 
}
}
class Thread1 extends Thread{
	public Thread1(String name) {
		super(name);
	}
	public void run() {
		for(int i = 0;i<=1000;i++) {
			System.out.println(Thread.currentThread().getName()+"------------"+i);
					}
	}
}
