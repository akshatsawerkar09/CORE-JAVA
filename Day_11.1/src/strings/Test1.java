package strings;

public class Test1 {

	public static void main(String[] args) {

		String s = "Hello Strings, ! String handling is easy in java....";

		System.out.println(s.charAt(0) + " " + s.charAt(s.length() - 1));

		System.out.println(s.contains("handling"));

		System.out.println(s.subSequence(0, 5)); // 0 to end -1

		System.out.println(s.indexOf("String") + " " + s.lastIndexOf("String"));

		System.out.println(s.matches(".*easy.*"));

		System.out.println("abc".compareTo("xyz"));

	}

}