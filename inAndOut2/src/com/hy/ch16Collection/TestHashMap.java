package com.hy.ch16Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * ������ӳ�䵽�ʲ���Ŀ��
 * @author Administrator
 */
public class TestHashMap {
	public static void main(String[] args) {
		//����HashMap����
		HashMap hm = new HashMap();
		
		//����Ԫ�ص�hashMap��
		hm.put("jone", 4857.6);
		hm.put("jone2", 4857.6);
		hm.put("jone4", 4857.6);
		hm.put("jone3", 4857.6);
		hm.put("jone5", 4857.6);
		
		//���ذ���ӳ������ļ���
		Set set =hm.entrySet();
		
		//��iterator�õ�HashMap�е�����
		Iterator it  = set.iterator();
		
		//��ʾԪ��
		while(it.hasNext()) {
			//Map.Entry���Բ���ӳ�������
			Map.Entry me =(Map.Entry) it.next();
			System.out.print(me.getKey()+":");
			System.out.println(me.getValue());
		}
		System.out.println();
		
		
		//��jone����1000
		double balance=(Double) hm.get("jone");
		hm.put("jone", balance+1000);
		System.out.println("jone���ڵ��ʽ�"+hm.get("jone"));
	}
	}
