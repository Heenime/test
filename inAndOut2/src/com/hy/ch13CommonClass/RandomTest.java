package com.hy.ch13CommonClass;

import java.util.Random;

/**
 * ���������(\t�ǿո��)
 * @author Administrator
 *
 */
public class RandomTest {
	public static void main(String[] args) {
		Random r = new Random();
		for(int i=0;i<5;i++) {
			System.out.println(r.nextInt(100)+"\t");
		}
	}
}
