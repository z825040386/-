package com.atguigu.Day27;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import org.junit.Test;

public class TestFunctionalInterface {
@Test //�����ͽӿ� 
public void test1() {
	//ʹ�������ڲ���
	Consumer<Integer> con = new Consumer<Integer>() {

		@Override
		public void accept(Integer t) {
			if(t>1000) {
				System.out.println("ɣ����");
			}else if(t>500){
					System.out.println("ä�˰�Ħ");
			}else {
				System.out.println("�����ˮ��");
				}
		}
		};
          Consumer<Integer> com1 = t->{
        	  if(t>1000) {
  				System.out.println("ɣ����");
  			}else if(t>500){
  					System.out.println("ä�˰�Ħ");
  			}else {
  				System.out.println("�����ˮ��");
  				}
          };
          com1.accept(200);
}
//����Function  �����ͽӿ�
@Test
 public void test2() {
	//ʹ�������ڲ���
	Function<String,Integer> fun = new Function<String,Integer>() {

		@Override
		public Integer apply(String t) {
			return  t.length();
		}
	};
   Function<String,Integer> fun1 = t->t.length();
   System.out.println(fun1.apply("�º������ö�"));
}
//����Predicate �϶��ͽӿ�
@Test
public void test3() {
	//ʹ�������ڲ���
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