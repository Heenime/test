package com.hy.ch12ClassResearch;
/**
 * 静态方法
 * @author Administrator
 */
class Person18{
	String name;
	int age;
	//设置静态变量
	private static String city="中国";
	static int count=0;
	public Person18(String name, int age) {
		count++;
		this.name=name;
		this.age=age;
	}
	//造出静态方法来修改静态变量
	public static void setCity(String ci) {
		city=ci;
	}
	public String talk() {
		return"姓名："+this.name+"   年龄："+this.age+"    地域："+city;
	}
}
public class TestStaticDemo {
	public static void main(String[] args) {
		Person18 p1 = new Person18("张三",37);
		Person18 p2 = new Person18("李四",57);
		Person18 p3 = new Person18("王五",87);
		
		System.out.println("修改之前的信息："+p1.talk());
		System.out.println("修改之前的信息："+p2.talk());
		System.out.println("修改之前的信息："+p3.talk());
		
		System.out.println("********修改之后的信息***********");
		//静态方法要用类名去调用
		Person18.setCity("韩国2");
		p1.name="张三阿三";
		
		System.out.println("修改之后的信息："+p1.talk());
		System.out.println("修改之后的信息："+p2.talk());
		System.out.println("修改之后的信息："+p3.talk());
		
		System.out.println(p1.count);
		
	}
}

