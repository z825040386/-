package com.atguigu.Day23;
//��main�����д��������������̡߳���һ���߳�ѭ�������ӡ100���ڵ�������
//ֱ���ڶ����̴߳Ӽ��̶�ȡ�ˡ�Q�����
public class Test3 {
public static void main(String[] args) {
	   StopDemo1 sd = new StopDemo1();
	   sd.start();
	   for(int i = 0;i<=100;i++) {
		   if(i==10) {
			   sd.setLoop(false);
		   }
	   System.out.println("�º����ڳ�ʺ");
	   }
	  }
}
class StopDemo1 extends Thread{
	boolean loop = true;
	@Override
	public void run() {
		while(loop) {
			 System.out.println("ssssssssss����");
		}
	}
	public void setLoop(boolean loop) {
		this.loop = loop;
	}
}