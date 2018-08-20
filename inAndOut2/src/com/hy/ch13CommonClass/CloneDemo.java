package com.hy.ch13CommonClass;
/**
 * 对象克隆，重写克隆方法
 * @author Administrator
 */
class Employee implements Cloneable{
	private String name;
	private int age;
	public Employee(String name,int age) {
		this.name= name;
		this.age=age;
	}
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	public String toString() {
		return "姓名："+this.name+",年龄；"+this.age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

public class CloneDemo {
	public static void main(String[] args) {
		Employee e1 = new Employee("张三",21);
		Employee e2 = null;
		try {
			e2=(Employee) e1.clone();
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		e2.setName("李四");
		e2.setAge(78);
		
		System.out.println("对象内存地址比较;:" +(e1==e2));
		System.out.println(e1);
		System.out.println(e2);
	}
}
