package com.hy.ch16Collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * ���ƵıȽϷ�������
 * @author Administrator
 */
class MyCompare implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String aStr;
		String bStr;
		aStr=(String)o1;
		bStr=(String)o2;
		return bStr.compareTo(aStr);
	}
}
public class ComparatorDemo{
	public static void main(String[] args) {
		//����һ��TreeSet����
		TreeSet tr = new TreeSet(new MyCompare());
		//��TreeSet�����м�������
		tr.add("C");
		tr.add("A");
		tr.add("B");
		tr.add("E");
		tr.add("F");
		tr.add("D");
		//�õ�Iterator��ʵ������
		Iterator it = tr.iterator();
		//��ʾȫ������
		while(it.hasNext()) {
			Object o = it.next();
			System.out.println(o+" ");
		}
	}
}
