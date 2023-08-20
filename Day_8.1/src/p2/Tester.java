package p2;

public class Tester {

	public static void main(String[] args) {

		Computable[] computables = { new Adder(), new Divider(), new Multiplier() };

		for (Computable c : computables) {
			System.out.println(c.compute(100, 20));
		}

	}

}
