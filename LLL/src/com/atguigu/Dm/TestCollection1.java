package com.atguigu.Dm;

import java.util.ArrayList;
import java.util.Collection;


public class TestCollection1 {
	public static void main(String[] args) {
		
//     1.//��ȡCollection�ӿڵĶ���
	Collection c =new ArrayList();
//	���ó��÷���
//	 ��� add 
	   c.add("�º���");  
	   c.add("��s");
	   c.add("������");
	   c.add("�ٶ� ");
	   c.add("����");
	   System.out.println(c);
	   //�������
	   Collection d = new ArrayList();
	    d.add("��");
	    d.add("dDad");
	    d.add("�º���");
	   d.addAll(c);
	   System.out.println(c);
	   //ɾ��
	   Collection e = new ArrayList();
	   e.remove("�º���");
	   System.out.println(c);
	   //����ɾ��
	   Collection w = new ArrayList();
	   w.remove("��s");
	   w.remove("����");
	   c.removeAll(w);
	   System.out.println(c);
	}
}
