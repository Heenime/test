package com.hy.ch11AbstractAndInterface;
/**
 * ��������ķ���
 * @author Administrator
 *
 */
abstract class Person{
	String name;
	int age;
	String occupation;
	//�������󷽷�talk()
	public abstract String talk();
}
	//Student ��̳���Person��
class Student extends Person{
	public Student(String name,int age,String occupation ) {
		this.name=name;
		this.age=age;
		this.occupation = occupation;
		
	}
	//��дtalk()����
	@Override
	public String talk() {
		return "ѧ��--->������"+this.name+",����"+this.age+",ְҵ��"+this.occupation+"|";
	}
}
	//work�̳���Person��
class Worker extends Person{
	public Worker(String name,int age,String occupation ) {
		this.name=name;
		this.age=age;
		this.occupation = occupation;
		
	}
	//��дtalk��������
		@Override
		public String talk() {
			return "����--->������"+this.name+"�����䣺"+this.age+",ְҵ��"+this.occupation+"|";
		}
}

public class TestAbstarctDemo {
	public static void main (String args[]) {
		Student s = new Student("huahua",30,"student");
		Worker w = new Worker("hu",50,"worker");
		System.out.println(s.talk());
		System.out.println(w.talk());
		
	}
}
