package com.atguigu.Day27;

import java.util.function.Function;

import org.junit.Test;

/*
 *  *案例：
 *声明函数式接口，接口中声明抽象方法：public String getValue(String str);
②声明类LambdaTest，类中编写方法使用接口作为参数，方法体调用getValue方法，返回处理后的字符串值。

		实现1：将一个字符串转换成大写，并作为方法的返回值。
		实现2：将一个字符串的第2个到第4个索引位置进行截取子串。
 */
public class TestHanshu {
@Test
public void test() {
	System.out.println(method(t->t.toUpperCase(),"ssss"));
}
@Test
public void test1() {
	System.out.println(method(t->t.substring(2, 4), "asdasdasdasd"));
}
public String method(Function<String,String>fun,String y) {
	return fun.apply(y);
}
}
