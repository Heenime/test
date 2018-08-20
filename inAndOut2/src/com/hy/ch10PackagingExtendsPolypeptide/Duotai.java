package com.hy.ch10PackagingExtendsPolypeptide;
/**
 * 对象多态性的使用
 * @author Administrator
 *
 */

class Person7{
	public void fun1() {
		System.out.println("1.Person(fun1{})");
	}
	public void fun2() {
		System.out.println("2.person(fun2{})");
	}
}

//Student类扩展自Person类，也就继承了Person类中的fun1{} ,fun2{} 方法
class Student7 extends Person7{
	//在这里写了Person类中的fun1（）方法
	public void fun1() {
		System.out.println("3.Student(fun1{})");
	}
	public void fun3() {
		System.out.println("4.Student(fun2{})");
	}
}


public class Duotai {
	public  static void main(String args[]) {
		Person7 p = new Student7();
	p.fun1();
	p.fun2();
	}
}
