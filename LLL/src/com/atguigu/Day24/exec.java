package com.atguigu.Day24;
// ʹ�������̴߳�ӡ 1-100. �߳�1, �߳�2 �����ӡ
public class exec {
 public static void main(String[] args) {
	PrintNum pn = new PrintNum();
	Thread t1 = new Thread(pn);
	Thread t2 = new Thread(pn);
	t1.setName("�º���");
	t2.setName("�ź�");
	t1.start();
	t2.start();
}
}
class PrintNum implements Runnable{
	  int num = 1;

	@Override
	public void run() {
		while(true) {
			synchronized(this) {//�߳�ͬ��
				this.notifyAll();//֪ͨ
				if(num>100) {
					break;
				}
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			System.out.println(Thread.currentThread().getName()+"�ĵ�ǰ����Ϊ��"+(num++));
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