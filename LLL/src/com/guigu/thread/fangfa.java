package com.guigu.thread;
/*
 * ����������ʾ�̵߳ĳ�������֮һ��
 * setName �����̶߳�������
 * getNmae ��ȡ�̶߳�������
 * ע�� ���߳�������������ƣ�ϵͳ���Զ��ṩĬ�����ƣ�Thread-0
 */
public class fangfa {
  public static void main(String[] args) {
	 Thread1 a = new Thread1("NNN");
//	 a.setName("sss");
	 a.start();
	 
}
}
class Thread1 extends Thread{
	public Thread1(String name) {
		super(name);
	}
	public void run() {
		for(int i = 0;i<=1000;i++) {
			System.out.println(Thread.currentThread().getName()+"------------"+i);
					}
	}
}
