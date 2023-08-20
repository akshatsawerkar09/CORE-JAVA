package sets;

import java.util.HashSet;

public class IntegerSet {

	public static void main(String[] args) {

		int[] data = { 12, 34, 1, 45, 12, -90, 48, 111, 12, 34 };

		// create an empty hashset to store Integer type of ref's
		HashSet<Integer> intSet = new HashSet<>();

		for (int i : data) {
			System.out.println("Added " + intSet.add(i));
		}

		System.out.println("Hs " + intSet);

		System.out.println("Size " + intSet.size());

		System.out.println("HS contains 45 " + intSet.contains(45));

		System.out.println("HS remove 45 " + intSet.remove(45));

		System.out.println("HS contains 45 " + intSet.contains(45));

		System.out.println("HS " + intSet);

	}

}
