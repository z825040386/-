package com.atguigu.Day23;

public class Test8 {
public static void main(String[] args) {
		
		StopDemo2 sd = new StopDemo2();
		sd.start();
		
		for(int i=1;i<=100;i++) {
			if(i==10) {
				//停止StopDemo线程
				sd.setLoop(false);
				
			}
			System.out.println("王宝宝正在拍电影~");
		}

		
		
	}

}


class StopDemo2 extends Thread{
	
	boolean loop = true;
	
	@Override
	public void run() {
		
		while(loop) {
			
			System.out.println("马蓉和宋喆正在愉快的聊天，哈哈哈~~~~");
		}
	}
	/*
	 * 功能：更新循环标记
	 */
	public void setLoop(boolean loop) {
		this.loop=loop;
	}
	
}
