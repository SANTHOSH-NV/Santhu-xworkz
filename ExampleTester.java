package com.xworkz.xworkzapp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ExampleTester {

	public static void main(String[] args) {

		String words = "Bangalore is also called as it hub " + "Bangalore recently awarded best city to live "
				+ "Bangalore is also called as green city " + "Bangalore is capital city of karnataka";

		String[] v = words.split(" ");
		System.out.println(v.length);
//		System.out.println(words);

		List<String> list = new ArrayList<String>();
		list.add(words);
		System.out.println(list);

		Set<String> set = new LinkedHashSet<String>();
		for (String s : v) {
			set.add(s);
		}

		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");

		}

//		TreeSet<String> set2 = new TreeSet<String>();
//		set2.add(words);
//		System.out.println("\n" + set2);

	}

}
