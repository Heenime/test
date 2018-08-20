package com.hy.ch16Collection;

import java.util.ArrayList;

/**
 * ArrayList��ʹ�÷���
 * @author Administrator
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		//����һ��ArrayList����
		ArrayList ai = new ArrayList();
		System.out.println("a1 �ĳ�ʼ����С��"+ai.size());
		//��ArrayList�����������
		ai.add("C");
		ai.add("A");
		ai.add("E");
		ai.add("B");
		ai.add("D");
		ai.add("F");
		//��A2����ArrayList����ĵڶ���λ��
		ai.add(1,"A2");
		System.out.println("a1����Ԫ��֮��Ĵ�С��"+ai.size());
		//��ʾArrayList����
		System.out.println("a1�����ݣ�"+ai);
		//��ArrayList���Ƴ�����
		ai.remove("F");
		ai.remove(2);
		System.out.println("a1ɾ��Ԫ��֮��Ĵ�С��"+ai.size());
		System.out.println("a1�����ݣ�"+ai);
	}
}
