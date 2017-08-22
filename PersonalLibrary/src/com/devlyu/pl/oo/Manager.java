/**
 * Copyright (c) 2017, Forrest Lyu. All rights reserved.
 * 
 */
package com.devlyu.pl.oo;

import java.time.LocalDate;
import java.util.Objects;

/**
 * The {@code Manager} class represents  
 * 
 * @author Forrest Lyu, devlyu@163.com
 * @version 1.0  , Aug 22, 2017
 * 
 */
public class Manager extends Employee{
	private double bonus;
	
	public Manager() {
		super();
	}
	
	public Manager(String name, double salary, LocalDate hireDate, double bonus) {
		super(name, salary, hireDate);
		
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public double getSalary() {
//		return getSalary() + bonus;  这里是典型的错误
		return super.getSalary() + bonus;
	}

	@Override
	public boolean equals(Object obj) {
		// 1. a quick test to see if the objects are identical
		if (this == obj) return true;
		
		// 2. must return false if the explicit param is null
		if (obj == null) return false;
		
		// 3. if the type of the classes, they can't be equal
		if (this.getClass() != obj.getClass()) return false;
		
		// 3.1 now, we know the obj is a non-null Employee
		Employee other = (Employee) obj;
		// 4. test whether the fields have identical value
		if (Objects.equals(this.getName(), other.getName())
				&& (Math.abs(this.getSalary()-other.getSalary()) < 1e-4)	// Math.abs() 细节决定成败
				&& Objects.equals(this.getHireDate(), other.getHireDate())) {
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
//		return super.hashCode();
		return Objects.hash(this.getName(), this.getSalary(), this.getHireDate());
	}
	
	
}
