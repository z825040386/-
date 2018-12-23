package com.atguigu.Day24;

import java.lang.reflect.Field;

import org.junit.Test;

public class TestAccessMembers {
	@Test
	public void test() throws Exception {
		// 1.��ȡClass�����
		Class c = Class.forName("com.atguigu.Day24");
		// 2.ͨ�������ȡ��Ӧ��Ķ��󣨶��еĶ���
		// ---------�൱�� Student Object = new Student();
		Object object = c.newInstance();
		// 3.��������
		// ����һ ��ȡ�����ʵ�����
		Field field = c.getDeclaredField("name");
		// ����2 ����
		field.setAccessible(true);
		// ����3 Ϊ���Ը�ֵ
		// �൱��Object.name= ����˹����
		field.set(object, "��˹��");
		// ����4 ��ȡ����
		System.out.println(field.get(object));
		System.out.println(field.get(c.newInstance()));
	}

	@Test
	public void test1() throws Exception {
		Class c = Class.forName("com.atguigu.Day24");
		// ��ȡ����
		Field field = c.getDeclaredField("nation");
		field.setAccessible(true);
		field.set(null, "����");
		System.out.println(field.get(null));
		System.out.println(field.get(c.newInstance()));
	}
}
