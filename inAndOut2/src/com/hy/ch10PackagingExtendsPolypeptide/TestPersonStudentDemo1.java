package com.hy.ch10PackagingExtendsPolypeptide;
/**
 * ��������ʵ����
 * @author Administrator
 * super();����Ҫ���ܾ������������ø�������ݣ�Ҳ���ǵ��ø����е����Ժͷ���
 */
class Person{
	String name;
	int age;
	//����Ĺ��췽��
	public Person() {
		System.out.println("1.public Person(){}");
	}
}
class Student extends Person{
	
	String school;
	//����Ĺ��췽��
	public Student() {
		//������Ĺ��췽���ĵ�һ��Ĭ��������һ��super()���
		super();
		System.out.println("2.public Student(){}");
	}
}
public class TestPersonStudentDemo1 {
	public static void main(String args[]) {
		Student s= new Student();
	}
}
