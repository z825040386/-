package com.atguigu.Dm;

import java.util.Arrays;

/*1.定义Person类，里面有name、专业（Major类型），体重属性，进行合理封装，并提供有参构造

Major类有专业名和学时属性，并进行合理封装，提供有参构造

使用Arrays类的方法，对长度为5的Person数组进行自然排序和定制排序，要求先按体重比，如果体重一样，按专业学时比*/
public class Lx {
	public static void main(String[] args) {
	    Person[] p = new Person[5];
	    p[0] = new Person("速度", new Major("数控", 6), 120);
	    p[1] = new Person("kjh", new Major("数控", 9), 20);
	    p[2] = new Person("个", new Major("数控", 6), 100);
	    p[3] = new Person("放大", new Major("数控", 5), 160);
	    p[4] = new Person("请问", new Major("数控", 1), 170);
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