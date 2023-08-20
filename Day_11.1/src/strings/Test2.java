package strings;

public class Test2 {

	public static void main(String[] args) {

		StringBuilder sb1 = new StringBuilder("hello");

		System.out.println("Contents : " + sb1);

		System.out.println("length = " + sb1.length() + " capacity " + sb1.capacity());

		StringBuilder sb2 = sb1.append("hi");

		System.out.println(sb1);

		System.out.println(sb2);

		System.out.println(sb1 == sb2); // true

		System.out.println(sb1.equals(sb2)); // true

		StringBuilder sb3 = new StringBuilder("hello");

		System.out.println(sb1 == sb3); // false

		System.out.println(sb1.equals(sb3)); // false

		System.out.println(sb1.reverse());

		sb1.append(true).append(123).append(34.56f);

		System.out.println(sb1);

		sb1.delete(0, sb1.length());

		System.out.println("length = " + sb1.length() + " capacity " + sb1.capacity());

	}

}
