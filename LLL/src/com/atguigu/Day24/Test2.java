package com.atguigu.Day24;

import org.junit.Test;

public class Test2 {
	@Test
  public void test() {
	   Class  c = Student.class;
	   System.out.println("ȫ����"+ c.getName());
	   System.out.println("������"+ c.getSimpleName());
	   System.out.println("����"+ c.getPackage());
	   System.out.println("����"+ c.getSuperclass());  
  }
	@Test
	public void test1() {
		Student s = new Student();
		 Class c = s.getClass();
		 System.out.println("ȫ����"+ c.getName());
		   System.out.println("������"+ c.getSimpleName());
		   System.out.println("����"+ c.getPackage());
		   System.out.println("����"+ c.getSuperclass());  
	}
       @Test
       public void test2() throws ClassNotFoundException {
       Class c = Class.forName("bean.Student");
       System.out.println("ȫ����"+ c.getName());
	   System.out.println("������"+ c.getSimpleName());
	   System.out.println("����"+ c.getPackage());
	   System.out.println("����"+ c.getSuperclass());  
}
}