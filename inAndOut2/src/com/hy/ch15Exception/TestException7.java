package com.hy.ch15Exception;
/**
 * �Լ������쳣��
 * @author Administrator
 */
class MyException extends Exception{
	public MyException(String msg) {
		//����Exception��Ĺ��췽���������쳣��Ϣ
		super(msg);
	}
}

public class TestException7{
	public static void main(String[] args) {
		try{
			throw new MyException("�Զ����쳣��");	
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}