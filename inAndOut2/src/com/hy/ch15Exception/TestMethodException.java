package com.hy.ch15Exception;
/**
 * ʹ��ָ�������׳��쳣
 */
 class Test {
	//throw���ƶ������в������쳣���ڵ��ô˷����ĵط�����
	void add(int a,int b)throws Exception {
		int c;
		c=a/b;
		System.out.println(a+"/"+b+"="+c);
	}
}
public class TestMethodException{
	private void mian() {
		Test t = new Test();
		try {
			t.add(4, 0);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}