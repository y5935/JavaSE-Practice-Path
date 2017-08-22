/**
 * Copyright (c) 2017, Forrest Lyu. All rights reserved.
 * 
 */
package com.devlyu.pl.generic;

import java.time.LocalDate;
import java.util.ArrayList;

import com.devlyu.pl.oo.Employee;

/**
 * The {@code ArrayListDemo} class represents  
 * the usage of java.util.ArrayList
 * @author Forrest Lyu, devlyu@163.com
 * @version 1.0  , Aug 22, 2017
 * 
 */
public class ArrayListDemo {
	
	public static void main(String[] args) {
		int initalCapacity = 100;	// 我已经提前知道, ArrayList 大约需要存储 100 个值
		ArrayList<Employee> list = new ArrayList<>(initalCapacity);
		
		list.add(new Employee("Peter", 2100, LocalDate.of(1991, 2, 1)));
		list.add(new Employee("Peter", 2100, LocalDate.of(1991, 2, 1)));
		list.add(new Employee("Peter", 2100, LocalDate.of(1991, 2, 1)));
		list.add(new Employee("Peter", 2100, LocalDate.of(1991, 2, 1)));
		list.add(new Employee("Peter", 2100, LocalDate.of(1991, 2, 1)));
		list.add(new Employee("Peter", 2100, LocalDate.of(1991, 2, 1)));
		list.add(new Employee("Peter", 2100, LocalDate.of(1991, 2, 1)));
		list.add(new Employee("Peter", 2100, LocalDate.of(1991, 2, 1)));
		
		System.out.println("ArrayList.size: " + list.size()); 
	}
	
	
}
