package com.hy.ch12ClassResearch;
/**
 * 静态static的用法 ：static 修饰的是公共属性
 * @author Administrator
 *
 */
class Person17{
	String name;
	int age;
	static String city="中国";
	static int count=0;
	public Person17(String name, int age) {
		count++;
		this.name=name;
		this.age=age;
	}
	public String talk() {
		return"姓名："+this.name+"   年龄："+this.age+"    地域："+city;
	}
}
public class TestStaticDemo2 {
	public static void main(String[] args) {
		Person17 p1 = new Person17("张三",37);
		Person17 p2 = new Person17("李四",57);
		Person17 p3 = new Person17("王五",87);
		
		System.out.println("修改之前的信息："+p1.talk());
		System.out.println("修改之前的信息："+p2.talk());
		System.out.println("修改之前的信息："+p3.talk());
		
		System.out.println("********修改之后的信息***********");
		
		p1.city="韩国";
		p1.name="张三阿三";
		
		System.out.println("修改之后的信息："+p1.talk());
		System.out.println("修改之后的信息："+p2.talk());
		System.out.println("修改之后的信息："+p3.talk());
		
		System.out.println(p1.count);
		
	}
}
