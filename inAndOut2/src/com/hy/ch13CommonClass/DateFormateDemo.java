package com.hy.ch13CommonClass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormateDemo {
	public static void main(String[] args) {
		SimpleDateFormat sp1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		SimpleDateFormat sp2 = new SimpleDateFormat("yyyy年MM月dd日  hh点mm分ss秒");
		try {
			Date d = sp1.parse("2005-8-11 18:36:26");
			System.out.println(sp2.format(d));
		}catch(ParseException e) {
			e.printStackTrace();
		}
	}
}
