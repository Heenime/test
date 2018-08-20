package com.hy.ch16Collection;

import java.util.LinkedList;

/** linkList类的使用
 * @author Administrator
 */
public class LinkListDemo {
   public static void main(String[] args) {
	//创建LinkedList对象
	LinkedList<String> ll = new LinkedList<String>();
	//加入元素到LinkedList中
	ll.add("F");
	ll.add("B");
	ll.add("D");
	ll.add("E");
	ll.add("C");
	System.out.println("链表初始元素："+ll);
	//在链表的最后一个位置上加入数据
	ll.addLast("Z");
	//在链表的第一个位置上插入
	ll.addFirst("A");
	//在链表的第二个元素的位置上加入数据
	ll.add(1,"A2");
	System.out.println("增加之后的内容："+ll);
	//从LinkList中删除元素
	ll.remove("F");
	ll.remove(2);
	System.out.println("从ll中移除元素之后；"+ll);
	//移除第一个和最后一个元素
	ll.removeFirst();
	ll.removeLast();
	System.out.println("移除第一个和最后一个的内容："+ll);
	//取得并设置值
	Object val= ll.get(2);
	ll.set(2, val+"Changed");
	System.out.println("ll被改变之后："+ll);
	
	
}
 
}
