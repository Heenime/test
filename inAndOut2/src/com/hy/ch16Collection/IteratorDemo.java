package com.hy.ch16Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
/**
 * ?????????????????
 * @author Administrator
 */
public class IteratorDemo {
	public static void main(String[] args) {
		//???????arraylist????
		ArrayList ar = new ArrayList();
		//????????ArrayList??
		ar.add("C");
		ar.add("A");
		ar.add("E");
		ar.add("B");
		ar.add("D");
		ar.add("F");
		
		
		//???iterator???a1?��?????
		System.out.println("a1?��??????????");
		Iterator it =ar.iterator();
		while(it.hasNext()) {
			Object element =it.next();
			System.out.print(element+"  ");
		}
		System.out.println();
		
		//??Listiterator?????????
		ListIterator lat=ar.listIterator();
		while(lat.hasNext()) {
			Object element=lat.next();
			lat.set(element+"hehe");
		}
		System.out.println("??????????????");
		it=ar.iterator();
		while(it.hasNext()){
			Object element = it.next();
			System.out.print(element+"  ");                         
		}
		System.out.println();
		
		//???��??��???????????
		System.out.println("???��????????");
		//hasPrevious?????????
		while(lat.hasPrevious()) {
				Object element = lat.previous();
				System.out.print(element+"  ");
		}
				System.out.println();
	}
}
