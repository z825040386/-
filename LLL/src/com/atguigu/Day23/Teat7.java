package com.atguigu.Day23;
/*
 * ������ʾ�̵߳�ֹͣ
 */
public class Teat7 {
 public static void main(String[] args) {
	 StopDemo s = new StopDemo();
	 s.start();
	 for(int i = 1;i<=100;i++) {
		 if(i==10) {
			 s.setLoop(false);
		 }
	 System.out.println("------�º���������");
	 }
}
}
class StopDemo extends Thread{
	 boolean loop = true;
	 
	 public void run() {
		 while(loop) {
			 System.out.println("�º����ڳ�ʺ������");
		 }
	 }
    public void setLoop(boolean loop) {
    	this.loop=loop;
    }
}