package com.atguigu.Dm;

import java.util.Arrays;

/*1.����Person�࣬������name��רҵ��Major���ͣ����������ԣ����к����װ�����ṩ�вι���

Major����רҵ����ѧʱ���ԣ������к����װ���ṩ�вι���

ʹ��Arrays��ķ������Գ���Ϊ5��Person���������Ȼ����Ͷ�������Ҫ���Ȱ����رȣ��������һ������רҵѧʱ��*/
public class Lx {
	public static void main(String[] args) {
	    Person[] p = new Person[5];
	    p[0] = new Person("�ٶ�", new Major("����", 6), 120);
	    p[1] = new Person("kjh", new Major("����", 9), 20);
	    p[2] = new Person("��", new Major("����", 6), 100);
	    p[3] = new Person("�Ŵ�", new Major("����", 5), 160);
	    p[4] = new Person("����", new Major("����", 1), 170);
	    ss(p);
	    Arrays.sort(p);
	    System.out.println("---------------------------------------------");
	    }
    
	public static void ss(Object[] object) {
		      for(int i = 0;i<object.length;i++) {
		    	  System.out.println(object[i]);
		      }
	}
}
   class Person{
	       private String name;
	       private Major cc;
	       private double hight;
	       
		public Person(String name, Major cc, double hight) {
			super();
			this.name = name;
			this.cc = cc;
			this.hight = hight;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Major getCc() {
			return cc;
		}
		public void setCc(Major cc) {
			this.cc = cc;
		}
		public double getHight() {
			return hight;
		}
		public void setHight(double hight) {
			this.hight = hight;
		}
		@Override
		public String toString() {
			return name+"\t"+cc+"\t"+hight;
		}

   }
	class Major{
		 private String Zy;
		 private int times;
		public Major(String zy, int times) {
			super();
			Zy = zy;
			this.times = times;
		}
		public String getZy() {
			return Zy;
		}
		public void setZy(String zy) {
			Zy = zy;
		}
		public int getTimes() {
			return times;
		}
		public void setTimes(int times) {
			this.times = times;
		}
		@Override
		public String toString() {
			return Zy+"\t"+times;
		}
		 
		 
	}