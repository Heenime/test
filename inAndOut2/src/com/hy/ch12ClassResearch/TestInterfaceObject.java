package com.hy.ch12ClassResearch;
/**
 * �ӿڶ����ʵ����ʹ��ʵ��
 * @author Administrator
 *
 */
interface Person12{
	public void fun1();
	}
class Student11 implements Person12{

	@Override
	public void fun1() {
		System.out.println("Student fun1()");
	}
}

public class TestInterfaceObject {
	public static void main(String args[]) {
		Person12 p = new Student11();
		p.fun1();
	}
}
