package com.hy.ch12ClassResearch;
/**
 * ��̬����
 * @author Administrator
 */
class Person18{
	String name;
	int age;
	//���þ�̬����
	private static String city="�й�";
	static int count=0;
	public Person18(String name, int age) {
		count++;
		this.name=name;
		this.age=age;
	}
	//�����̬�������޸ľ�̬����
	public static void setCity(String ci) {
		city=ci;
	}
	public String talk() {
		return"������"+this.name+"   ���䣺"+this.age+"    ����"+city;
	}
}
public class TestStaticDemo {
	public static void main(String[] args) {
		Person18 p1 = new Person18("����",37);
		Person18 p2 = new Person18("����",57);
		Person18 p3 = new Person18("����",87);
		
		System.out.println("�޸�֮ǰ����Ϣ��"+p1.talk());
		System.out.println("�޸�֮ǰ����Ϣ��"+p2.talk());
		System.out.println("�޸�֮ǰ����Ϣ��"+p3.talk());
		
		System.out.println("********�޸�֮�����Ϣ***********");
		//��̬����Ҫ������ȥ����
		Person18.setCity("����2");
		p1.name="��������";
		
		System.out.println("�޸�֮�����Ϣ��"+p1.talk());
		System.out.println("�޸�֮�����Ϣ��"+p2.talk());
		System.out.println("�޸�֮�����Ϣ��"+p3.talk());
		
		System.out.println(p1.count);
		
	}
}

