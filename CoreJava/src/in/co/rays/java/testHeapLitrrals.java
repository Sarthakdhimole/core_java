package in.co.rays.java;

public class testHeapLitrrals {
	public static void main(String[] args) {
		String s1 = "Hello java";
//		String s2="hello java";
		String s2 = new String("Hello java");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));

	}

}
