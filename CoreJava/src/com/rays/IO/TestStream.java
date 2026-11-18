package com.rays.IO;

import java.util.ArrayList;
import java.util.List;

public class TestStream {
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i=1; i<=10; i++) {
			list.add(i);
			list.forEach(System.out::println);
		}
	}

}
