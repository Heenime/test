package com.hy.ch16Collection;

import java.util.HashSet;

/**
 *HashSet���ʹ�� 
 * @author Administrator
 */
public class HashSetDemo2 {
	public static void main(String[] args) {
		//����HashSet����
		HashSet<String> hs = new HashSet<String>();
		hs.add("B");
		hs.add("A");
		hs.add("D");
		hs.add("E");
		hs.add("C");
		hs.add("F");
		System.out.println(hs);
	}
}
