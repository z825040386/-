package com.atguigu.Day23;

import java.util.Scanner;
;

public class mmmm {
     public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("输入三位数");
		int a = input.nextInt();
		int a1 = a/100;
		int a2 = a/10%10;
		int a3 = a%10;
		if(a==a1*a1*a1+a2*a2*a2+a3*a3*a3) {
			System.out.println("是水仙花数");
		}else {
			System.out.println("不是水仙花数");
		}
	}
}
