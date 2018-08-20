package com.hy.ch12ClassResearch;
/**
 * 匿名内部类使用实例   内部类也可以继承一个抽象类或者一个接口
 * @author Administrator
 *
 */
interface A {
	public void funA();
}
class B{
	int i=10;
	class C implements A{
		@Override
		public void funA() {
			System.out.println(i);
		}
	}
	
	public void get(A a) {
		a.funA();
	}
	public void test() {
		//B中获得内部类C
		this.get(new C());
	}
}

public class NonameInnerClass {
	public static void main(String args[]) {
		B b= new B();
		b.test();
	}
}
