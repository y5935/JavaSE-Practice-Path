/**
 * Copyright (c) 2017, Forrest Lyu. All rights reserved.
 * 
 */
package com.devlyu.pl.collections;

import java.util.Arrays;

/**
 * The {@code ArrayDemo} class represents  
 * Array & Arrays
 * @author Forrest Lyu, devlyu@163.com
 * @version 1.0  , Aug 17, 2017
 * 
 */
public class ArrayDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 1. define
		int[] a = {};	// 1
		int[] a2 = new int[] {};	// 2
		int[] a3 = new int[4];	// 3
		int[] a4;	// 4
		a4 = new int[4];
		
		// 2. 多维数组
		// 核心思想: 通过降维思想, 可以看作是 一维数组(必须要定义一维数组的长度)
		int[][] m = {};	// 1
		int[][] m2 = new int[][] {};	// 2
		int[][] m3 = new int[3][4];	// 3
		int[][] m4 = new int[3][];	// 4
		m4[0] = new int[10];
		int[][] m5;	// 5
		m5 = new int[5][];
		
		// Arrays 工具类分析:
		
		/*
		 * Arrays: 
		 * This class contains various methods for manipulating arrays (such as
		 * sorting and searching). This class also contains a static factory
		 * that allows arrays to be viewed as lists.
		 * 
		 * Frequently Used Method: (non-static)
		 * 1. sort()				进行升序排列
		 * 2. binarySearch()		先进行 sort(), 再进行查询; 若有多个值, 没有保证返回哪个值
		 * 						return index of param
		 * 
		 * 3. copyOf()			jdk 1.6, 用于深复制;
		 * 4. copyOfRange()		
		 * 5. fill()				填充值操作
		 * 7. equals()			若是 val val2 都为 null, 则 return true;
		 * 
		 * 备记: Arrays.equals() 方法, 可以作为多态的演示实例 
		 */
		
		// 2000 人参考只有 250 份名额的车牌选号活动
		int[] carNums = new int[2000];	// define a array that the capacity is 2000
		Arrays.fill(carNums, -1);	// 所有为 -1 的元素, 代表没有分配到车牌号
		
		// 号段是: 2000 ~ 2249
		int[] selectedIndex = new int[250];
		int[] selectedNum = new int[250];
		Arrays.fill(selectedIndex, -1);
		Arrays.fill(selectedNum, -1);
		
		// 通过随机函数, 进行号牌的选择
		
		// 先 sort(), 再 binarySearch() 查找
	}

}
