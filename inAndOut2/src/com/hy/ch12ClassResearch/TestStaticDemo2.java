package com.hy.ch12ClassResearch;
/**
 * ��̬static���÷� ��static ���ε��ǹ�������
 * @author Administrator
 *
 */
class Person17{
	String name;
	int age;
	static String city="�й�";
	static int count=0;
	public Person17(String name, int age) {
		count++;
		this.name=name;
		this.age=age;
	}
	public String talk() {
		return"������"+this.name+"   ���䣺"+this.age+"    ����"+city;
	}
}
public class TestStaticDemo2 {
	public static void main(String[] args) {
		Person17 p1 = new Person17("����",37);
		Person17 p2 = new Person17("����",57);
		Person17 p3 = new Person17("����",87);
		
		System.out.println("�޸�֮ǰ����Ϣ��"+p1.talk());
		System.out.println("�޸�֮ǰ����Ϣ��"+p2.talk());
		System.out.println("�޸�֮ǰ����Ϣ��"+p3.talk());
		
		System.out.println("********�޸�֮�����Ϣ***********");
		
		p1.city="����";
		p1.name="��������";
		
		System.out.println("�޸�֮�����Ϣ��"+p1.talk());
		System.out.println("�޸�֮�����Ϣ��"+p2.talk());
		System.out.println("�޸�֮�����Ϣ��"+p3.talk());
		
		System.out.println(p1.count);
		
	}
}
