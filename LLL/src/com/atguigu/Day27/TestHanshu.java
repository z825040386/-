package com.atguigu.Day27;

import java.util.function.Function;

import org.junit.Test;

/*
 *  *������
 *��������ʽ�ӿڣ��ӿ����������󷽷���public String getValue(String str);
��������LambdaTest�����б�д����ʹ�ýӿ���Ϊ���������������getValue���������ش������ַ���ֵ��

		ʵ��1����һ���ַ���ת���ɴ�д������Ϊ�����ķ���ֵ��
		ʵ��2����һ���ַ����ĵ�2������4������λ�ý��н�ȡ�Ӵ���
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
