package com.guigu.thread;
/*
 * sleep:���� ��һ����̬�ķ��� �õ�ǰ�߳�����ָ���ĺ�����
 *     Thread.sleep(xxms)
 *     interrupt �ж� ��û������ֹͣ�̣߳�����жϵ��߳��������߻�wait 
 */
public class fangfa2 {
     public static void main(String[] args) {
		  SleepThread s = new SleepThread();
        s.start();
}
}
class SleepThread extends Thread{
	public void run() {
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			System.out.println("�º�����ʺ");
		}
//		for(int i = 0;i<=100;i++) {
//			try {
//				Thread.sleep(10);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		System.out.println("�º�����ʺ���");
//		}
	}
}
