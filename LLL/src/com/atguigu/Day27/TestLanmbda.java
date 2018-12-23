package com.atguigu.Day27;

import java.util.Comparator;
import java.util.TreeSet;

import org.junit.Test;

public class TestLanmbda {
	@Test
	public void test1() {
		//ʹ�������ڲ���
		TreeSet<String> set = new TreeSet<>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				System.out.println("�����");
				return o1.compareTo(o2);
			}});
	 //ʹ��lambdda���ʽ
		TreeSet<String> set2 = new TreeSet<>((String o1, String o2)->{
			System.out.println("�����");
			return o1.compareTo(o2);});
	}
	// ���﷨���������Ϳ���ʡ��
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
	//  ���Ҳ�ֻ��һ�仰��������ſ���ʡ�ԣ�����������е�һ�仰Ϊreturn��䣬��return����ʡ��
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
				System.out.println("����");
				
			}
			 
		 };
		 //ʹ��Lambada���ʽ
		 Runnable run2 = ()-> System.out.println("����");
		run2.run();
	}
   @Test
   public void test() {
//	   Thread t = new Thread(new Runnable() {
//
//		@Override
//		public void run() {
//			System.out.println("��Ҫ������.");
//			
//		}
//		   
//	   });
//      t.start();
      //ʹ��Lambda
      Thread t = new Thread(()->System.out.println("��Ҳû��"));
      t.start();
   }
}
