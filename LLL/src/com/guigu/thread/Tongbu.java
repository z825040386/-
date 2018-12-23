package com.guigu.thread;

public class Tongbu {
 public static void main(String[] args) {
	 SellTicket st =  new SellTicket();
	 Thread t1 = new Thread(st);
	 t1.setName("ss");
	 t1.start();
	 
	 Thread t2  = new Thread(st);
	 t2.setName("dd");
	 t2.start();
	 Thread t3 = new Thread(st);
	 t3.setName("cc");
	 t3.start();			 
}
}
class SellTicket implements Runnable{
	int tickets = 100;
	boolean loop = true;
	public void run() {
		while(loop) {
			method();
		}
	}
	public synchronized void method() {
		if(tickets <=0) {
			System.out.println("票已经售完");
			loop = false;
			return;
		}
	  try {
		Thread.sleep(10);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  System.out.println(Thread.currentThread().getName()+"卖了一张票 目前是："+(--tickets));
	}
}