package com.hy.ch15Exception;
/**
 * 使用指定方法抛出异常
 */
 class Test {
	//throw在制定方法中不处理异常，在调用此方法的地方处理
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