package com.atguigu.Dm;

import org.junit.Test;

/*
 * 此类用于演示StringBuffer类的常见方法
 * 增删改查插 
 * 长度和反转
 */
public class Lxx { 
	//public static void main(String[] args) {
  @Test	
    public void test1() {
	   StringBuffer b  = new StringBuffer("郝厚生");
	   b.append("肖冰");
	   b.append(',');
	   b.append("ture");
    System.out.println(b);
    }
	}
	//}
