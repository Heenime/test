package com.hy.ch16Collection;

import java.util.LinkedList;

/** linkList���ʹ��
 * @author Administrator
 */
public class LinkListDemo {
   public static void main(String[] args) {
	//����LinkedList����
	LinkedList<String> ll = new LinkedList<String>();
	//����Ԫ�ص�LinkedList��
	ll.add("F");
	ll.add("B");
	ll.add("D");
	ll.add("E");
	ll.add("C");
	System.out.println("�����ʼԪ�أ�"+ll);
	//����������һ��λ���ϼ�������
	ll.addLast("Z");
	//������ĵ�һ��λ���ϲ���
	ll.addFirst("A");
	//������ĵڶ���Ԫ�ص�λ���ϼ�������
	ll.add(1,"A2");
	System.out.println("����֮������ݣ�"+ll);
	//��LinkList��ɾ��Ԫ��
	ll.remove("F");
	ll.remove(2);
	System.out.println("��ll���Ƴ�Ԫ��֮��"+ll);
	//�Ƴ���һ�������һ��Ԫ��
	ll.removeFirst();
	ll.removeLast();
	System.out.println("�Ƴ���һ�������һ�������ݣ�"+ll);
	//ȡ�ò�����ֵ
	Object val= ll.get(2);
	ll.set(2, val+"Changed");
	System.out.println("ll���ı�֮��"+ll);
	
	
}
 
}
