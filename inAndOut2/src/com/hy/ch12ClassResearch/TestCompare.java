package com.hy.ch12ClassResearch;
/**
 * 判断两个对象相等（this）
 * @author Administrator
 */
class Person15{
	String name;
	int age;
	Person15(String name,int age){
		this.name=name;
		this.age=age;
	}
	boolean compare(Person15 p) {
		if(this.name.equals(p.name)&&this.age==p.age) {
			return true;
		}else {
			return false;
		}
		
	}
}

public class TestCompare {
	public static void main(String args[]) {
		Person15 p = new Person15("张三",45);
		Person15 pp = new Person15("张三",45);
		System.out.println(p.compare(pp)?"同一个人":"不同一个人");
	}
}
