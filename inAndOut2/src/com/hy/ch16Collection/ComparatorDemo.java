package com.hy.ch16Collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * 定制的比较方法能力
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
		//创建一个TreeSet对象
		TreeSet tr = new TreeSet(new MyCompare());
		//向TreeSet对象中加入内容
		tr.add("C");
		tr.add("A");
		tr.add("B");
		tr.add("E");
		tr.add("F");
		tr.add("D");
		//得到Iterator的实例对象
		Iterator it = tr.iterator();
		//显示全部内容
		while(it.hasNext()) {
			Object o = it.next();
			System.out.println(o+" ");
		}
	}
}
