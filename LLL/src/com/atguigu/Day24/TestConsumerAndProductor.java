package com.atguigu.Day24;



/*
 *  ������
 * ������(Productor)����Ʒ������Ա(Clerk)��
 * ��������(Customer)�ӵ�Ա��ȡ�߲�Ʒ����Աһ��ֻ�ܳ��й̶������Ĳ�Ʒ(����:20����
 * �����������ͼ��������Ĳ�Ʒ����Ա���������ͣһ�£���������п�λ�Ų�Ʒ����֪ͨ�����߼����������������û�в�Ʒ�ˣ�
 * ��Ա����������ߵ�һ�£���������в�Ʒ����֪ͨ��������ȡ�߲�Ʒ��
 */
public class TestConsumerAndProductor {
 public static void main(String[] args) {
		       Clerk c = new Clerk();//�ֿ�
		       Productor p = new Productor(c);
		       Consumer co = new Consumer(c);
		       p.start();
		       co.start();
}
}
//��Ա
class Clerk{
	 int products = 0;//��Ʒ���
	 //������Ʒ
	 public synchronized void save() {
		 if(products>=20) {
			 try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
	   System.out.println("������������һ����Ʒ��Ŀǰ���Ϊ��"+(++products));
	   this.notify();//�������ڵȴ��������̣߳������ߣ�
	 }
	 //���Ѳ�Ʒ
	 public synchronized void get() {
		 if(products<1) {
			 try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 System.out.println("������������һ����Ʒ��Ŀǰ���Ϊ��"+(--products));
			 this.notify();//�������ڵȴ��������̣߳������ߣ�
		 }
	 }
}
//������
class Consumer extends Thread{
	private Clerk c;
	public Consumer(Clerk c) {
		this.c =c;
	}
	public void run() {
		while(true) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		       c.get();
		}
	}
}
// ������
 class Productor extends Thread{
	 private Clerk c;
	 public Productor(Clerk c) {
		 this.c =  c;
	 }
		 
		 public void run() {
			 while(true){
				 try {
					Thread.sleep(20);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 //������Ʒ������������Ʒ�ķ�����
				 c.save();
		 }
	 }
 }