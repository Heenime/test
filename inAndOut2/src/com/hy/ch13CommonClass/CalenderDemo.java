package com.hy.ch13CommonClass;

import java.util.Calendar;

/**
 * ������൱ǰ����230��������ʱ��
 * @author Administrator
 */

public class CalenderDemo {
	public static void main(String[] args) {
		Calendar c1 = Calendar.getInstance();
		//�����ӡ��ǰʱ��
		System.out.println(c1.get(c1.YEAR)+"��"+(c1.get(c1.MONTH)+1)+"��"+c1.get(c1.DAY_OF_MONTH)
		+"��"+c1.get(c1.HOUR)+":"+c1.get(c1.MINUTE)+":"+c1.get(c1.SECOND));
		//��������Ϊ230
		c1.add(c1.DAY_OF_YEAR, 230);
		
		//��ӡ230����ʱ��
		System.out.println(c1.get(c1.YEAR)+"��"+(c1.MONTH+1)+"��"+c1.get(c1.DAY_OF_MONTH)
		+"��"+c1.get(c1.HOUR)+":"+c1.get(c1.MINUTE)+":"+c1.get(c1.SECOND));
	}
}
