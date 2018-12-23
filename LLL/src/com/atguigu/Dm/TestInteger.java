package com.atguigu.Dm;
//基本类型和包装类型的转换
public class TestInteger {
    public static void main(String[] args) {
/*		//基本类型转包装类型
    	int i  = 100;
		Integer i1 =  new Integer(i);
		Integer i2 =Integer.valueOf(i);
		System.out.println(i2);
		//包装类型转基本类型
		Integer j = new Integer(666);
		int j1 = j.intValue();
		System.out.println(j1);
	*/	
    	//包装类型自动转换成基本类型
    	Integer j = new Integer(999);
    	int j1 = j;
    	System.out.println(j1); 
    	int i  = 100;
    	Integer i1 = i;
    	System.out.println(i1);
	} 
} 
