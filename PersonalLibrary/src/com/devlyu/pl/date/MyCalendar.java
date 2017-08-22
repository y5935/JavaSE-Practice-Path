/**
 * Copyright (c) 2017, Forrest Lyu. All rights reserved.
 * 
 */
package com.devlyu.pl.date;

import java.time.LocalDate;

/**
 * The {@code MyCalendar} class represents Calendar.
 * 
 * @author Forrest Lyu, devlyu@163.com
 * @version 1.0  , Aug 21, 2017
 * 
 */
public class MyCalendar {
	/*
	 * 如何计算某个月的天数, 以及给定一个日期, 判断是周几;
	 */
	public static void main(String[] args) {
		// 1. get the current month and dayOfMonth
		LocalDate date  = LocalDate.now();
		int currentMonth = date.getMonthValue();	//1=January....
		int currentDay = date.getDayOfMonth();	//1=startDayOfMonth
		
		// 2. set date to start, and get dayOfWeek
		date = date.minusDays(currentDay-1);	
		int dayOfWeek = date.getDayOfWeek().getValue();	//1=Monday; 2= Tuesday ...
		
		// 3. print the header, and indent
		System.out.println("Mon Tue Wen Thu Fri Sat Sun");
		for(int i=1; i<dayOfWeek; ++i) {
			System.out.print("    ");
		}
		
		// 4. iterate
		while (date.getMonthValue() == currentMonth) {
			System.out.printf("%3d", date.getDayOfMonth());
			if (date.getDayOfMonth() == currentDay) {
				System.out.print("*");
			} else {
				System.out.print(" ");
			}
			date = date.plusDays(1);
			
			if (date.getDayOfWeek().getValue() == 1) {	// 1=Monday
				System.out.println();
			}
		}
		
	}
}
