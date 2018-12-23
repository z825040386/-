package com.atguigu.Day24;



public class Student {

	private String name;
	int age;
	protected double score;
	public String nation;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
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
	 double getScore() {
		return score;
	}
	protected void setScore(double score) {
		this.score = score;
	}
	private String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public Student(String name, int age, double score, String nation) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
		this.nation = nation;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + ", nation=" + nation + "]";
	}

	
}
