package com.atguigu.Day21;

import java.util.*;

import org.junit.jupiter.api.Test;

import com.atguigu.Dm.CollectionUtils;


/*Object max(Collection)������Ԫ�ص���Ȼ˳�򣬷��ظ��������е����Ԫ��
Object max(Collection��Comparator)������ Comparator ָ����˳�򣬷��ظ��������е����Ԫ��
Object min(Collection)
Object min(Collection��Comparator)
int frequency(Collection��Object)������ָ��������ָ��Ԫ�صĳ��ִ���
void copy(List dest,List src)����src�е����ݸ��Ƶ�dest��
boolean replaceAll(List list��Object oldVal��Object newVal)��ʹ����ֵ�滻 List ��������о�ֵ*/


public class Dm {
	 @Test
  public void test1() {
	  List list = Arrays.asList("���� ","����","����");
	  CollectionUtils.printCol1(list);
	  Collections.reverse(list);
	  System.out.println(list);
  }
}
 