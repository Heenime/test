package com.hy.ch12ClassResearch;
/**
 * 用static声明的内部类访问非static的外部属性是不行的，可以把外部类属性前面加上static
 * @author Administrator
 */
class Outer2{
	static int score=56;
	void inst() {
		Inner2 in = new Inner2();
		in.display();
	}
	//这里用static声明内部类
	static class Inner2{
		void display() {
			System.out.println("成绩：score="+score);
		}
	}
}
public class InnerStaticClass {
	public static void main(String args[]) {
		Outer2 outer = new Outer2();
		outer.inst();
	}
}
