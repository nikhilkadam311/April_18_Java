package org.datePractise;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex1 {
public static void main(String[] args) {
		Date dt = new Date();
		//System.out.println(dt);
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss:SSS");
		String d = sdf.format(dt);
		d = d.replaceAll("-", "").replaceAll(" ", "").replaceAll(":", "");
		System.out.println(d);
	}
}