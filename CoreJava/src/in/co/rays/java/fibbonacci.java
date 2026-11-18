package in.co.rays.java;

public class fibbonacci {
	public static void main(String[] args) {
	
	int n=12;
	int a=0;
	int b=1;
	
	for(int i=0;i<=n ;i++) {
		int c=a+b;
		System.out.print(a+" ");
		a=b;
		b=c;
		
	}
	
	}
}
