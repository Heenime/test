package com.hy.ch15Exception;
/**
  * �ڳ������׳��쳣
 * @author Administrator
 * throw �쳣ʵ������
 */
public class TestException {
	public static void main(String[] args) {
		int a=7;
		int b=0;
		
		try {
				if(b==0) {
					throw new ArithmeticException("һ�������쳣"); //�׳��쳣
				}else {
					System.out.println(a+"/"+b+"="+a/b);
				}
	
		}catch(ArithmeticException e) {
				e.printStackTrace();
				System.out.println("�׳����쳣Ϊ��"+e);
		}
		}
}
