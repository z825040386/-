package com.atguigu.Day27;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TreeMap {
  public static void main(String[] args) {
	Map<String,List<String>> map = new HashMap<>();
	List<String> list = new ArrayList<>();
	list.add("������");
	list.add("������");
	list.add("������");
	list.add("������");
	
	map.put("�㽭ʡ", list);
	
	List<String> list1 = new ArrayList<>();
	list1.add("������");
	list1.add("������");
	
	map.put("����ʡ", list1);
	
	List<String> list2 = new ArrayList<>();
	list2.add("������");
	
	map.put("������", list2);
	//����/
	Set<String> keys = map.keySet();
	//��ǿforѭ��
	for(String province:keys) {
		List<String> values = map.get(province);
		System.out.println(province);
		for(String city:values) {
			System.out.println("\t"+city);
		}
	}
}
}
