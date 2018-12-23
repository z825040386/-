package com.atguigu.Dm;

import java.util.Comparator;
import java.util.TreeSet;

import org.junit.Test;

/*1. ����һ��Employee�࣬
���������private��Ա����name,birthday������ birthday Ϊ MyDate ��Ķ���
��Ϊÿһ�����Զ��� getter, setter ������
����д toString ������� name, age, birthday
 
MyDate�����:
private��Ա����month,day,year����Ϊÿһ�����Զ��� getter, setter ������
 
��������� 5 �����󣬲�����Щ������� TreeSet �����У��Լ����е�Ԫ�ؽ������򣬲����������
 
1). ʹEmployeeʵ��Comparable �ӿڣ����� name��birthday����
*/
public class Day20 {
     public static void main(String[] args) {
		TreeSet set = new TreeSet();
		set.add(new Employee("�ú���",new MyDate(2008, 1, 1)));
		set.add(new Employee("�´���",new MyDate(2006, 1, 1)));
		set.add(new Employee("�ö���",new MyDate(1998, 5, 4)));
		set.add(new Employee("������",new MyDate(1995, 4, 23)));
		set.add(new Employee("������",new MyDate(2008, 2, 1)));
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
		set.add(new Employee("�ú���",new MyDate(2008, 1, 1)));
		set.add(new Employee("�´���",new MyDate(2006, 1, 1)));
		set.add(new Employee("�ö���",new MyDate(1998, 5, 4)));
		set.add(new Employee("������",new MyDate(1995, 4, 23)));
		set.add(new Employee("������",new MyDate(2008, 2, 1)));
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