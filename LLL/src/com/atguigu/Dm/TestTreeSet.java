package com.atguigu.Dm;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * ����������ϰMap�ӿڵ�ʹ�úͱ�����ʽ
 * @author liyuting
 * ������ʹ��Map��Ӽ���Ա������Ҫ�����Ա��
ֵ��Ա������

��������ʾ����>18000��Ա��

Ա���ࣺ���������ʡ����
Ҫ�������ͱ��һ����Ա��Ϊͬһ��Ա������

 *
 */
public class TestTreeSet {
	
	public static void main(String[] args) {
		Map map = new HashMap();
		
		map.put(new Employee1("����", 20000, 1), 10000);
		map.put(new Employee1("����", 10000, 2), 20000);
		map.put(new Employee1("����", 30000, 3),30000);
		map.put(new Employee1("����", 40000, 4), 40000);
		map.put(new Employee1("����", 20000, 1), 10000);
		s2(map);
		//����
		
//		Set keys = map.keySet();
//		
//		for (Object object : keys) {//object�������������ͣ�Employee
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