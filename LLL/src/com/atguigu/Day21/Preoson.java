package com.atguigu.Day21;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import org.junit.Test;

/*
 * ��дPerson�࣬�������������䡢���ص����ԣ��ṩ��Ӧ�ķ��ʷ�����
��д������1����main�����д���������ͬ��Person���󣬽��������������л����ļ��У�
��д������2����main�����д��ļ��з����л�����Person���󣬴�ӡ�������֤���л�����ȷ��
�ڲ�����1�У�������Person����ŵ������У����л������鵽һ���������ļ��С��ٽ�����Person����ŵ�List�����У�
���л��ü��ϵ���һ���������ļ��У�
�ڲ�����2�У�������Person����������ļ��з����л�������ӡ��
������Person�����List�����ļ��з����У�����ӡ����֤�������ͼ��϶�������л���
 */
public class Preoson {
   @Test
   public void test1() throws IOException, IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src\\data.dat"));
		   oos.writeObject(new Preson("������", 20, 150));
		   oos.writeObject(new Preson("����", 21, 120));
         
   }
}
class Preson{
	   private String name;
	   private int age;
	   private double weight;
	public Preson(String name, int age, double weight) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
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
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Preson [name=" + name + ", age=" + age + ", weight=" + weight + "]";
	}
	   
}