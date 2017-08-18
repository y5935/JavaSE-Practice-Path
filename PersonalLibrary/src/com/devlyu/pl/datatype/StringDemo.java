/**
 * Copyright (c) 2017, Forrest Lyu. All rights reserved.
 * 
 */
package com.devlyu.pl.datatype;

/**
 * The {@code StringDemo} class represents  
 * 
 * @author Forrest Lyu, devlyu@163.com
 * @version 1.0  , Aug 18, 2017
 * 
 */
public class StringDemo {
	public static void main(String[] args) {
		String str = "\ud835\udd46";
		int index = str.offsetByCodePoints(0, 0);		// 第二个值代码位移几位
		int cp = str.codePointAt(index);
		System.out.println(cp);
		int[] cps = {cp};
		String newStr = new String(cps, 0, cps.length);
		System.out.println(newStr);
	}
}
