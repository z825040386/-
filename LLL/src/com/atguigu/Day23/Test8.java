package com.atguigu.Day23;

public class Test8 {
public static void main(String[] args) {
		
		StopDemo2 sd = new StopDemo2();
		sd.start();
		
		for(int i=1;i<=100;i++) {
			if(i==10) {
				//ֹͣStopDemo�߳�
				sd.setLoop(false);
				
			}
			System.out.println("�����������ĵ�Ӱ~");
		}

		
		
	}

}


class StopDemo2 extends Thread{
	
	boolean loop = true;
	
	@Override
	public void run() {
		
		while(loop) {
			
			System.out.println("���غ��Ά������������죬������~~~~");
		}
	}
	/*
	 * ���ܣ�����ѭ�����
	 */
	public void setLoop(boolean loop) {
		this.loop=loop;
	}
	
}
