package in.co.rays.java;

public class reverssedigit {
	public static void main(String[] args) {
		int n=1453;
		int r=0;
		int x=0;
		while(n>0) {
			r=n%10;
			x=(x*10)+r;
			n=n/10;
		}
		System.out.println(x);	}
	

}
