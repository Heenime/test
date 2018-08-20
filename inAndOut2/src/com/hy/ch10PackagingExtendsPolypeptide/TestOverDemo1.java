package com.hy.ch10PackagingExtendsPolypeptide;
/**
 * 子类覆写父类的实现
 * @author Administrator
 *
 */
class Person5{
	String name;
	int age;
	public  String talk() {
		return "我是："+this.name+",今年："+this.age+"岁";
	}
}
class Student5 extends Person5{
	String school;
	public Student5 (String name,int age,String school) {
		this.name=name;
		this.age=age;
		this.school=school;
	}
	//覆写父类talk方法
	public String talk() {
		return "我在："+this.school+"上学";
	}
}
public class TestOverDemo1{
	public static void main(String args[]) {
		Student5 s = new Student5("张三",25,"向阳");
		System.out.println(s.talk());
	}
}
