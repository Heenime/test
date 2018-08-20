package com.hy.ch12ClassResearch;
/**
 * final定义局部变量的生命周期
 * 在方法中定义的内部类只能访问方法中的final类型的变量，因为用final修饰的变量相当于一个常量，
 * 它的生命周期超出方法运行的生命周期。
 * @author Administrator
 */
class Outer5{
	int score =95;
	void inist(final int a) {
		//这个final可要不可要
		final int temp =20;
		class Inner5{
			void display() {
				System.out.println("成绩：score="+(score+temp+a));
			}
		}
		Inner5 in = new Inner5();
		in.display();
	}
}
public class InnerClassFinal {
	public static void main(String args[]) {
		Outer5 o = new Outer5();
		o.inist(5);
	}
}
