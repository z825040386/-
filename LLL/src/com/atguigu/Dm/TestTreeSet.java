package com.atguigu.Dm;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 此类用于练习Map接口的使用和遍历方式
 * @author liyuting
 * 案例：使用Map添加几个员工对象，要求键：员工
值：员工工资

并遍历显示工资>18000的员工

员工类：姓名、工资、编号
要求：姓名和编号一样的员工为同一个员工！！

 *
 */
public class TestTreeSet {
	
	public static void main(String[] args) {
		Map map = new HashMap();
		
		map.put(new Employee1("张三", 20000, 1), 10000);
		map.put(new Employee1("李四", 10000, 2), 20000);
		map.put(new Employee1("王五", 30000, 3),30000);
		map.put(new Employee1("六六", 40000, 4), 40000);
		map.put(new Employee1("张三", 20000, 1), 10000);
		s2(map);
		//遍历
		
//		Set keys = map.keySet();
//		
//		for (Object object : keys) {//object变量的运行类型：Employee
//			
//			Employee1 e = (Employee1) object;
//			if(e.getPrice()>18000)
//				System.out.println(e);
	        	
	        }
	    public static void s2(Map map) {
	    	Set  entrys =  map.entrySet();
	    	  Iterator  a =entrys.iterator();
	    	  while(a.hasNext()) {
	    		  Map.Entry entry = (Entry) a.next();
	    		  Employee e =  (Employee) entry.getKey();
	    		
	}
		
	    }
}
class Employee1{
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Employee1 other = (Employee1) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	private String name;
	private double price;
	private int id;
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Employee1(String name, double price, int id) {
		super();
		this.name = name;
		this.price = price;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Employee1 [name=" + name + ", price=" + price + ", id=" + id + "]";
	}
	
}