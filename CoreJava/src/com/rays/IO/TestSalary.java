package com.rays.IO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestSalary {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(30000);
		list.add(40000);
		list.add(50000);
		list.add(90000);
		list.add(1000);
		list.add(20000);
		list.add(30000);
		list.add(40000);
		
		list.stream().distinct().forEach(System.out::println);
		System.out.println("==================================");
		
		list.stream().sorted().forEach(System.out::println);
		System.out.println("==================================");
		
		list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
		System.out.println("==================================");
		
		list.stream().max(Integer::compare).ifPresent(System.out::println);
		
		
	}

}
