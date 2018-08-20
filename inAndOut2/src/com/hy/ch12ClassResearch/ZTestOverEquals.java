package com.hy.ch12ClassResearch;
/**
 * Object是所有类的父类，其中toString方法是需要覆写的
 * 不是比较内容的equals方法
 * @author Administrator
 *
 */
class Person10{
	private String name;
	private int age;
	public Person10(String name,int age) {
		this.name=name;
		this.age=age;
	}
	//覆写父类（Object类）中的equals方法
	public boolean equals(Object o) {
		boolean temp = false;
	//声明一个p1对象，此对象实际就是当前equals方法的对象
		Person10 p1 = this;
	//判断Object类对象是否是person的实例
		if(o instanceof Person10) {
			Person10 p2 =(Person10) o;
			if(p1.name.equals(p2.name)&&p1.age==p2.age) {
				temp=true;
			}
		}else {
			temp=false;
		}
		return temp;
	}
}
public class ZTestOverEquals {
	public static void main(String args[]) {
		Person10 p1 = new Person10("张三",24);
		Person10 p2 = new Person10("张三",25);
	    //判断p1和p2是否相等（比较的是内存地址）
		System.out.println(p1.equals(p2)?"是同一个人":"不是同一个人");
	}
}
