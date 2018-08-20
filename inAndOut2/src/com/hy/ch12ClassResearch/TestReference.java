package com.hy.ch12ClassResearch;
/**
 * 在java中引用数据类型的传递(对象)
 * @author Administrator
 *
 */
class Person9{
	String name;
	int age;
}
public class TestReference {
	public static void main(String args[]) {
		//声明一个对象p1,此对象的值为null;表示未实例化
		Person9 p1 = null;
		//声明一个对象p2,此对象的值为null;表示未实例化
		Person9 p2 = null;
		p1= new Person9();
		p1.name="赵雷";
		p1.age=26;
		//将p1引用赋值给p2
		p2=p1;
		//输出p2中的属性
		System.out.println("姓名："+p2.name);
		System.out.println("年龄："+p2.age);
		p1=null;
	
	}
}
