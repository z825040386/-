package com.atguigu.Day27;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;

import org.junit.Test;

public class TestMethod {
//测试 对象名：：普通方法
@Test
public void test1() {
	//使用匿名内部类
	Runnable r1 = new Runnable() {
		public void  run() {
			System.out.println();
		}
	};
      r1.run();
      //使用Lanmda表达式
      Runnable r2 = ()->System.out.println();
      //z使用引用方法
      Runnable r3 = System.out::println;
      r3.run();
}
//测试 对象名：：普通方法
@Test
public void test2() {
	//使用匿名内部类
	 Consumer<String>con = new Consumer<String>() {

		@Override
		public void accept(String t) {
			System.out.println(t);
		}	 
	 };
	 //使用方法引用
	 Consumer<String> com2 = System.out::println;
	  com2.accept("hass");
}
//测试 类名:: 静态方法
@Test
public void test3() {
	//使用匿名内部类
	Comparator<Double> com1 = new Comparator<Double>() {

		@Override
		public int compare(Double o1, Double o2) {
			return Double.compare(o1, o2);
		}
		
	};
	//使用Lambda
	Comparator<Double> com2 =(o1,o2)->Double.compare(o1, o2);
	//使用方法引用
	 Comparator<Double> com3 = Double::compare;
}
//测试 类名：：普通方法
@Test
public void test4() {
	//shiyongnimingneibulei
	Function<Employee,String> fun = new Function<Employee,String>() {

		@Override
		public String apply(Employee t) {
			return t.getName();
		}
	};
   //使用方法引用
	Function<Employee,String> fun2 = Employee::getName;
	System.out.println(fun2.apply(new Employee(1, "传则韩", 2, '男', 30000)));

}












}
 