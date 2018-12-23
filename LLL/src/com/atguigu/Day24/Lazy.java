package com.atguigu.Day24;

public class Lazy {
 private Lazy() {}
 private static Lazy l;
 public static Lazy getLazy() {
	 if(l == null) {
		 synchronized(Lazy.class) {
			 if(l == null) {
				 l = new Lazy();
			 }
		 }
	 }
   return l; 
 }
}
