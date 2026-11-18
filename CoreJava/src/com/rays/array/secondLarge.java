package com.rays.array;

public class secondLarge {
	public static void main(String[] args) {
		int []a= {2,9,4,10,4};
		int max=0;
		int secondMax=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				secondMax=max;
				max=a[i];
				
			}  else if (a[i] > secondMax && a[i] != max) {
                secondMax = a[i];
            }
			
			
		}
		System.out.println(secondMax);
	}
}
