package in.co.rays.java;

public class countallChar {
	public static void main(String[]args) {
		String n="Sarthak";
		int count=0;
		char s='s';
		char a='a';
		char r='r';b 
		char t='t';
		char h='h';
		char k='k';
		for (int i=0;i<n.length();i++) {
			if(n.charAt(i)==s) {
				count++;
				System.out.println("s count is="+count);
			}
			else if(n.charAt(i)==a){
				count++;
				System.out.println("a count is="+count);
			}
			else if(n.charAt(i)==r){
				count++;
				System.out.println("r count is="+count);
			}
		}
	}

}
