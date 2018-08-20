package com.hy.ch12ClassResearch;
/**
 * 方法中返回一个二维数组
 * @author Administrator
 *
 */


public class TestArray {
	
	public static void main(String args[]) {
		int A[][]= {{1,2,3,4,5},{56,67,343,67,456,546}};
		int B[][]=new int[2][5];
		B=add(A);
		for(int i=0;i<B.length;i++) {
			for(int j=0;j<B[i].length;j++) {
				System.out.print(B[i][j]+" ");
			}
			System.out.print("\n");
		}
	}
	
	
	public static int[][] add(int arr[][]){
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]+=10;
			}
		}
		return arr;
	}
}
