package com.hy.ch11AbstractAndInterface;
/**
 * 限制子类的访问
 * @author Administrator
 *
 */
abstract class Person{
	String name;
	int age;
	String occupation;
	//声明抽象方法talk()
	public abstract String talk();
}
	//Student 类继承自Person类
class Student extends Person{
	public Student(String name,int age,String occupation ) {
		this.name=name;
		this.age=age;
		this.occupation = occupation;
		
	}
	//覆写talk()方法
	@Override
	public String talk() {
		return "学生--->姓名："+this.name+",年龄"+this.age+",职业："+this.occupation+"|";
	}
}
	//work继承自Person类
class Worker extends Person{
	public Worker(String name,int age,String occupation ) {
		this.name=name;
		this.age=age;
		this.occupation = occupation;
		
	}
	//覆写talk（）方法
		@Override
		public String talk() {
			return "工人--->姓名："+this.name+"，年龄："+this.age+",职业："+this.occupation+"|";
		}
}

public class TestAbstarctDemo {
	public static void main (String args[]) {
		Student s = new Student("huahua",30,"student");
		Worker w = new Worker("hu",50,"worker");
		System.out.println(s.talk());
		System.out.println(w.talk());
		
	}
}
