package demo.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * ����������ʾInetAddress����ص��ʹ��
 * @author liyuting
 *
 */
public class TestInetAddress {
	
	public static void main(String[] args) throws Exception {
		
		//1.��ȡInetAddress����
		
//		InetAddress ip1 = InetAddress.getLocalHost();
		
		InetAddress ip1 = InetAddress.getByName("COMPUTER");
		
		
		//2.��ȡip��ַ������
		
		System.out.println(ip1.getHostAddress());
		System.out.println(ip1.getHostName());
	}

}
