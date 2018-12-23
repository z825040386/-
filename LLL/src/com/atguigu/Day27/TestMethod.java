package com.atguigu.Day27;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;

import org.junit.Test;

public class TestMethod {
//���� ������������ͨ����
@Test
public void test1() {
	//ʹ�������ڲ���
	Runnable r1 = new Runnable() {
		public void  run() {
			System.out.println();
		}
	};
      r1.run();
      //ʹ��Lanmda���ʽ
      Runnable r2 = ()->System.out.println();
      //zʹ�����÷���
      Runnable r3 = System.out::println;
      r3.run();
}
//���� ������������ͨ����
@Test
public void test2() {
	//ʹ�������ڲ���
	 Consumer<String>con = new Consumer<String>() {

		@Override
		public void accept(String t) {
			System.out.println(t);
		}	 
	 };
	 //ʹ�÷�������
	 Consumer<String> com2 = System.out::println;
	  com2.accept("hass");
}
//���� ����:: ��̬����
@Test
public void test3() {
	//ʹ�������ڲ���
	Comparator<Double> com1 = new Comparator<Double>() {

		@Override
		public int compare(Double o1, Double o2) {
			return Double.compare(o1, o2);
		}
		
	};
	//ʹ��Lambda
	Comparator<Double> com2 =(o1,o2)->Double.compare(o1, o2);
	//ʹ�÷�������
	 Comparator<Double> com3 = Double::compare;
}
//���� ����������ͨ����
@Test
public void test4() {
	//shiyongnimingneibulei
	Function<Employee,String> fun = new Function<Employee,String>() {

		@Override
		public String apply(Employee t) {
			return t.getName();
		}
	};
   //ʹ�÷�������
	Function<Employee,String> fun2 = Employee::getName;
	System.out.println(fun2.apply(new Employee(1, "����", 2, '��', 30000)));

}












}
 