package com.hy.ch10PackagingExtendsPolypeptide;
/**
 * �������ǿ��ת��Ϊ��������ʹ��
 */

class Person8{
	public void fun1() {
		System.out.println("1.Person{fun1()}");
	}
	public void fun2() {
		System.out.println("2.person{fun2()}");
	}
}
//Student��̳�Person�࣬Ҳ�ͼ̳���Person���fun1������fun2()����
class Student8 extends Person8{
	//��дfun1����
	public void fun1() {
		System.out.println("1.Student{fun1()}");
	}
	public void fun3() {
		System.out.println("2.Student{fun2()}");
	}
}
public class Qiangzhuan {
	public static void main(String args[]) {
	Person8 p = new Student8();
	Student8 s = (Student8) p;
	s.fun1();
	s.fun2();
	}
}
