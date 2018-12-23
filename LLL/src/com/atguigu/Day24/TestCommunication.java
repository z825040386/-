package com.atguigu.Day24;
// 案例：有2个账户分别向同一个卡上取钱（10000），每次都取1000
public class TestCommunication {
	public static void main(String[] args) {
	
 WithDraw w = new WithDraw();
   Thread t = new Thread(w);
   Thread t1 = new Thread(w);
   t.setName("杨豪");
   t1.setName("郝厚生");
   t.start();
   t1.start();
	}
}
class WithDraw implements Runnable{
	int balance = 10000;//共享资源

	@Override
	public void run() {
	    	while(true) {
	    		synchronized(this) {
	    			this.notify();//通知对方线程
	    			if(balance<=0) {
	    				System.out.println("卡上余额为0，清续费");
	    				break;
	    			}
	    	     try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    	     System.out.println(Thread.currentThread().getName()+"取了1000，余额为"+(balance-=1000));
	    		  try {
					this.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}//让线程等待
	    		}	
	    }
		
	}
}