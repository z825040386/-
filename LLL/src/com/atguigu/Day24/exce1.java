package com.atguigu.Day24;

import org.junit.Test;

// ������ͨ�����䴴��Thread�ࡢString�ࡢFile�ࡢStringBuilder�Ķ���

public class exce1 {
	@Test
  public void test() throws Exception {
	   Class<?> c = Class.forName("java.lang.Thread");
	Thread t = (Thread) c.newInstance();
	   System.out.println(t);
	   t.start();
	   }
}
