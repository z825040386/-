package com.atguigu.Dm;
//��װ���String���͵�ת��
public class Integer2 {
      public static void main(String[] args) {
	//1.��װ����ת����String����
    	  Integer i = new Integer(12);
    	  //��ʽ1
    	  String s1 = i+"";
    	  //��ʽ2
    	  String s2 = String.valueOf(i);
    	  //��ʽ��
    	  String s3 = i.toString();
    	  System.out.println(s2);
    	  //2.String����ת���ɰ�װ����
    	  String e ="123465";
    	  //��ʽ1
    	 Integer e1 = new Integer(e);
    	  //��ʽ2
    	 Integer e2 = Integer.valueOf(e);
    	 System.out.println(e2);
	}
}
