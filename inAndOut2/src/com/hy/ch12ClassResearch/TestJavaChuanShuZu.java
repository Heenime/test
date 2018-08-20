package com.hy.ch12ClassResearch;
/**
 * 一对数组作为参数来传递，这里的一堆数组采用静态方式赋值
 * @author Administrator
 *
 */
public class TestJavaChuanShuZu {
	public static void main(String args[]) {
		int score[] = {1,345,436,657,687,78,67867};
		largest(score);
	}
	
	public static void largest(int arr[]) {
		int tmp = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(tmp<arr[i]) {
				tmp=arr[i];
			}
		}
		System.out.println("最大的数："+tmp);
	}
}
