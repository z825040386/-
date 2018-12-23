package com.atguigu.Day24;

import org.junit.Before;
import org.junit.Test;

public class Fanshe {
	Class L;

	@Before
	public void fore() throws ClassNotFoundException {
		L = Class.forName("bean.L");
	}

	@Test
	public void test() throws InstantiationException, IllegalAccessException {
		Object o = L.newInstance();
		System.out.println();
	}
}

class L {
	private char gender;
	private String name;
	private int age;

	public void W() {
		return;
	}

	public L(char gender, String name, int age) {
		super();
		this.gender = gender;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "L [gender=" + gender + ", name=" + name + ", age=" + age + "]";
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}