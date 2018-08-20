package com.hy.ch13CommonClass;
/**
 * java进程与子进程交互（打开记事本）
 * 通过Runtime类可以为开发者执行操作系统的可执行程序
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
