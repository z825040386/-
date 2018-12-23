package com.atguigu.Day21;

import java.util.*;

import org.junit.jupiter.api.Test;

import com.atguigu.Dm.CollectionUtils;


/*Object max(Collection)：根据元素的自然顺序，返回给定集合中的最大元素
Object max(Collection，Comparator)：根据 Comparator 指定的顺序，返回给定集合中的最大元素
Object min(Collection)
Object min(Collection，Comparator)
int frequency(Collection，Object)：返回指定集合中指定元素的出现次数
void copy(List dest,List src)：将src中的内容复制到dest中
boolean replaceAll(List list，Object oldVal，Object newVal)：使用新值替换 List 对象的所有旧值*/


public class Dm {
	 @Test
  public void test1() {
	  List list = Arrays.asList("试试 ","赛赛","搜索");
	  CollectionUtils.printCol1(list);
	  Collections.reverse(list);
	  System.out.println(list);
  }
}
 