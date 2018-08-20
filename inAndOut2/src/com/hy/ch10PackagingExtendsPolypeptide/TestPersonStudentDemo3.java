package com.hy.ch10PackagingExtendsPolypeptide;
/**
 * super调用父类的属性和方法
 * @author Administrator
 *
 */
class Person3{
	String name;
	int age;
	//父类的构造方法
	public Person3() {
	}
	public String talk() {
		return "我是："+this.name+"  今年："+this.age+"岁";
	}
}
class Student3 extends Person3 {
	String school;
	//子类的构造方法
	public Student3(String name,int age,String school) {
		//在这里用super调用父类中的属性
		super.name=name;
		super.age=age;
		//调用父类中的talk()方法
		System.out.print(super.talk());
		//调用本类中的school属性
		this.school=school;
	}
}
public class TestPersonStudentDemo3 {
	public static void main (String args[]) {
		Student3 s = new Student3("韩烨",24,"北大");
		System.out.println(",学校："+s.school);
	}
}
