package com.hy.ch12ClassResearch;
/**
 * ��̬����龭���������������Եĳ�ʼ��
 */
class Person19 {
	public Person19(){
		System.out.println("person ���޲ι��췽��ִ��");
	}
	
	 static {
		System.out.println("person���еľ�̬�����ִ��"); 
	 }
}

public class TestStaticDemos{
	static {
		System.out.println("TestStaticDemos���еľ�̬�����ִ��");
	}
	public static void main(String[] args) {
		System.out.println("����ʼִ�У�");
		//��������ʵ��������
		new Person19();
		new Person19();
	}
}