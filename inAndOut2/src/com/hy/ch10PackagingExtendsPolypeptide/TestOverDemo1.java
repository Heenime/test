package com.hy.ch10PackagingExtendsPolypeptide;
/**
 * ���าд�����ʵ��
 * @author Administrator
 *
 */
class Person5{
	String name;
	int age;
	public  String talk() {
		return "���ǣ�"+this.name+",���꣺"+this.age+"��";
	}
}
class Student5 extends Person5{
	String school;
	public Student5 (String name,int age,String school) {
		this.name=name;
		this.age=age;
		this.school=school;
	}
	//��д����talk����
	public String talk() {
		return "���ڣ�"+this.school+"��ѧ";
	}
}
public class TestOverDemo1{
	public static void main(String args[]) {
		Student5 s = new Student5("����",25,"����");
		System.out.println(s.talk());
	}
}
