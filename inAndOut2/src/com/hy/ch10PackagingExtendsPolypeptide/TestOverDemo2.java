package com.hy.ch10PackagingExtendsPolypeptide;
/**
 * ���าд���෽��2
 * @author Administrator
 *
 */
class Person6{
	String name;
	int age;
	//����Ĺ��췽��
	public Person6() {
	}
	public String talk() {
		return "���ǣ�"+this.name+"  ���꣺"+this.age+"��";
	}
}
class Student6 extends Person6 {
	String school;
	public Student6(String name,int age,String school) {
		this.name=name;
		this.age=age;
		this.school=school;
	}
	//�˴���дPerson���е�talk��������
	public String talk() {
		return super.talk()+",���ڣ�"+this.school+"��ѧ";
	}
}
public class TestOverDemo2 {
	public static void main(String args[]) {
		Student6 s = new Student6("����",25,"����");
		System.out.println(s.talk());
	}
	
}
