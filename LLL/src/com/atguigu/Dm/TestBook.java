package com.atguigu.Dm;

import java.util.ArrayList;
import java.util.Collection;

public class TestBook{
	public static void main(String[] args) {
		 Collection c = new ArrayList();
		 
	     c.add(new Book("���μ�", 600,"��ж�"));
	     c.add(new Book("��¥��", 80,"��ѩ��"));
	     c.add(new Book("ˮ䰴�", 6660,"ʩ�˶�"));
	     c.add(new Book("��������", 620,"�޹���"));
	     System.out.println(c);
	     
	     /*c.add(new Book("����",20,"�¶���"));
	     System.out.println(c);
	     
	     c.remove(new Book("��¥��", 80,"��ѩ��"));
	     System.out.println(c);
	     boolean contains= c.contains(new Book("��¥��", 80,"��ѩ��"));
	     System.out.println(contains);*/
		}
}
class Book{
	  private String name;
	  private double price;
	  private  String Zz;
	  
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Zz == null) ? 0 : Zz.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (Zz == null) {
			if (other.Zz != null)
				return false;
		} else if (!Zz.equals(other.Zz))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}
	public Book(String name, double price, String zz) {
		super();
		this.name = name;
		this.price = price;
		Zz = zz;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getZz() {
		return Zz;
	}
	public void setZz(String zz) {
		Zz = zz;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + ", Zz=" + Zz + "]";
	}
	  
}