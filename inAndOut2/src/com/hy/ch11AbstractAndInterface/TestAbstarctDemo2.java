package com.hy.ch11AbstractAndInterface;
/**
 * 抽象类的使用
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
		//在这里必须明确调用抽象类中的构造方法
		super(name,age,occupation);
	}
	@Override
	public String talk() {
		return "学生---->姓名："+this.name+",年龄："+this.age+",职业："+this.occupation;
	}
}

public class TestAbstarctDemo2 {
	public static void main(String args[]) {
		Student2 s = new Student2("张三",20,"学生");
		System.out.println(s.talk());
	}
}

