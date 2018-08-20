package com.hy.ch16Collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

/**
 * TreeMap的使用
 * @author Administrator
 */
public class TreeMapDemo {
	public static void main(String[] args) {
		//创建treeMap
		TreeMap tm = new TreeMap();
		
		//加入元素
		tm.put(10000-2000, "张三");
		tm.put(10000-1500, "李四");
		tm.put(10000-2500, "王五");
		tm.put(10000-5000, "赵六");
		
		Collection col =tm.values();
		Iterator it =col.iterator();
		
		System.out.println("按照工资由高到底书序输出：");
		
		//他们用名字而不是用姓进行排序
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
