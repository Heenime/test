package com.hy.ch12ClassResearch;
/**
 * �����ڲ���ʹ��ʵ��   �ڲ���Ҳ���Լ̳�һ�����������һ���ӿ�
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
		//B�л���ڲ���C
		this.get(new C());
	}
}

public class NonameInnerClass {
	public static void main(String args[]) {
		B b= new B();
		b.test();
	}
}
