package com.atguigu.Day24;

import java.lang.reflect.Field;

import org.junit.Test;

public class TestAccessMembers {
	@Test
	public void test() throws Exception {
		// 1.获取Class类对象
		Class c = Class.forName("com.atguigu.Day24");
		// 2.通过反射获取对应类的对象（堆中的对象）
		// ---------相当于 Student Object = new Student();
		Object object = c.newInstance();
		// 3.访问属性
		// 步骤一 获取带访问的属性
		Field field = c.getDeclaredField("name");
		// 步骤2 爆破
		field.setAccessible(true);
		// 步骤3 为属性赋值
		// 相当于Object.name= “瓦斯弹”
		field.set(object, "瓦斯弹");
		// 步骤4 读取属性
		System.out.println(field.get(object));
		System.out.println(field.get(c.newInstance()));
	}

	@Test
	public void test1() throws Exception {
		Class c = Class.forName("com.atguigu.Day24");
		// 获取属性
		Field field = c.getDeclaredField("nation");
		field.setAccessible(true);
		field.set(null, "美国");
		System.out.println(field.get(null));
		System.out.println(field.get(c.newInstance()));
	}
}
