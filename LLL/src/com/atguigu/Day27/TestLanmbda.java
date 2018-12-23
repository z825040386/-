package com.atguigu.Day27;

import java.util.Comparator;
import java.util.TreeSet;

import org.junit.Test;

public class TestLanmbda {
	@Test
	public void test1() {
		//使用匿名内部类
		TreeSet<String> set = new TreeSet<>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				System.out.println("会更好");
				return o1.compareTo(o2);
			}});
	 //使用lambdda表达式
		TreeSet<String> set2 = new TreeSet<>((String o1, String o2)->{
			System.out.println("会更好");
			return o1.compareTo(o2);});
	}
	// 简化语法：参数类型可以省略
	@Test
	public void test2() {
		TreeSet<String> set = new TreeSet<>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				System.out.println("aaa");
				return o1.compareTo(o2);
			}});
		TreeSet<String> set3 = new TreeSet<>((o1,o2)->{
			System.out.println("aaa");
			return o1.compareTo(o2);});
	}
	//  当右侧只有一句话，则大括号可以省略，而且如果仅有的一句话为return语句，则return可以省略
	@Test
	public void test3() {
		Comparable<Integer> com = new Comparable<Integer>() {

			@Override
			public int compareTo(Integer o) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
			Comparable<Integer> com2 = o->{return 0;};
 	}
	@Test
	public void test5() {
		 Runnable run1 = new Runnable() {

			@Override
			public void run() {
				System.out.println("跑了");
				
			}
			 
		 };
		 //使用Lambada表达式
		 Runnable run2 = ()-> System.out.println("跑了");
		run2.run();
	}
   @Test
   public void test() {
//	   Thread t = new Thread(new Runnable() {
//
//		@Override
//		public void run() {
//			System.out.println("我要跑跑跑.");
//			
//		}
//		   
//	   });
//      t.start();
      //使用Lambda
      Thread t = new Thread(()->System.out.println("再也没有"));
      t.start();
   }
}
