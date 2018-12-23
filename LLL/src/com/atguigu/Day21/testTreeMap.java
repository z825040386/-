package com.atguigu.Day21;

import java.util.Comparator;
import java.util.TreeMap;

public class testTreeMap {
	public static void main(String[] args) {
      TreeMap t = new TreeMap();
      t.put(new Car("耐克", 1000, "蓝色"),6000);
      t.put(new Car("阿迪", 2000, "红色"), 2018);
      t.put(new Car("赛赛", 6666,"粉色"), 423);
	}
}
class Car implements Comparable{	   
	   private String name;
	   private double price;
	   private String color;
	public Car(String name, double price, String color) {
		super();
		this.name = name;
		this.price = price;
		this.color = color;
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", price=" + price + ", color=" + color + "]";
	}
	@Override
	public int compareTo(Object o) {
		Car c =  (Car)o;
		
		return 0;
	}
	   
}