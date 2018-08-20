package com.hy.ch15Exception;
/**
 * 简单的异常范例
 * @author Administrator
 * 
 * try{
 * 		要检查的程序语句；
 * 
 * }catch(异常类 对象名称){
 *      
 *        	异常发生时的处理；
 * 
 * }finally{
 * 			一定会执行到的代码；
 */
public class TestException1 {
	public static void main(String[] args) {
		try {
		int[] arr= new int[5];
		arr[10]=7;
		System.out.println("end of main method!!");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("数组下标越界");
		}finally {
			System.out.println("一定被执行代码块");
		}
			System.out.println("代码结束");
		}
}
