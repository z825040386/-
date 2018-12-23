package com.atguigu.Day21;


import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



public class MapUtills {
     public static void printMap1(Map map) {
    	 Set keys = map.keySet();
           Iterator iterator = keys.iterator();
    	  while(iterator.hasNext()) {
    		  Object key = iterator.next();
    		  Object value = map.get(key);
    		  System.out.println(key+":"+value);
    	  }
     }
     public static void printMap2(Map map) {
    	 Set entrys = map.entrySet();
    	 for(Object object:entrys) {
    		 Map.Entry entry = (Entry) object;
    		 Object key = entry.getKey();
    		 Object value = entry.getValue();
    		 System.out.println(key+":"+value);
    	 }
     }
}
