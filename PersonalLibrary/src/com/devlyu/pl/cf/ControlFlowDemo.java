/**
 * Copyright (c) 2017, Forrest Lyu. All rights reserved.
 * 
 */
package com.devlyu.pl.cf;

/**
 * The {@code ControlFlowDemo} class represents  
 * 
 * @author Forrest Lyu, devlyu@163.com
 * @version 1.0  , Aug 18, 2017
 * 
 */
public class ControlFlowDemo {
	public static void main(String[] args) {
		int a = 21;
		{
//			int a = 21; error: duplicate local variable a
		}
		for(int i=0; i<100; ++i) {
//			int a = 21; error
		}
	}
}
