package com.hy.ch10PackagingExtendsPolypeptide;
/**
 * super���ø����еĹ��췽��
 * @author Administrator
 *
 */
class Person2{
	String name;
	int age;
	//����Ĺ��췽��
	public Person2(String name,int age) {
		this.name=name;
		this.age=age;
	}
}
class Student2 extends Person2{
	String school;
	
	public Student2() {
		super("�˵�", 18);
	}
	
}
public class TestPersonStudentDemo2 {
	public static void main(String args[]) {
		Student2 s = new Student2();
		s.school="shanghai";
		System.out.println("������"+s.name+"  ���䣺"+s.age+"  ѧУ��"+s.school);
	}
}
