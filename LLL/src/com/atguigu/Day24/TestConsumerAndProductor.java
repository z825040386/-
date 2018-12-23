package com.atguigu.Day24;



/*
 *  案例：
 * 生产者(Productor)将产品交给店员(Clerk)，
 * 而消费者(Customer)从店员处取走产品，店员一次只能持有固定数量的产品(比如:20），
 * 如果生产者试图生产更多的产品，店员会叫生产者停一下，如果店中有空位放产品了再通知生产者继续生产；如果店中没有产品了，
 * 店员会告诉消费者等一下，如果店中有产品了再通知消费者来取走产品。
 */
public class TestConsumerAndProductor {
 public static void main(String[] args) {
		       Clerk c = new Clerk();//仓库
		       Productor p = new Productor(c);
		       Consumer co = new Consumer(c);
		       p.start();
		       co.start();
}
}
//店员
class Clerk{
	 int products = 0;//产品余额
	 //生产产品
	 public synchronized void save() {
		 if(products>=20) {
			 try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
	   System.out.println("生产者生产了一件产品，目前库存为："+(++products));
	   this.notify();//唤醒正在等待的其他线程（消费者）
	 }
	 //消费产品
	 public synchronized void get() {
		 if(products<1) {
			 try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 System.out.println("消费者消费了一件产品，目前库存为："+(--products));
			 this.notify();//唤醒正在等待的其他线程（生产者）
		 }
	 }
}
//消费者
class Consumer extends Thread{
	private Clerk c;
	public Consumer(Clerk c) {
		this.c =c;
	}
	public void run() {
		while(true) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		       c.get();
		}
	}
}
// 生产者
 class Productor extends Thread{
	 private Clerk c;
	 public Productor(Clerk c) {
		 this.c =  c;
	 }
		 
		 public void run() {
			 while(true){
				 try {
					Thread.sleep(20);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 //生产产品（调用生产产品的方法）
				 c.save();
		 }
	 }
 }