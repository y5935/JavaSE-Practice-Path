/**
 * Copyright (c) 2017, Forrest Lyu. All rights reserved.
 * 
 */
package com.devlyu.pl.app.lottery;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * The {@code Lottery} class 
 * 
 * 演示彩票项目中奖的概率: n*(n-1)*....*(n-k+1) / (1*2*...*k)
 * 
 * @author Forrest Lyu, devlyu@163.com
 * @version 1.0  , Aug 18, 2017
 * 
 */
public class Lottery {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many numbers do you need to draw?");
		int k = sc.nextInt();
		
		System.out.println("What is the highest number you can draw");
		int n = sc.nextInt();
		

		int lotteryOdds = 1;
		for(int i=1; i<=k; ++i) {
			lotteryOdds *= (n -i +1) / i;
		}
		
		System.out.println("Your odds are 1 in " + lotteryOdds + ". Good Luck!");
	}
}
