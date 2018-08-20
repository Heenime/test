package com.hy.ch12ClassResearch;

import java.util.Enumeration;
import java.util.Properties;

/**
 * 打印当前虚拟机所有环境属性的变量和值
 * @author Administrator
 *
 */
public class SystemInfo {
	public static void main(String[] args) {
		Properties sp = System.getProperties();
		Enumeration e =sp.propertyNames();
		while(e.hasMoreElements()) {
			String key=(String)e.nextElement();
			System.out.println(key+"="+sp.getProperty(key));
		}
	}
}
