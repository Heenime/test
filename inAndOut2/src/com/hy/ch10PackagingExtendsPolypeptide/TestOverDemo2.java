package com.hy.ch10PackagingExtendsPolypeptide;
/**
 * 子类覆写父类方法2
 * @author Administrator
 *
 */
class Person6{
	String name;
	int age;
	//父类的构造方法
	public Person6() {
	}
	public String talk() {
		return "我是："+this.name+"  今年："+this.age+"岁";
	}
}
class Student6 extends Person6 {
	String school;
	public Student6(String name,int age,String school) {
		this.name=name;
		this.age=age;
		this.school=school;
	}
	//此处覆写Person类中的talk（）方法
	public String talk() {
		return super.talk()+",我在："+this.school+"上学";
	}
}
public class TestOverDemo2 {
	public static void main(String args[]) {
		Student6 s = new Student6("张三",25,"向阳");
		System.out.println(s.talk());
	}
	
}
