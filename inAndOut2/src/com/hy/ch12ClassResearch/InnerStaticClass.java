package com.hy.ch12ClassResearch;
/**
 * ��static�������ڲ�����ʷ�static���ⲿ�����ǲ��еģ����԰��ⲿ������ǰ�����static
 * @author Administrator
 */
class Outer2{
	static int score=56;
	void inst() {
		Inner2 in = new Inner2();
		in.display();
	}
	//������static�����ڲ���
	static class Inner2{
		void display() {
			System.out.println("�ɼ���score="+score);
		}
	}
}
public class InnerStaticClass {
	public static void main(String args[]) {
		Outer2 outer = new Outer2();
		outer.inst();
	}
}
