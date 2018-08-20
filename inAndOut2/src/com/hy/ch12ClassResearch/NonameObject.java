package com.hy.ch12ClassResearch;
/**
 * 匿名对象 没有明确声明引用的对象  
 * @author Administrator
 *
 */
class Person6{ 
	private String name="张三";
	private int age=25;
	public String talk() {
		return "name:"+name+"         age:"+age;
	}
}
public class NonameObject {
	public static void main(String args[]) {
		System.out.println(new Person6().talk());
	}
}
