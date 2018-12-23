package com.atguigu.Dm;

import java.util.ArrayList;
import java.util.Collection;


public class TestCollection1 {
	public static void main(String[] args) {
		
//     1.//获取Collection接口的对象
	Collection c =new ArrayList();
//	调用常用方法
//	 添加 add 
	   c.add("郝厚生");  
	   c.add("是s");
	   c.add("俄武器");
	   c.add("速度 ");
	   c.add("子稳");
	   System.out.println(c);
	   //批量添加
	   Collection d = new ArrayList();
	    d.add("红");
	    d.add("dDad");
	    d.add("郝厚生");
	   d.addAll(c);
	   System.out.println(c);
	   //删除
	   Collection e = new ArrayList();
	   e.remove("郝厚生");
	   System.out.println(c);
	   //批量删除
	   Collection w = new ArrayList();
	   w.remove("是s");
	   w.remove("子稳");
	   c.removeAll(w);
	   System.out.println(c);
	}
}
