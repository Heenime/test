package com.hy.ch16Collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

/**
 * TreeMap��ʹ��
 * @author Administrator
 */
public class TreeMapDemo {
	public static void main(String[] args) {
		//����treeMap
		TreeMap tm = new TreeMap();
		
		//����Ԫ��
		tm.put(10000-2000, "����");
		tm.put(10000-1500, "����");
		tm.put(10000-2500, "����");
		tm.put(10000-5000, "����");
		
		Collection col =tm.values();
		Iterator it =col.iterator();
		
		System.out.println("���չ����ɸߵ������������");
		
		//���������ֶ��������ս�������
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
