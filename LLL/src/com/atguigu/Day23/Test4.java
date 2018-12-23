package com.atguigu.Day23;

public class Test4 {
   public static void main(String[] args) {
//	SellTicket s1 = new SellTicket();
//	SellTicket s2 = new SellTicket();
//	SellTicket s3 = new SellTicket();
//	s1.start();
//	s2.start();
//	s3.start();
	   SellTicket1 s = new SellTicket1();
	   new Thread(s).start();
//	   new Thread(s).start();
//	   new Thread(s).start();
	}
  
}
class SellTicket1 implements Runnable{
	int tickets = 100; 
	@Override 
	public void run() {
		while(true) {
			if(tickets <=0) {
				System.out.println("票已售完"+(--tickets));
				break;
			}
		System.out.println(Thread.currentThread().getName()+"卖了一张票，现在是"+(--tickets));
		}
	}
	
}
//class SellTicket extends Thread{
//    int tickets = 100;
//   @Override
//    public void run() {
//    	while(true) {
//    		if(tickets<=0) {
//    			System.out.println("票已经售完了");
//    			break;
//    		}
//    	System.out.println(Thread.currentThread().getName()+"卖了一张票"+(--tickets));
//    	}
////    }
//}
