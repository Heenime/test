package com.hy.ch12ClassResearch;
/**
 * 真的匿名内部类new A（）
 * @author Administrator
 *
 */
interface A1{
	public void funA();
}
class B1{
	int i=10;
	public void get(A1 a) {
		a.funA();
	}
	public void test() {
		this.get(new A1() {

			@Override
			public void funA() {
				System.out.println(i);
			}
			
		});
	}
	
}
public class NonameInnerClass2 {
	public static void main(String args[]) {
		B b = new B();
		b.test();
	}
}
