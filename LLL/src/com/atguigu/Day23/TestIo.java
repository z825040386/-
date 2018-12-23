package com.atguigu.Day23;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import org.junit.Test;

public class TestIo {
	@Test
	public void test() throws IOException {
   ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src\\date.dat"));
   
      oos.writeInt(123);
      oos.writeUTF("郝厚生");
      oos.writeDouble(20.5);
      oos.writeBoolean(true);
      oos.writeChar('女');
      oos.writeObject(new Person("好收升"));
      oos.writeObject(new Person("仨"));
      oos.close();
	}
	@Test
	public void tset1() throws Exception{
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src\\date.dat"));
		
		System.out.println(ois.readInt());
		System.out.println(ois.readUTF());
		System.out.println(ois.readDouble());
		System.out.println(ois.readBoolean());
		System.out.println(ois.readChar());
		Person p1 = (Person) ois.readObject();
		Person p2 = (Person) ois.readObject();
		System.out.println(p1);
		System.out.println(p2);
		
		 ois.close();
		
	}
}
class Person implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
}