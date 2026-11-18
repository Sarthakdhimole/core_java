package com.rays.array;

public class maxNum {
	public static void main(String[] args) {
		int []a= {2,9,4,10,4};
		int max=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
				
			}
			
			
		}
		System.out.println(max);
	}
}
