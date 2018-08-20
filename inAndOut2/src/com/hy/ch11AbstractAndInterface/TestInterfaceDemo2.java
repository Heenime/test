package com.hy.ch11AbstractAndInterface;
/**
 * 接口的继承使用
 * @author Administrator
 *
 */
interface A{
	public int i=10;
	public void sayA();
}

interface E{
	int x=40;
	public void sayE();
}
//B同时继承了A，E两个接口
interface B extends A,E{
	int j=20;
	public void sayB();
}
class C implements B{

	@Override
	public void sayA() {
		System.out.println("a="+i);
	}
	@Override
	public void sayE() {
		System.out.println("e="+x);
	}
	@Override
	public void sayB() {
		System.out.println("b="+j);
	}

}
public class TestInterfaceDemo2{
	public static void main(String args[]) {
		C c = new C();
		c.sayA();
		c.sayB();
		c.sayE();
	}
}
