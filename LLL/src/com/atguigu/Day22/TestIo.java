package com.atguigu.Day22;

import java.io.FileInputStream;
import java.io.IOException;

import org.junit.Test;

public class TestIo {
   @Test
	public void test() throws IOException {
	   FileInputStream fis = new FileInputStream("src\\a.txt");
	    int data = fis.read();
	    System.out.println(data);
   }
}
