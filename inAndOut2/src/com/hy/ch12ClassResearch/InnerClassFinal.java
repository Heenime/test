package com.hy.ch12ClassResearch;
/**
 * final����ֲ���������������
 * �ڷ����ж�����ڲ���ֻ�ܷ��ʷ����е�final���͵ı�������Ϊ��final���εı����൱��һ��������
 * �����������ڳ����������е��������ڡ�
 * @author Administrator
 */
class Outer5{
	int score =95;
	void inist(final int a) {
		//���final��Ҫ����Ҫ
		final int temp =20;
		class Inner5{
			void display() {
				System.out.println("�ɼ���score="+(score+temp+a));
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
