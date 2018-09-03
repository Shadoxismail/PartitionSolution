package com.adneom.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Welcome to our demo");
		List<Integer> myList = Arrays.asList(1, 3, 5, 7, 9);
		ArrayList<ArrayList<Integer>> result = Partition.createPartition(myList, 3);
		System.out.println(result);
	}
}
