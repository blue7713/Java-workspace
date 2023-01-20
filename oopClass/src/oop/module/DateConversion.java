package oop.module;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateConversion {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		
		long time = date.getTime();
		System.out.println("Time in milliseconds: " + time);
		
		date.setTime(0);
		System.out.println("Epoch time: " + date);
		
		Calendar cal = Calendar.getInstance();
		System.out.println("Calendar class: " + cal.getClass().getName());
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		System.out.println("Today: " + year + "/" + month + "/" + day);
		
		date = cal.getTime();
		String s = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss").format(date);
		System.out.println("again, Today: " + s);
		
		cal.add(Calendar.DATE, 100);
		s = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss").format(cal.getTime());
		System.out.println("100 days later: " + s);
	}
}