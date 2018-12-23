package com.atguigu.Day26;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

import org.junit.Test;

public class TestTCP1 {
	//���Կͻ���
	@Test 
	public void testClient() throws Exception {
		
		//1.�����ͻ����׽��ֶ���ͬʱָ��Ҫ���ӵķ���˵�ip�Ͷ˿ں�
		Socket socket = new Socket(InetAddress.getLocalHost(),8888);

		//2.��������
		OutputStream outputStream = socket.getOutputStream();
		outputStream.write("I am Clinet!hahah".getBytes());
		
		
		//3.�ر�
		outputStream.close();
		socket.close();
		
	}

	
	//���Է����
	@Test 
	public void testServer() throws IOException {
		//1.����������׽��ֶ���ͬʱָ���Լ��Ķ˿ں�
		ServerSocket ss = new ServerSocket(8888);
		
		//2.���ܿͻ��˵���������
		Socket socket = ss.accept();
		
		
		//3.��������
		
		InputStream inputStream = socket.getInputStream();
		
		byte[] b = new byte[1024];
		int len;
		while((len = inputStream.read(b))!=-1) {
			System.out.print(new String(b,0,len));
		}
		
		//4.�ر�
		inputStream.close();
		socket.close();
		ss.close();
		
		

	}
}