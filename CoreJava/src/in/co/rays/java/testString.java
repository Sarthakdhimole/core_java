package in.co.rays.java;

public class testString {
	void main() {
		String n = "Sarthak the Great Coder";
		System.out.println("String length=" + n.length());
		System.out.println("7th character=" + n.charAt(6));
		System.out.println("Index of alok= " + n.indexOf("Great"));
		System.out.println("1st pos of o=" + n.indexOf("o"));
		System.out.println("Last pos of a=" + n.lastIndexOf("a"));
		System.out.println("a is replaced by b=" + n.replace("a", "b"));
		System.out.println("lower naame=" + n.toLowerCase());
		System.out.println("Upper case=" + n.toUpperCase());
		System.out.println("Start with Sarthak" + n.startsWith("Sarthak"));
		System.out.println("passion=" + n.substring(18));
	}
}

