/**
 * Copyright (c) 2017, Forrest Lyu. All rights reserved.
 * 
 */
package com.devlyu.pl.oo;

/**
 * The {@code EnumDemo} class represents  
 * 
 * @author Forrest Lyu, devlyu@163.com
 * @version 1.0  , Aug 22, 2017
 * 
 */
public class EnumDemo {
	public static void main(String[] args) {
		Session spring = Session.SPRING;
		Session spring2 = Session.SPRING;
		System.out.println(spring == spring2);	// 比较 enum, 直接使用 ==, 即可;
	}
	
}


enum Session {
	SPRING, SUMMER, FALL, WINTER
}