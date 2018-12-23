package com.atguigu.Day23;
/*1. 案例题目描述:编写龟兔赛跑多线程程序，设赛跑长度为30米
乌龟和兔子每跑完10米输出一次结果。
兔子的速度是10米每秒,兔子每跑完10米休眠的时间10秒
乌龟的速度是1米每秒,乌龟每跑完10米的休眠时间是1秒
2. 案例完成思路要求：
1)乌龟定义一个线程,兔子定义一个线程
2)两个线程同时开启
3)提示：可以使用Thread.sleep(毫秒数)来模拟耗时
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
			 System.out.println("乌龟跑了"+i+"米");
			 if(i==30) {
				 System.out.println("乌龟到终点了");
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
			System.out.println("兔子跑了"+i+"米");
			if(i==30) {
				System.out.println("兔子跑到了终点");
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