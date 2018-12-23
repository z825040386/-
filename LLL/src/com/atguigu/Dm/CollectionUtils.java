package com.atguigu.Dm;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionUtils {
		//遍历方式1：
		public static void printCol1(Collection list) {
			System.out.println("-----------------------------------------");
			Iterator iterator = list.iterator();
			
			while (iterator.hasNext()) {
				Object object = (Object) iterator.next();
				System.out.println(object);
			}
		}
		
		//遍历方式2：
		public static void printCol2(Collection list) {
			for (Object object : list) {
				System.out.println(object);
			}
		}
		
		
		
		
		
		
		//遍历方式3：特有的[支持增删改查]
		public static void printList3(List list) {
			for(int i= 0;i<list.size();i++) {
				Object object = list.get(i);
				
				System.out.println(object);
			}
		}

		public static void max(java.awt.List list) {
			// TODO Auto-generated method stub
			
		}
}
