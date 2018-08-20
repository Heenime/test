package com.hy.ch13CommonClass;

import java.util.HashMap;

/**
 * hashCode方法（不太清楚）
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
		return "姓名："+this.name+",年龄："+this.age;
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
		hm.put(new Person("张三",20), "张三");
		System.out.println(hm.get(new Person("张三",20)));
		
	}
}
