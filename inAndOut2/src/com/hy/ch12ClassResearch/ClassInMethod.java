package com.hy.ch12ClassResearch;
/**
 * �ڷ����ж����ڲ���
 * @author Administrator
 */
class Outer4{
	int score =95;
	void inst() {
		class Inner4{
			void display() {
				System.out.println("�ɼ���"+score);
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
