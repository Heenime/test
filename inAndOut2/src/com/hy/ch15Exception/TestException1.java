package com.hy.ch15Exception;
/**
 * �򵥵��쳣����
 * @author Administrator
 * 
 * try{
 * 		Ҫ���ĳ�����䣻
 * 
 * }catch(�쳣�� ��������){
 *      
 *        	�쳣����ʱ�Ĵ���
 * 
 * }finally{
 * 			һ����ִ�е��Ĵ��룻
 */
public class TestException1 {
	public static void main(String[] args) {
		try {
		int[] arr= new int[5];
		arr[10]=7;
		System.out.println("end of main method!!");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�����±�Խ��");
		}finally {
			System.out.println("һ����ִ�д����");
		}
			System.out.println("�������");
		}
}
