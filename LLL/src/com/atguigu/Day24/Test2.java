package com.atguigu.Day24;

import org.junit.Test;

public class Test2 {
	@Test
  public void test() {
	   Class  c = Student.class;
	   System.out.println("全类名"+ c.getName());
	   System.out.println("简单类名"+ c.getSimpleName());
	   System.out.println("包名"+ c.getPackage());
	   System.out.println("父类"+ c.getSuperclass());  
  }
	@Test
	public void test1() {
		Student s = new Student();
		 Class c = s.getClass();
		 System.out.println("全类名"+ c.getName());
		   System.out.println("简单类名"+ c.getSimpleName());
		   System.out.println("包名"+ c.getPackage());
		   System.out.println("父类"+ c.getSuperclass());  
	}
       @Test
       public void test2() throws ClassNotFoundException {
       Class c = Class.forName("bean.Student");
       System.out.println("全类名"+ c.getName());
	   System.out.println("简单类名"+ c.getSimpleName());
	   System.out.println("包名"+ c.getPackage());
	   System.out.println("父类"+ c.getSuperclass());  
}
}