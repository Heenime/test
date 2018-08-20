package com.hy.ch15Exception;
/**
  * 在程序中抛出异常
 * @author Administrator
 * throw 异常实例对象
 */
public class TestException {
	public static void main(String[] args) {
		int a=7;
		int b=0;
		
		try {
				if(b==0) {
					throw new ArithmeticException("一个算术异常"); //抛出异常
				}else {
					System.out.println(a+"/"+b+"="+a/b);
				}
	
		}catch(ArithmeticException e) {
				e.printStackTrace();
				System.out.println("抛出的异常为："+e);
		}
		}
}
