package com.hy.ch10PackagingExtendsPolypeptide;
/**
 * 子类对象的实例化
 * @author Administrator
 * super();的主要功能就是完成子类调用父类的内容，也就是调用父类中的属性和方法
 */
class Person{
	String name;
	int age;
	//父类的构造方法
	public Person() {
		System.out.println("1.public Person(){}");
	}
}
class Student extends Person{
	
	String school;
	//子类的构造方法
	public Student() {
		//在子类的构造方法的第一行默认隐含了一个super()语句
		super();
		System.out.println("2.public Student(){}");
	}
}
public class TestPersonStudentDemo1 {
	public static void main(String args[]) {
		Student s= new Student();
	}
}
