package com.hy.ch13CommonClass;
/**
 * java�������ӽ��̽������򿪼��±���
 * ͨ��Runtime�����Ϊ������ִ�в���ϵͳ�Ŀ�ִ�г���
 * @author Administrator
 *
 */
public class RuntimeDemo {
	public static void main(String[] args) {
		Runtime run = Runtime.getRuntime();
		try {
			run.exec("notepad.exe");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
				
	}
}
