package com.hy.ch12ClassResearch;
/**
 * �ڲ����ʹ��
 * @author Administrator
 *
 */

class Outer{
	int score =95;
	void inst() {
		Inner in =new Inner();
		in.display();
	}
		class Inner{
			void display() {
				System.out.println("�ɼ���score="+score);
			}
		}
	}

public class InnerClassDemo {
	public static void main(String args[]) {
		Outer outer = new Outer();
		outer.inst();
	}
}
