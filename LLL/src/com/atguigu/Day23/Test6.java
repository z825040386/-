package com.atguigu.Day23;


/*
 * ����������ʾ�̵߳Ĵ��������������ֻ�����ʽ
 * ��ص�API
 * Thread
 *    start ������ �����̣߳���ִ�и��ֳɵ�������
 */
public class Test6 {
    public static void main(String[] args) {
//		MyThread m = new MyThread();
//		m.start();
		MyThread2 a = new MyThread2();
		Thread thread = new Thread(a);
		thread.start();
		for(int i = 0; i<=1000;i++) {
			System.out.println("-----------------llllllllLLLLLL"+i);
			
		}
	}
}
class MyThread extends Thread{
	public void run() {
		for(int i = 1; i<=1000;i++) {
			System.out.println("����ͺú���������Ϸ"+i);
		}
	}
}
class MyThread2 implements Runnable{

	@Override
	public void run() {
		for(int i = 0;i<=1000;i++) {
			System.out.println(Thread.currentThread().getName()+"���ڶ�����"+i);
		}
		
	}
	
}