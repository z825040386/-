package com.atguigu.Day23;
//在main方法中创建并启动两个线程。第一个线程循环随机打印100以内的整数，
//直到第二个线程从键盘读取了“Q”命令。
public class Test3 {
public static void main(String[] args) {
	   StopDemo1 sd = new StopDemo1();
	   sd.start();
	   for(int i = 0;i<=100;i++) {
		   if(i==10) {
			   sd.setLoop(false);
		   }
	   System.out.println("郝厚生在吃屎");
	   }
	  }
}
class StopDemo1 extends Thread{
	boolean loop = true;
	@Override
	public void run() {
		while(loop) {
			 System.out.println("ssssssssss搜索");
		}
	}
	public void setLoop(boolean loop) {
		this.loop = loop;
	}
}