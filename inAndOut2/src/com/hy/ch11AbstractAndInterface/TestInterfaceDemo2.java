package com.hy.ch11AbstractAndInterface;
/**
 * �ӿڵļ̳�ʹ��
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
//Bͬʱ�̳���A��E�����ӿ�
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
