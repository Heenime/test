package com.hy.ch12ClassResearch;

public class TestMain {
	public static void main(String[] args) {
		//ȡ����������ĳ���
		int j=args.length;
		if(j!=2) {
			System.out.println(j);
			System.out.println("��������ĸ����д���");
			//�˳�����
			System.exit(1);;
		}
		for(int i=0;i<args.length;i++) {
			System.out.println(args[i]);
		}
	}
}
