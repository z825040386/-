package com.atguigu.Day24;
//使用两个线程打印 1-100. 线程1, 线程2 交替打印

public class Txet1 {
public static void main(String[] args) {
	   test s = new test();
	   Thread t = new Thread(s);
	   t.setName("A!");
	   t.start();
	   Thread t1 = new Thread(s);
	    t1.setName("B!");
	    t1.start();
}
}
class test implements Runnable{
   int  s =1; 
	@Override
	public void run() {
		while(true) {
			if(s>100) {
				System.out.println("线程结束100打印完毕");
			     break;
			}
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"当前数"+(s++));
		      
		}
	}
	
}