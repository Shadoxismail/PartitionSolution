package com.adneom.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit Test for different case that we can have when we use method create
 * Partion.
 */
public class AppTest {

	@Test(expected = IllegalArgumentException.class)
	public void partitionTestFailTailleEqualsZero() {
		/*** Given **/
		List<Integer> initList = Arrays.asList(0, 1, 2, 3, 4);
		/*** When **/
		Partition.createPartition(initList, 0);
		Assert.fail("The Given taille is null or is equal to zero , please specify a taille superior to 0");
	}

	@Test(expected = IllegalArgumentException.class)
	public void partitionTestFailTailleNull() {
		/*** Given **/
		List<Integer> initList = Arrays.asList(0, 1, 2, 3, 4);
		/*** When **/
		Partition.createPartition(initList, null);
		Assert.fail("The Given taille is null or is equal to zero , please specify a taille superior to 0");
	}

	@Test(expected = IllegalArgumentException.class)
	public void partitionTestFailListNull() {
		/*** Given **/
		List<Integer> initList = Arrays.asList();
		/*** When **/
		Partition.createPartition(initList, 2);
		Assert.fail("The Given List is empty or null , please fill the list with data");
	}

	@Test(expected = IllegalArgumentException.class)
	public void partitionTestFailListEmpty() {
		/*** Given **/
		List<Integer> initList = Arrays.asList();
		/*** When **/
		Partition.createPartition(initList, 2);
		Assert.fail("The Given List is empty or null , please fill the list with data");
	}

	@Test
	public void partitionTestTailleList1() {
		/*** Given **/
		List<List<Integer>> resultList = Arrays.asList(Arrays.asList(1), Arrays.asList(2), Arrays.asList(3),
				Arrays.asList(4), Arrays.asList(5));
		List<Integer> initList = Arrays.asList(1, 2, 3, 4, 5);
		/*** When **/
		final List<ArrayList<Integer>> finalList = Partition.createPartition(initList, 1);
		/*** Then **/
		Assert.assertEquals(resultList, finalList);
	}

	@Test
	public void partitionTestTailleList2() {
		/*** Given **/
		List<List<Integer>> resultList = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4), Arrays.asList(5));
		List<Integer> initList = Arrays.asList(1, 2, 3, 4, 5);
		/*** When **/
		final List<ArrayList<Integer>> finalList = Partition.createPartition(initList, 2);
		/*** Then **/
		Assert.assertEquals(resultList, finalList);
	}

	@Test
	public void partitionTestTailleList3() {
		/*** Given **/
		List<List<Integer>> resultList = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5));
		List<Integer> initList = Arrays.asList(1, 2, 3, 4, 5);
		/*** When **/
		final List<ArrayList<Integer>> finalList = Partition.createPartition(initList, 3);
		/*** Tehn **/
		Assert.assertEquals(resultList, finalList);
	}

}
