package com.hy.ch12ClassResearch;
/**
 * 在方法中定义内部类
 * @author Administrator
 */
class Outer4{
	int score =95;
	void inst() {
		class Inner4{
			void display() {
				System.out.println("成绩："+score);
			}
		}
	Inner4 in = new Inner4();
	in.display();
	}
}

public class ClassInMethod {
	public static void main(String args[]) {
		Outer4 o = new Outer4();
		o.inst();
	}
}
