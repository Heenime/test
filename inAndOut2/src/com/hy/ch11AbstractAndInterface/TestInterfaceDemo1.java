package com.hy.ch11AbstractAndInterface;
/**
 * �ӿڵ�ʹ��
 * @author Administrator
 *
 */

interface Person3{
	String name="����";
	int age = 25;
	String occupation="ѧ��";
	
	//����һ�����󷽷�talk()
	public abstract String talk();
}

class Student3 implements Person3{
	@Override
	public String talk() {
		return "������"+this.name+",���䣺"+age+",ְҵ��"+occupation;
	}
}
public class TestInterfaceDemo1 {
	public static void main(String args[]) {
		Student3 s = new Student3();
		System.out.println(s.talk());
	}
}

