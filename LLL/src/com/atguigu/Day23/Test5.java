package com.atguigu.Day23;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Test5 {
public static void main(String[] args) {
//	SellTicket2  st = new SellTicket2();
//	 new Thread(st).start();
     SellTicket3 s1 = new SellTicket3();
     SellTicket3 s2= new SellTicket3();
     SellTicket3 s3 = new SellTicket3();
     s1.start();
     s2.start();
     s3.start();
}

}
class SellTicket2 implements Runnable{
	 int tickets =100;

	@Override
	public void run() {
		while(true) {
			if(tickets<=0) {
				System.out.println("票已售完");
				break;
			}
			System.out.println(Thread.currentThread().getName()+"票已售完"+(--tickets));
		}
		
	}
	 
}
class SellTicket3 extends Thread{
	 int tickets = 100;
	  public void run() {
		  while(true) {
			  if(tickets<=0) {
			System.out.println("票已售完");
			break;
				  
			  }
		  System.out.println(Thread.currentThread().getName()+"票已售完："+(--tickets));
		  }
	  }
}