package com.atguigu.Day23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.junit.Test;


/*从键盘输入字符串，要求将读取到的整行字符串转成大写输出。然后继续进行输入操作，
 * 直至当输入“e”或者“exit”时，退出程序。
 */
public class Test1 {
  @Test
  public void test() throws IOException {
	  InputStream  in = (InputStream) System.in;
	  InputStreamReader  isr = new InputStreamReader(in);
	  BufferedReader reader = new BufferedReader(isr);
      boolean b = true;
      while(b) {
    	  System.out.println("请输入一个字符串");
		  String line = reader.readLine();
		  if(line.equals("e")||line.equals("exit")) {
			  b = false;
		  }else {
		System.out.println(line.toUpperCase());
	}
      }
	  reader.close();
  }
}
