package com.atguigu.Day23;
/*1. ������Ŀ����:��д�������ܶ��̳߳��������ܳ���Ϊ30��
�ڹ������ÿ����10�����һ�ν����
���ӵ��ٶ���10��ÿ��,����ÿ����10�����ߵ�ʱ��10��
�ڹ���ٶ���1��ÿ��,�ڹ�ÿ����10�׵�����ʱ����1��
2. �������˼·Ҫ��
1)�ڹ궨��һ���߳�,���Ӷ���һ���߳�
2)�����߳�ͬʱ����
3)��ʾ������ʹ��Thread.sleep(������)��ģ���ʱ
*/
public class Test7 {
   public static void main(String[] args) {
   wugui w =new wugui();
   tuzi t = new tuzi();
   w.start();
   t.start();
   }
}
class  wugui extends Thread{
	 public void run() {
		 for(int i = 1; i<30;i++) {
			 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 System.out.println("�ڹ�����"+i+"��");
			 if(i==30) {
				 System.out.println("�ڹ굽�յ���");
			 }
			 if(i%10==0) {
				 try {
					 Thread.sleep(1000);
				 }catch(InterruptedException e) {
					 e.printStackTrace();
				 }
			 }	 }
	 }
}
class tuzi extends Thread{
	public void run() {
		for(int i = 0;i<=30;i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("��������"+i+"��");
			if(i==30) {
				System.out.println("�����ܵ����յ�");
				break;
			}
			if(i%10==0) {
			     try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}