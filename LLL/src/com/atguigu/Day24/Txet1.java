package com.atguigu.Day24;
//ʹ�������̴߳�ӡ 1-100. �߳�1, �߳�2 �����ӡ

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
				System.out.println("�߳̽���100��ӡ���");
			     break;
			}
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"��ǰ��"+(s++));
		      
		}
	}
	
}