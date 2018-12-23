package com.atguigu.Day22;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test2 {
  public static void main(String[] args) throws IOException{
	FileInputStream fis = null;
	FileOutputStream fos = null;
	try {
		fis = new FileInputStream("D:\\Program Files\\feiq\\Recv Files\\slj.jpg");
		fos = new FileOutputStream("src\\copy.jpg");
		byte[] b = new byte[1024*10];
		int len;
		while((len = fis.read(b))!=-1) {
			fos.write(b, 0, len);
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	fos.close();
	fis.close();
}
}
