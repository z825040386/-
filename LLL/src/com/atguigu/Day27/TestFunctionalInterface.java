package com.atguigu.Day27;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import org.junit.Test;

public class TestFunctionalInterface {
@Test //消费型接口 
public void test1() {
	//使用匿名内部类
	Consumer<Integer> con = new Consumer<Integer>() {

		@Override
		public void accept(Integer t) {
			if(t>1000) {
				System.out.println("桑拿遇");
			}else if(t>500){
					System.out.println("盲人按摩");
			}else {
				System.out.println("冲个凉水澡");
				}
		}
		};
          Consumer<Integer> com1 = t->{
        	  if(t>1000) {
  				System.out.println("桑拿遇");
  			}else if(t>500){
  					System.out.println("盲人按摩");
  			}else {
  				System.out.println("冲个凉水澡");
  				}
          };
          com1.accept(200);
}
//测试Function  函数型接口
@Test
 public void test2() {
	//使用匿名内部类
	Function<String,Integer> fun = new Function<String,Integer>() {

		@Override
		public Integer apply(String t) {
			return  t.length();
		}
	};
   Function<String,Integer> fun1 = t->t.length();
   System.out.println(fun1.apply("郝厚生长得多"));
}
//测试Predicate 断定型接口
@Test
public void test3() {
	//使用匿名内部类
	Predicate<String> pre = new Predicate<String>() {

		@Override
		public boolean test(String t) {
			return t.length()==6;
		}
		
	};
    Predicate<String> pre1 = t->t.length()==6;
    System.out.println(pre1.test("612346"));
}


















}