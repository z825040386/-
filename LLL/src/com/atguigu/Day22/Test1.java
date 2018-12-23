package com.atguigu.Day22;


import java.io.File;
import java.io.IOException;

import org.junit.Test;



public class Test1{
	@Test
	public void test1() throws IOException {
		  //1.����File���� ָ��E:\demo Ŀ¼
//		File file  =new File("D:\\demo");
		File file  =new File("D:\\demo\\a\\b\\c\\d");
//		2.ʹ��
//		�ж��ļ���Ŀ¼�Ƿ����
		if(!file.exists()) {
			file.mkdirs();
		}
		System.out.println("Ŀ¼�Ƿ����"+file.exists());
	   File f = new File(file,"l.txt");
	   f.createNewFile();
	}
	@Test
	public void test2() {
		File file = new File("D:\\demo\\a\\b\\c\\d");
		System.out.println("���ƣ�"+file.getName());
		System.out.println("·����"+file.getParent());
		System.out.println("��С"+file.length());
		System.out.println("����"+file.isHidden());
		System.out.println("�Ƿ���Ŀ¼"+file.isDirectory());
		System.out.println("�Ƿ����ļ�"+file.isFile());
		
	}
	@Test
	public void test3() {
		File e = new File("D:\\demo\\a\\b\\c");
		if(e.exists()) {
			e.delete();
		}
			
	}
	@Test
	public void test4() {
		File s = new File("D:\\");
//		String[] list = s.list();
//		for(String string:list) {
//			System.out.println(string);
//		}
		File[] list = s.listFiles();
		for(File sub:list) {
			System.out.println(sub.getName());
		}
	}
	@Test
	public void test5() {
		File x = new File("D:\\");
		digui(x);
	}
	private void digui(File x) {
		File[] listFiles = x.listFiles();
		for(File sub: listFiles) {
			if(sub.isDirectory()) {
				digui(sub);
			}
		 System.out.println(sub.getName());
		}
	}
}