package com.hy.ch10PackagingExtendsPolypeptide;
/**
 * super���ø�������Ժͷ���
 * @author Administrator
 *
 */
class Person3{
	String name;
	int age;
	//����Ĺ��췽��
	public Person3() {
	}
	public String talk() {
		return "���ǣ�"+this.name+"  ���꣺"+this.age+"��";
	}
}
class Student3 extends Person3 {
	String school;
	//����Ĺ��췽��
	public Student3(String name,int age,String school) {
		//��������super���ø����е�����
		super.name=name;
		super.age=age;
		//���ø����е�talk()����
		System.out.print(super.talk());
		//���ñ����е�school����
		this.school=school;
	}
}
public class TestPersonStudentDemo3 {
	public static void main (String args[]) {
		Student3 s = new Student3("����",24,"����");
		System.out.println(",ѧУ��"+s.school);
	}
}
