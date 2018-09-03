package com.adneom.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.Function;

import org.apache.log4j.Logger;

//******************************************************//
//*This is a converter that take a hashMap and return list , we can modifiy it depending of our goal*//
//******************************************************//

public class HashMapToListConverter
		implements Function<HashMap<Integer, List<Integer>>, ArrayList<ArrayList<Integer>>> {

	private static Logger logger = Logger.getLogger(HashMapToListConverter.class);

	@Override
	public ArrayList<ArrayList<Integer>> apply(HashMap<Integer, List<Integer>> map) {

		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		int taille = Integer.valueOf(map.keySet().toArray()[0].toString());
		List<Integer> liste = map.get(taille);
		int i = 0, j = 0;

		while (i < liste.size()) {
			list.clear();
			for (j = 0; j < taille; j++) {
				if ((j + i) < liste.size()) {
					list.add(liste.get(i + j));
				}
			}
			;
			result.add((ArrayList<Integer>) list.clone());
			i += taille;
		}
		logger.info("Operation Success");

		return result;
	}

}
