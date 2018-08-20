package com.hy.ch12ClassResearch;
/**
 * 静态代码块经常用来进行类属性的初始化
 */
class Person19 {
	public Person19(){
		System.out.println("person 的无参构造方法执行");
	}
	
	 static {
		System.out.println("person类中的静态代码块执行"); 
	 }
}

public class TestStaticDemos{
	static {
		System.out.println("TestStaticDemos类中的静态代码块执行");
	}
	public static void main(String[] args) {
		System.out.println("程序开始执行！");
		//产生两个实例化对象
		new Person19();
		new Person19();
	}
}