package tester;

public class TestUncheckedException2 {

	public static void main(String[] args) {

		try {

			String s = "123";

			System.out.println("int value : " + Integer.parseInt(s));

			int[] data = { 1, 2, 3, 4, 5 };

			System.out.println(data[4]);

			String s2 = "abc";

			System.out.println(s2.charAt(0));

			int a = 100 / 0;

			System.out.println("result = " + a);

			System.out.println("End of try....");

		} catch (NumberFormatException e) {
			System.out.println("1");
		} catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
			System.out.println("2");
		} catch (Exception e) {
			System.out.println("3");
		}

		System.out.println("ctnd");

	}

}
