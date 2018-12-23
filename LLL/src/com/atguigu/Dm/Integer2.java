package com.atguigu.Dm;
//包装类和String类型的转换
public class Integer2 {
      public static void main(String[] args) {
	//1.包装类型转换成String类型
    	  Integer i = new Integer(12);
    	  //方式1
    	  String s1 = i+"";
    	  //方式2
    	  String s2 = String.valueOf(i);
    	  //方式三
    	  String s3 = i.toString();
    	  System.out.println(s2);
    	  //2.String类型转换成包装类醒
    	  String e ="123465";
    	  //方式1
    	 Integer e1 = new Integer(e);
    	  //方式2
    	 Integer e2 = Integer.valueOf(e);
    	 System.out.println(e2);
	}
}
