package com.hy.ch11AbstractAndInterface;
/**
 * �������ʹ��
 * @author Administrator
 *
 */
abstract class Person2{
	String name;
	int age;
	String occupation;
	public Person2(String name,int age,String occupation) {
		this.name=name;
		this.age=age;
		this.occupation=occupation;
	}
	public abstract String talk(); 
}
class Student2 extends Person2{
	public Student2 (String name,int age,String occupation) {
		//�����������ȷ���ó������еĹ��췽��
		super(name,age,occupation);
	}
	@Override
	public String talk() {
		return "ѧ��---->������"+this.name+",���䣺"+this.age+",ְҵ��"+this.occupation;
	}
}

public class TestAbstarctDemo2 {
	public static void main(String args[]) {
		Student2 s = new Student2("����",20,"ѧ��");
		System.out.println(s.talk());
	}
}

