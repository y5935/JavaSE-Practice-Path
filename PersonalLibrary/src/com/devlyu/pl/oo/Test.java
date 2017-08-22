/**
 * Copyright (c) 2017, Forrest Lyu. All rights reserved.
 * 
 */
package com.devlyu.pl.oo;

import java.time.LocalDate;

/**
 * The {@code Test} class represents  
 * 
 * @author Forrest Lyu, devlyu@163.com
 * @version 1.0  , Aug 22, 2017
 * 
 */
public class Test {
	public static void main(String[] args) {
		Manager manager = new Manager("Peter", 2000, LocalDate.of(2017, 2, 10), 100);
		System.out.println(manager.getSalary());
		
		Employee employee = new Employee("Herry", 2300, LocalDate.of(2017, 6, 26));
		Employee employee2 = new Employee("Herry", 2300, LocalDate.of(2017, 6, 26));
		Employee employee3 = new Employee("Herry", 2400, LocalDate.of(2017, 6, 26));
		Employee employee4 = new Employee();
		
		System.out.println(employee.equals(employee2));
		System.out.println(employee.equals(employee3));
		System.out.println(employee.equals(employee4));
		
		
		
		
	}
}
