package com.hy.ch12ClassResearch;
/**
 * һ��������Ϊ���������ݣ������һ��������þ�̬��ʽ��ֵ
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
		System.out.println("��������"+tmp);
	}
}
