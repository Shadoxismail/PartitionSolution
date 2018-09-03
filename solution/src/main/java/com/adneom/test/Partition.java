package com.adneom.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.log4j.Logger;

public class Partition {

	private static Logger logger = Logger.getLogger(Partition.class);

	public static ArrayList<ArrayList<Integer>> createPartition(List<Integer> liste, Integer taille) {

		logger.info("start operation");
		checkRules(liste, taille);
		logger.info("check Rule success");
		HashMap<Integer, List<Integer>> map = new HashMap<>();
		map.put(taille, liste);
		HashMapToListConverter converter = new HashMapToListConverter();
		return converter.apply(map);

	}

	public static void checkRules(List<Integer> liste, Integer taille) {
		if (isListCheckedFailed().test(liste)) {
			logger.info("Checking liste rule fail");
			throw new IllegalArgumentException("The Given List is empty or null , please fill the list with data");
		}

		if (isTailleCheckedFailed().test(taille)) {
			logger.info("Checking taille rule fail");

			throw new IllegalArgumentException(
					"The Given taille is null or is equal to zero , please specify a taille superior to 0");
		}

	}

	public static Predicate<List<Integer>> isListCheckedFailed() {
		logger.info("Checking if liste is not empty or null");
		return p -> CollectionUtils.isEmpty(p) || Objects.isNull(p);
	}

	public static Predicate<Integer> isTailleCheckedFailed() {
		logger.info("Checking if taille is not empty or null");
		return p -> Optional.ofNullable(p).orElse(0).equals(0);
	}

}
