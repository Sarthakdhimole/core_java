package in.co.rays.java;

public class countOneChar {

	public static void main(String[] args) {
		String n = "sarthak";
		int count = 0;
		char c = 'a';
		for (int i = 0; i < n.length(); i++) {

			if (n.charAt(i) == c) {
				count++;

			}

		}
		System.out.println(" a is count" + count);

	}

}
