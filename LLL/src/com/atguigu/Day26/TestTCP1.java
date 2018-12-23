package com.atguigu.Day26;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

import org.junit.Test;

public class TestTCP1 {
	//测试客户端
	@Test 
	public void testClient() throws Exception {
		
		//1.创建客户端套接字对象，同时指定要连接的服务端的ip和端口号
		Socket socket = new Socket(InetAddress.getLocalHost(),8888);

		//2.发送数据
		OutputStream outputStream = socket.getOutputStream();
		outputStream.write("I am Clinet!hahah".getBytes());
		
		
		//3.关闭
		outputStream.close();
		socket.close();
		
	}

	
	//测试服务端
	@Test 
	public void testServer() throws IOException {
		//1.创建服务端套接字对象，同时指定自己的端口号
		ServerSocket ss = new ServerSocket(8888);
		
		//2.接受客户端的连接请求
		Socket socket = ss.accept();
		
		
		//3.接受数据
		
		InputStream inputStream = socket.getInputStream();
		
		byte[] b = new byte[1024];
		int len;
		while((len = inputStream.read(b))!=-1) {
			System.out.print(new String(b,0,len));
		}
		
		//4.关闭
		inputStream.close();
		socket.close();
		ss.close();
		
		

	}
}