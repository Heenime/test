package com.hy.ch16Collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * ʹ��TreeMap����ʵ�ִ洢��Ŀ�ʲ�ƽ���
 * @author Administrator
 */
class Employee implements Comparator{

	@Override
	public int compare(Object arg0, Object arg1) {
	int k;
	String aStr,bStr;
	aStr=(String)arg0;
	bStr=(String)arg1;
	k=aStr.compareTo(bStr);
	if(k==0) {
		return  aStr.compareTo(bStr);
	}else {
		return k;
	}
		
	}
	
}


public class TreeMapDemo2 {

	public static void main(String[] args) {
		//����һ��TreeMap����
		TreeMap tm = new TreeMap(new Employee());
		//��Map�в���Ԫ��
		tm.put("Z�� ����",3425.8);
		tm.put("L�� ����",126.8);
		tm.put("W�� ����",1578.8);
		tm.put("Z�� ����",99.8);
		tm.put("S�� ����",29.8);
		Set set= tm.entrySet();
		Iterator it = set.iterator();
		while(it.hasNext()) {
			Map.Entry me = (Map.Entry)it.next();
			System.out.print(me.getKey()+"  :");
			System.out.println(me.getValue());
		}
		System.out.println();
		double ss=(double) tm.get("L�� ����");
		double bb= ss+2000;
		tm.put("L�� ����",bb);
		System.out.println("�������µ��ʽ���Ϊ��"+tm.get("L�� ����"));
		
		
	}
}
