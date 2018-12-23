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
	list.add("绍兴市");
	list.add("温州市");
	list.add("湖州市");
	list.add("嘉兴市");
	
	map.put("浙江省", list);
	
	List<String> list1 = new ArrayList<>();
	list1.add("海口市");
	list1.add("三亚市");
	
	map.put("海南省", list1);
	
	List<String> list2 = new ArrayList<>();
	list2.add("北京市");
	
	map.put("北京市", list2);
	//遍历/
	Set<String> keys = map.keySet();
	//加强for循环
	for(String province:keys) {
		List<String> values = map.get(province);
		System.out.println(province);
		for(String city:values) {
			System.out.println("\t"+city);
		}
	}
}
}
