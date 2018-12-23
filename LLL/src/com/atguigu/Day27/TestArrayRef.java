package com.atguigu.Day27;

import java.util.function.Function;

import org.junit.Test;

public class TestArrayRef {
 @Test
 public void test() {
	 //使用匿名内部类
	 Function<Integer,String[]> fun = new Function<Integer,String[]>(){

		@Override
		public String[] apply(Integer t) {
			return  new String[t];
		}		 
	 };
  //使用数组引用
	 Function<Integer,String[]> fun2 = String[]:: new;
	 String[] apply = fun2.apply(10);
	 for(String string: apply) {
		 System.out.println(string);
	 }
 }
}
