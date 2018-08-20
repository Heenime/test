package com.hy.ch16Collection;

import java.util.Iterator;
import java.util.Vector;

/**
 * ??????????????›¥???????????????
 * @author Administrator
 */
public class VectorDemo {
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.add("A");
		v.add("B");
		v.add("C");
		v.add("E");
		v.add("F");
		v.add("D");
		
		//????????
		/*Enumeration<String> e =v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement()+"\t");
		}*/
		
		//????????
		Iterator<String> i = v.iterator();
		while(i.hasNext()) {
			System.out.println(i.next()+"\t");
		}
	}
}
