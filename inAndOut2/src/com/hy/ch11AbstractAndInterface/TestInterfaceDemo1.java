package com.hy.ch11AbstractAndInterface;
/**
 * 接口的使用
 * @author Administrator
 *
 */

interface Person3{
	String name="张三";
	int age = 25;
	String occupation="学生";
	
	//声明一个抽象方法talk()
	public abstract String talk();
}

class Student3 implements Person3{
	@Override
	public String talk() {
		return "姓名："+this.name+",年龄："+age+",职业："+occupation;
	}
}
public class TestInterfaceDemo1 {
	public static void main(String args[]) {
		Student3 s = new Student3();
		System.out.println(s.talk());
	}
}

