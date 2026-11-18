package com.rays.array;

public class missingNum {
	public static void main(String[] args) {
		int []a= {12,43,54,23,67,14};
		int []a1= {12,43,54,23,2,67,14};
		int missnum=0;
		
		// Check each element in a1 to find which one is missing in a
		for(int i=0; i<a1.length; i++) {
			boolean found = false;
			for(int j=0; j<a.length; j++) {
				if(a1[i] == a[j]) {
					found = true;
					break;
				}
			}
			// If not found in a, then it's the missing number
			if(!found) {
				missnum = a1[i];
				break;
			}
		}
		System.out.println("Missing number: " + missnum);
		}

}
