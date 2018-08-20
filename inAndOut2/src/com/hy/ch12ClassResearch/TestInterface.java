package com.hy.ch12ClassResearch;
/**
 * 接口对象的实例化使用实例
 */
interface Usb{
	public void strat();
	public void stop();
}

class MoveDisk implements Usb{
	@Override
	public void strat() {
		System.out.println("MoveDisk start ....");
	}
	@Override
	public void stop() {
		System.out.println("MoveDisk stop ....");
	}
}

class Mp3 implements Usb{

	@Override
	public void strat() {
		System.out.println("Mp3 start ....");
	}
	@Override
	public void stop() {
		System.out.println("Mp3 stop ....");		
	}
}
class Computer{
	public void work(Usb u) {
		u.strat();
		u.stop();
	}
}
public class TestInterface {
	public static void main(String args[]) {
		new Computer().work(new MoveDisk());
		new Computer().work(new Mp3());
	}
}
