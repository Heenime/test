package com.hy.ch12ClassResearch;
/**
 * 声明并使用一个方法
 * @author Administrator
 *
 */
public class TestJavaShengMing {
	public static void main(String args[]) {
		star();
		System.out.println("I like java");
		star();
	}
	
	public static void star() {
		for(int i=0;i<=19;i++) {
			System.out.print("*");
		}
		System.out.print("\n");
	}
}

