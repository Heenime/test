package com.hy.ch12ClassResearch;
/**
 * ��java�������������͵Ĵ���(����)
 * @author Administrator
 *
 */
class Person9{
	String name;
	int age;
}
public class TestReference {
	public static void main(String args[]) {
		//����һ������p1,�˶����ֵΪnull;��ʾδʵ����
		Person9 p1 = null;
		//����һ������p2,�˶����ֵΪnull;��ʾδʵ����
		Person9 p2 = null;
		p1= new Person9();
		p1.name="����";
		p1.age=26;
		//��p1���ø�ֵ��p2
		p2=p1;
		//���p2�е�����
		System.out.println("������"+p2.name);
		System.out.println("���䣺"+p2.age);
		p1=null;
	
	}
}
