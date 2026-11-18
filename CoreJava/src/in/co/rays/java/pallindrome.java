package in.co.rays.java;

public class pallindrome {
	public static void main(String[] args) {
		int n=110;
		int r=0;
		int x=0;
		int temp=n;
		while(n>0) {
			r=n%10;
			x=(x*10)+r;
			n=n/10;
		}
		if(temp==x) {
			System.out.println("no. is pallin");		
	}else {
		System.out.println("no. is not");
	}

}
}