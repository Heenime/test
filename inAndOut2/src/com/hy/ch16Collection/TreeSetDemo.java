package com.hy.ch16Collection;

import java.util.TreeSet;
/**
 * @author Administrator
 */
public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet();
		//加入元素到TreeSet中
		ts.add("C");
		ts.add("A");
		ts.add("B");
		ts.add("E");
		ts.add("F");
		ts.add("D");
		System.out.println(ts);
	
	}
}
