package com.hy.ch13CommonClass;

import java.util.HashMap;

/**
 * hashCode��������̫�����
 * @author Administrator
 */

class Person{
	private String name;
	private int age;
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	public String toString() {
		return "������"+this.name+",���䣺"+this.age;
	}
	public boolean equals(Object object) {
		return true;
	}
	public int hashCode() {
		return 20;
	}
}
public class HashCodeTest {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put(new Person("����",20), "����");
		System.out.println(hm.get(new Person("����",20)));
		
	}
}
