package com.example.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GetCurrentDate {
	public static String getCurrentDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String dateString = sdf.format(new Date());
		return dateString;
	}
	
}
