package com.hy.ch12ClassResearch;
/**
 * instanceof关键字使用实例
 * @author Administrator
 */
class Person20{
	public void  fun1() {
		System.out.println("person  fun1()");
	}
	public void  fun2() {
		System.out.println("person  fun2()");
	}
}

class Student20 extends Person20{
	public void  fun1() {
		System.out.println("student  fun1()");
	}
	public void  fun2() {
		System.out.println("student  fun2()");
	}
}
public class TestInstanceof {
	public static void main(String[] args) {
		Person20 p = new Student20();
		if(p instanceof Student20) {
			Student20 s =(Student20) p;
			s.fun1();
		}else {
			p.fun2();
		}
	}
}
