package com.hy.ch12ClassResearch;
/**
 * Object��������ĸ��࣬����toString��������Ҫ��д��
 * ���ǱȽ����ݵ�equals����
 * @author Administrator
 *
 */
class Person10{
	private String name;
	private int age;
	public Person10(String name,int age) {
		this.name=name;
		this.age=age;
	}
	//��д���ࣨObject�ࣩ�е�equals����
	public boolean equals(Object o) {
		boolean temp = false;
	//����һ��p1���󣬴˶���ʵ�ʾ��ǵ�ǰequals�����Ķ���
		Person10 p1 = this;
	//�ж�Object������Ƿ���person��ʵ��
		if(o instanceof Person10) {
			Person10 p2 =(Person10) o;
			if(p1.name.equals(p2.name)&&p1.age==p2.age) {
				temp=true;
			}
		}else {
			temp=false;
		}
		return temp;
	}
}
public class ZTestOverEquals {
	public static void main(String args[]) {
		Person10 p1 = new Person10("����",24);
		Person10 p2 = new Person10("����",25);
	    //�ж�p1��p2�Ƿ���ȣ��Ƚϵ����ڴ��ַ��
		System.out.println(p1.equals(p2)?"��ͬһ����":"����ͬһ����");
	}
}
