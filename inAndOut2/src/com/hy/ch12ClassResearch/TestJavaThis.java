package com.hy.ch12ClassResearch;
/**
 * ��ĳ�����췽��������һ�����췽�� this()
 * @author Administrator
 */
class Person16{
	String name;
	int age;
	public Person16(String name) {
		System.out.println("1.public Person(String name) ");
	}
	public Person16(String name,int age) {
		this("hauhaua");
		this.name=name;
		this.age=age;
		System.out.println("2.public Person(String name,int age)");
	}
}

public class TestJavaThis {
	public static void main(String[] args) {
		new Person16("huohuo",66);
	}
}
