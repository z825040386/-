package com.atguigu.Day23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.junit.Test;


/*�Ӽ��������ַ�����Ҫ�󽫶�ȡ���������ַ���ת�ɴ�д�����Ȼ������������������
 * ֱ�������롰e�����ߡ�exit��ʱ���˳�����
 */
public class Test1 {
  @Test
  public void test() throws IOException {
	  InputStream  in = (InputStream) System.in;
	  InputStreamReader  isr = new InputStreamReader(in);
	  BufferedReader reader = new BufferedReader(isr);
      boolean b = true;
      while(b) {
    	  System.out.println("������һ���ַ���");
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
