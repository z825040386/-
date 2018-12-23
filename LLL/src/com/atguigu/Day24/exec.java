package com.atguigu.Day24;
// 使用两个线程打印 1-100. 线程1, 线程2 交替打印
public class exec {
 public static void main(String[] args) {
	PrintNum pn = new PrintNum();
	Thread t1 = new Thread(pn);
	Thread t2 = new Thread(pn);
	t1.setName("郝厚生");
	t2.setName("张航");
	t1.start();
	t2.start();
}
}
class PrintNum implements Runnable{
	  int num = 1;

	@Override
	public void run() {
		while(true) {
			synchronized(this) {//线程同步
				this.notifyAll();//通知
				if(num>100) {
					break;
				}
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			System.out.println(Thread.currentThread().getName()+"的当前数字为："+(num++));
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		}
		
	}
	  
}