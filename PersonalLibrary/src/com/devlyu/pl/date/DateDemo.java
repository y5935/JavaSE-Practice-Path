/**
 * Copyright (c) 2017, Forrest Lyu. All rights reserved.
 * 
 */
package com.devlyu.pl.date;

import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

/**
 * The {@code DateDemo} class represents  
 * the usage of Date and LocalDate
 * 
 * Date: 仅用于表示时间点
 * 常用方法: 
 * new Date()
 * after(): boolean
 * before(): boolean
 * compareTo(): int (before: -1; after: 1, 推荐使用 after()/before() 方法)
 * equals(): boolean
 * toInstance(): Instance
 * toString(): String
 * 
 * LocalDate: 表示特定的日历表示法
 * 通过静态方法, 进行实例化:
 * LocalDate.now() / LocalDate.of(year, month, day);
 * getYear() / getMonthValue() / getDayOfMonth() / getDayOfWeek().getValue()
 * plusDays(): 不会改变 instance field (access method)
 * minusDays()
 * 
 * @author Forrest Lyu, devlyu@163.com
 * @version 1.0  , Aug 21, 2017
 * 
 */
public class DateDemo {
	public static void main(String[] args) {
//		Locale.setDefault(Locale.CHINA);
		
		//1. Date
		Date now = new Date();	// 不需要考虑是从 0 还是 1 开始记录
		
		//2. LocalDate
		LocalDate ld = LocalDate.now();
		LocalDate birthday = LocalDate.of(1995, 11, 5);	// 出生日期, 请注意: 没有 0 或 1 开始的问题
		System.out.println("Forrest Lyu'birthday: " + birthday.getYear() + "-" + birthday.getMonthValue() + "-"
				+ birthday.getDayOfMonth());
		
		// 2.1 instance method: plusDays(long daysToAdd);
		LocalDate age = birthday.plusDays(10000);
		System.out.println("10000 days:  " + age.getYear() + "-" + age.getMonthValue() + "-"
				+ age.getDayOfMonth());
		
		
	}
}
