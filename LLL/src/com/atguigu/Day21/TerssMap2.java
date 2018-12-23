package com.atguigu.Day21;


import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;



public class TerssMap2{
	 public static void main(String[] args) {
		  TreeMap t = new TreeMap();
		  t.put(new Car1("G500", 120000), 3000.0);
		  t.put(new Car1("°ÂµÏA8", 160000), 2000.0);
		  t.put(new Car1("°ÔµÀ", 1203000), 5222.0);
           MapUtills.printMap2(t);
}
}
 class Car1 implements Comparable{

	private String name;
	private double price;

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
	public Car1(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", price=" + price + "]";
	}
	@Override
	public int compareTo(Object o) {
		Car1 c = (Car1) o;
		return Double.compare(this.price, c.price);
	}

	
	
 }

