package demo.net;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;


public class IOText {
public static void main(String[] args) {
	
 	  FileInputStream fis = null;
 	  InputStreamReader isr = null;
 	  BufferedReader buff = null;
       try {
			fis = new FileInputStream("һ���ı��ļ�_utf8.txt");
		    isr = new InputStreamReader(fis,"utf8");
		    buff = new BufferedReader(isr);
		      String readLine = buff.readLine();
		      while(readLine != null) {
		    	  System.out.println(readLine);
		    	  readLine = buff.readLine();
		      }
       } catch (Exception e) {
			// TODO: handle exception
		}
}

}