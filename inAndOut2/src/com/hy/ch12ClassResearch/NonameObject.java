package com.hy.ch12ClassResearch;
/**
 * �������� û����ȷ�������õĶ���  
 * @author Administrator
 *
 */
class Person6{ 
	private String name="����";
	private int age=25;
	public String talk() {
		return "name:"+name+"         age:"+age;
	}
}
public class NonameObject {
	public static void main(String args[]) {
		System.out.println(new Person6().talk());
	}
}
