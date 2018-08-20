package com.hy.ch12ClassResearch;
/**
 * 在类的外部引用内部类
 */
class Outer3{
	int score=95;
	void inst() {
		Inner3 in = new Inner3();
		in.display();
	}
	public class Inner3{
		void display() {
			System.out.println("成绩："+score);
		}
	}
}
public class InvokeInnerClass {
	public static void main(String args[]) {
		Outer3 o = new Outer3();
		//********************声明引用并创建一个内部类
		Outer3.Inner3 inner = o.new Inner3();
		inner.display();
	}
}
