package com.xworkz.xworkzapp.tester;

import java.util.LinkedList;

import com.xworkz.xworkzapp.dao.GarmentsDAOImpl;
import com.xworkz.xworkzapp.dto.GarmentsDTO;

public class GarmentsTester {

	public static void main(String[] args) {

		GarmentsDTO dto = new GarmentsDTO("Shubha", "yelechenahalli", 234534, 200);
		GarmentsDTO dto1 = new GarmentsDTO("Manjula", "peenya", 236734, 100);
		GarmentsDTO dto2 = new GarmentsDTO("Kanika", "jigini", 222534, 150);
		GarmentsDTO dto3 = new GarmentsDTO("Nitya", "KG Road", 288834, 200);

		GarmentsDAOImpl impl = new GarmentsDAOImpl();

		impl.pushDetails(dto);
		impl.pushDetails(dto1);
		impl.pushDetails(dto2);
		impl.pushDetails(dto3);

		impl.removeDetails();

		impl.display();

//		LinkedList<String> list = new LinkedList<String>();
//
//		list.add("India");
//		list.add("USA");
//		list.add("England");
//		list.add("Pakistan");
//		list.add("Japan");
//		System.out.println(list);
//
//		String peek = list.peekLast();
//		System.out.println(peek);
//		System.out.println(list);
//
//		String poll = list.pollFirst();
//		System.out.println(poll);
//		System.out.println(list);
//
//		list.set(2, "China");
//		System.out.println(list);
//
//		String string = list.get(2);
//		System.out.println(string);
//		System.out.println(list);
//
//		list.add(3, "Pakistan");
//		System.out.println(list);

	}

}
