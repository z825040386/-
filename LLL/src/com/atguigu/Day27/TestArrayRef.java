package com.atguigu.Day27;

import java.util.function.Function;

import org.junit.Test;

public class TestArrayRef {
 @Test
 public void test() {
	 //ʹ�������ڲ���
	 Function<Integer,String[]> fun = new Function<Integer,String[]>(){

		@Override
		public String[] apply(Integer t) {
			return  new String[t];
		}		 
	 };
  //ʹ����������
	 Function<Integer,String[]> fun2 = String[]:: new;
	 String[] apply = fun2.apply(10);
	 for(String string: apply) {
		 System.out.println(string);
	 }
 }
}
