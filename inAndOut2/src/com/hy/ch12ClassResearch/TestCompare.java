package com.hy.ch12ClassResearch;
/**
 * �ж�����������ȣ�this��
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
		Person15 p = new Person15("����",45);
		Person15 pp = new Person15("����",45);
		System.out.println(p.compare(pp)?"ͬһ����":"��ͬһ����");
	}
}
