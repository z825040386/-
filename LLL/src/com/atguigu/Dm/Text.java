package com.atguigu.Dm;

public class Text {
public static void main(String[] args) {
	/* String s1 = args[0];
	 String s2 = args[1];
	 //将第一个字符串转换为Integer对象
	 Integer i1 = new Integer(s1); 
	 //将第二个字符串解析INT类型
	 int temp = Integer.parseInt(s2);
	 //用此整数构建Integer对象（int——Integer）
	 Integer i2 = new Integer(temp);
	 //使用人工拆箱，获得上述两个对象INT整数数值，求和打印出来
	 int a = i1.intValue();
	 int b = i2.intValue();
	 System.out.println(a+b);
	System.out.println(i1*i2);
	}*/
	String a = args[0];
	String a1 = args[1];
	Integer c = new Integer(a);
	int d = Integer.parseInt(a1);
	Integer c1 = new Integer(d);
	int w = c.intValue();
	int w1 = c1.intValue();
	System.out.println(w+w1);
	System.out.println(c*c1);
}
}
