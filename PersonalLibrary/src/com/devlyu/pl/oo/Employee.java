/**
 * Copyright (c) 2017, Forrest Lyu. All rights reserved.
 * 
 */
package com.devlyu.pl.oo;

import java.time.LocalDate;
import java.util.Objects;

/**
 * The {@code Employee} class represents  
 * 
 * @author Forrest Lyu, devlyu@163.com
 * @version 1.0  , Aug 22, 2017
 * 
 */
public class Employee {
	private String name;
	private double salary;
	private LocalDate hireDate;
	
	/*
	 * if the constructor 'Employee()' is not defined, it would occure problem: 
	 * Implicit super constructor Employee() is undefined for default constructor. 
	 * Must define an explicit constructor
	 */
	public Employee() {
		init("", 0.0, null);
	}
	
	
	public Employee(String name, double salary, LocalDate hireDate) {
		init(name, salary, hireDate);
	}
	
	private void init(String name, double salary, LocalDate hireDate) {
		this.name = name;
		this.salary = salary;
		this.hireDate = hireDate;
	}


	/*
	 * setter / getter
	 */
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public LocalDate getHireDate() {
		return hireDate;
	}


	@Override
	public boolean equals(Object obj) {
		// 1. a quick test to see if the objects are identical
		if (this == obj)	return true;
		// 2. must return false if the explicit parameter is null
		if (obj == null)	return false;
		
		// 3. if the type of the class don't match, they can't be equal.
		if (this.getClass() != obj.getClass()) return false;
		// now, we know otherObject is a non-null Employee
		Employee other = (Employee) obj;
		// 4. test whether the fields have identical values
		
		/*
		 * 虽然此处可以直接使用, other.name 这样直接获取 name 值, 但是我依然不推荐使用.
		 */
		if (Objects.equals(this.name, other.name)
				&& (Math.abs(this.salary-other.salary) < 1e-4)
				&& Objects.equals(this.hireDate, other.hireDate)) {
			return true;
		}
		
		return false;
	}


	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}


	@Override
	public String toString() {
		return super.toString();
	}


	@Override
	public int hashCode() {
		// 继承自 Object 的 hashCode() 方法是通过对象地址返回 hash value
		// String 中, 可以保证 equals() 相等, 则 hash 相等;
		// 但是在, StringBuilder 中, 就不行了, 必须要重写;
//		return super.hashCode();
		return Objects.hash(this.name, this.salary, this.hireDate);
		
	}
	
	
}
