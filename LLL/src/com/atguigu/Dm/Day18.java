package com.atguigu.Dm;

import java.awt.List;
import java.util.ArrayList;

public class Day18 {
		public static void main(String[] args) {
			ArrayList list = new ArrayList();
			list.add(1);
			list.add(2);
			list.add(3);
			list.add(4);
			list.add(5);
			list.add(6);
			list.add(7);
			list.add(8);
			list.add(9);
			list.add(10);
			list.add(1, 555);
			System.out.println(list);
			list.remove(5);
			System.out.println(list);
			list.set(6, 123456);
			System.out.println(list);
			System.out.println(list.get(5));
		}}
  