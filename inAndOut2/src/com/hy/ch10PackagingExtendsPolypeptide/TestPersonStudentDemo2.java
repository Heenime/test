package com.hy.ch10PackagingExtendsPolypeptide;
/**
 * super调用父类中的构造方法
 * @author Administrator
 *
 */
class Person2{
	String name;
	int age;
	//父类的构造方法
	public Person2(String name,int age) {
		this.name=name;
		this.age=age;
	}
}
class Student2 extends Person2{
	String school;
	
	public Student2() {
		super("账单", 18);
	}
	
}
public class TestPersonStudentDemo2 {
	public static void main(String args[]) {
		Student2 s = new Student2();
		s.school="shanghai";
		System.out.println("姓名："+s.name+"  年龄："+s.age+"  学校："+s.school);
	}
}
