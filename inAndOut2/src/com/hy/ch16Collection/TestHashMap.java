package com.hy.ch16Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 将名字映射到资产账目表
 * @author Administrator
 */
public class TestHashMap {
	public static void main(String[] args) {
		//创建HashMap对象
		HashMap hm = new HashMap();
		
		//加入元素到hashMap中
		hm.put("jone", 4857.6);
		hm.put("jone2", 4857.6);
		hm.put("jone4", 4857.6);
		hm.put("jone3", 4857.6);
		hm.put("jone5", 4857.6);
		
		//返回包含映射中项的集合
		Set set =hm.entrySet();
		
		//用iterator得到HashMap中的内容
		Iterator it  = set.iterator();
		
		//显示元素
		while(it.hasNext()) {
			//Map.Entry可以操作映射的输入
			Map.Entry me =(Map.Entry) it.next();
			System.out.print(me.getKey()+":");
			System.out.println(me.getValue());
		}
		System.out.println();
		
		
		//让jone增加1000
		double balance=(Double) hm.get("jone");
		hm.put("jone", balance+1000);
		System.out.println("jone现在的资金："+hm.get("jone"));
	}
	}
