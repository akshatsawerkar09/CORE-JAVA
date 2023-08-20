package p1;

public class TestPrimitiveTypes {

	public static void main(String[] args) {

		byte b1 = 10;
		byte b2 = 12;
		// byte b3 = (b1+b2); any promotion on byte and short promoted to integer
		byte b3 = (byte) (b1 + b2);
		System.out.println(b3);
	}

}
