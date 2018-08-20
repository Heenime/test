package com.hy.ch12ClassResearch;
/**
 * 重写equals方法
 * @author Administrator
 *
 */
class Person11{
	private String name;
	private int age;
	public Person11(String name,int age) {
		this.name=name;
		this.age=age;
	}
	//覆写父类（Object类）中的equals方法
		public boolean equals(Object o) {
			boolean temp = true;
			//声明一个怕对象，此对象实际上就是当前调用equals方法的对象
			Person11 p1=this;
			//判断Object类是否是Person的实例
			if(o instanceof Person11) {
				//如果Person是实例，则进行向下转型
				Person11 p2 = (Person11)o;
				//调用String 类中的equals方法
				if(!(p1.name.equals(p2.name)&&p1.age==p2.age)) {
					temp=false;
				}
			}else {
				//如果不是直接返货temp=false
				temp=false;
			}
			return temp;
		}
}
	
public class TestOverEquals2 {
	public static void main(String args[]) {
		Person11 t_p1 = new Person11("张三",26);
		Person11 t_p2 = new Person11("张三",26);
		//判断p1p2的内容是否相等
		System.out.println(t_p1.equals(t_p2)?"是同一个人":"不是同一个人");
		
				
	}
}
