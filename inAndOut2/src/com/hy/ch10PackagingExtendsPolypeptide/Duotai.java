package com.hy.ch10PackagingExtendsPolypeptide;
/**
 * �����̬�Ե�ʹ��
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

//Student����չ��Person�࣬Ҳ�ͼ̳���Person���е�fun1{} ,fun2{} ����
class Student7 extends Person7{
	//������д��Person���е�fun1��������
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
