package com.hy.ch12ClassResearch;
/**
 * java对象中的引用传递（属性）
 * @author Administrator
 *
 */
class Change{
	int x=0;
}
public class TestReference2 {
	public static void main(String args[]) {
		Change c  = new Change();
		c.x=20;
		chuan(c);
		System.out.println(c.x);
	}
	
	public static void chuan(Change cc) {
		cc.x=29;
	}
}
