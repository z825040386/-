package com.atguigu.Day24;
// ��������2���˻��ֱ���ͬһ������ȡǮ��10000����ÿ�ζ�ȡ1000
public class TestCommunication {
	public static void main(String[] args) {
	
 WithDraw w = new WithDraw();
   Thread t = new Thread(w);
   Thread t1 = new Thread(w);
   t.setName("���");
   t1.setName("�º���");
   t.start();
   t1.start();
	}
}
class WithDraw implements Runnable{
	int balance = 10000;//������Դ

	@Override
	public void run() {
	    	while(true) {
	    		synchronized(this) {
	    			this.notify();//֪ͨ�Է��߳�
	    			if(balance<=0) {
	    				System.out.println("�������Ϊ0��������");
	    				break;
	    			}
	    	     try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    	     System.out.println(Thread.currentThread().getName()+"ȡ��1000�����Ϊ"+(balance-=1000));
	    		  try {
					this.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}//���̵߳ȴ�
	    		}	
	    }
		
	}
}