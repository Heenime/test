package com.hy.ch12ClassResearch;
/**
 * ������ⲿ�����ڲ���
 */
class Outer3{
	int score=95;
	void inst() {
		Inner3 in = new Inner3();
		in.display();
	}
	public class Inner3{
		void display() {
			System.out.println("�ɼ���"+score);
		}
	}
}
public class InvokeInnerClass {
	public static void main(String args[]) {
		Outer3 o = new Outer3();
		//********************�������ò�����һ���ڲ���
		Outer3.Inner3 inner = o.new Inner3();
		inner.display();
	}
}
