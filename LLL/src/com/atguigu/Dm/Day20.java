package com.atguigu.Dm;

import java.util.Comparator;
import java.util.TreeSet;

import org.junit.Test;

/*1. 定义一个Employee类，
该类包含：private成员变量name,birthday，其中 birthday 为 MyDate 类的对象；
并为每一个属性定义 getter, setter 方法；
并重写 toString 方法输出 name, age, birthday
 
MyDate类包含:
private成员变量month,day,year；并为每一个属性定义 getter, setter 方法；
 
创建该类的 5 个对象，并把这些对象放入 TreeSet 集合中，对集合中的元素进行排序，并遍历输出：
 
1). 使Employee实现Comparable 接口，并按 name和birthday排序
*/
public class Day20 {
     public static void main(String[] args) {
		TreeSet set = new TreeSet();
		set.add(new Employee("好后生",new MyDate(2008, 1, 1)));
		set.add(new Employee("郝大生",new MyDate(2006, 1, 1)));
		set.add(new Employee("好二声",new MyDate(1998, 5, 4)));
		set.add(new Employee("好三生",new MyDate(1995, 4, 23)));
		set.add(new Employee("好四声",new MyDate(2008, 2, 1)));
		CollectionUtils.printCol1(set);;
		
	}
     private void Test() {

     TreeSet set = new TreeSet(new Comparator() {

		@Override
		public int compare(Object o1, Object o2) {
			 Employee e1 =  (Employee) o1;
			 Employee e2 =  (Employee) o2;
			 int compareTo = e1.getBirthday().compareTo(e2.getBirthday());
			 if(compareTo!=0)
				 return compareTo;
			 return e1.getName().compareTo(e2.getName());
		}
	});
		set.add(new Employee("好后生",new MyDate(2008, 1, 1)));
		set.add(new Employee("郝大生",new MyDate(2006, 1, 1)));
		set.add(new Employee("好二声",new MyDate(1998, 5, 4)));
		set.add(new Employee("好三生",new MyDate(1995, 4, 23)));
		set.add(new Employee("好四声",new MyDate(2008, 2, 1)));
		CollectionUtils.printCol1(set);;
     }
}
 
class Employee  implements Comparable {
	private String name;
	private MyDate birthday;

	public Employee(String name, MyDate birthday) {
		super();
		this.name = name;
		this.birthday = birthday;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MyDate getBirthday() {
		return birthday;
	}

	public void setBirthday(MyDate birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", birthday=" + birthday + "]";
	}

	@Override
	public int compareTo(Object o) {
		Employee e = (Employee)o;
		int c = this.birthday.compareTo(e.birthday);
		 if(c>0)
			 return 1;
		 else if(c<0)
			 return -1;
		 return this.name.compareTo(e.name);
	}


}

class MyDate implements Comparator{
	private int month;
	private int day;
 	private int year;

	public MyDate(int month, int day, int year) {
		super();
		this.month = month;
		this.day = day;
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "MyDate [month=" + month + ", day=" + day + ", year=" + year + "]";
	}

	public int compareTo(Object o) {
		MyDate d = (MyDate) o;
		if(this.year>d.getYear())
			return 1;
		else if (this.year<d.getYear())
			return -1;
		else if (this.month>d.getMonth())
			return 1;
		else if (this.month<d.getMonth())
			return -1;
		 return this.day-this.getDay();

	}

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}