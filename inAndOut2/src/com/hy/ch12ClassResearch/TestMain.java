package com.hy.ch12ClassResearch;

public class TestMain {
	public static void main(String[] args) {
		//取得输入参数的长度
		int j=args.length;
		if(j!=2) {
			System.out.println(j);
			System.out.println("输入参数的个数有错误！");
			//退出程序
			System.exit(1);;
		}
		for(int i=0;i<args.length;i++) {
			System.out.println(args[i]);
		}
	}
}
