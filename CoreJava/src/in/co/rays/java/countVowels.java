package in.co.rays.java;

public class countVowels {
	public static void main(String[]agrs) {
		String n="sarthak";
		int count=0;
		for(int i=0;i<n.length();i++) {
			if(n.charAt(i) == 'a'||
					n.charAt(i) == 'e'||
					n.charAt(i)== 'i' ||
					n.charAt(i)== 'o' ||
					n.charAt(i) == 'u' ) {
				count++;
			}
		}
		System.out.println(count);
	}

}
