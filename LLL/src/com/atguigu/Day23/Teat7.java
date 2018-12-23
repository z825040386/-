package com.atguigu.Day23;
/*
 * 此类演示线程的停止
 */
public class Teat7 {
 public static void main(String[] args) {
	 StopDemo s = new StopDemo();
	 s.start();
	 for(int i = 1;i<=100;i++) {
		 if(i==10) {
			 s.setLoop(false);
		 }
	 System.out.println("------郝厚生出完了");
	 }
}
}
class StopDemo extends Thread{
	 boolean loop = true;
	 
	 public void run() {
		 while(loop) {
			 System.out.println("郝厚生在吃屎，哈哈");
		 }
	 }
    public void setLoop(boolean loop) {
    	this.loop=loop;
    }
}