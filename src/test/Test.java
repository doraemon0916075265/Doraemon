package test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

		Date date = new Date(899999446465L);
		long dd= date.getTime();
		System.out.println(dd);
		String time = sdf.format(date);
		System.out.println(date);
		System.out.println(time);
	}

}
