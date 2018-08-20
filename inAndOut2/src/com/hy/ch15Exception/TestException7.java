package com.hy.ch15Exception;
/**
 * 自己定义异常类
 * @author Administrator
 */
class MyException extends Exception{
	public MyException(String msg) {
		//调用Exception类的构造方法，存入异常信息
		super(msg);
	}
}

public class TestException7{
	public static void main(String[] args) {
		try{
			throw new MyException("自定义异常！");	
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}