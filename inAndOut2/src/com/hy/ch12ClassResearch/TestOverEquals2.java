package com.hy.ch12ClassResearch;
/**
 * ��дequals����
 * @author Administrator
 *
 */
class Person11{
	private String name;
	private int age;
	public Person11(String name,int age) {
		this.name=name;
		this.age=age;
	}
	//��д���ࣨObject�ࣩ�е�equals����
		public boolean equals(Object o) {
			boolean temp = true;
			//����һ���¶��󣬴˶���ʵ���Ͼ��ǵ�ǰ����equals�����Ķ���
			Person11 p1=this;
			//�ж�Object���Ƿ���Person��ʵ��
			if(o instanceof Person11) {
				//���Person��ʵ�������������ת��
				Person11 p2 = (Person11)o;
				//����String ���е�equals����
				if(!(p1.name.equals(p2.name)&&p1.age==p2.age)) {
					temp=false;
				}
			}else {
				//�������ֱ�ӷ���temp=false
				temp=false;
			}
			return temp;
		}
}
	
public class TestOverEquals2 {
	public static void main(String args[]) {
		Person11 t_p1 = new Person11("����",26);
		Person11 t_p2 = new Person11("����",26);
		//�ж�p1p2�������Ƿ����
		System.out.println(t_p1.equals(t_p2)?"��ͬһ����":"����ͬһ����");
		
				
	}
}
