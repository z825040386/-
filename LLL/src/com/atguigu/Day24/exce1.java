package com.atguigu.Day24;

import org.junit.Test;

// 案例：通过反射创建Thread类、String类、File类、StringBuilder的对象

public class exce1 {
	@Test
  public void test() throws Exception {
	   Class<?> c = Class.forName("java.lang.Thread");
	Thread t = (Thread) c.newInstance();
	   System.out.println(t);
	   t.start();
	   }
}
