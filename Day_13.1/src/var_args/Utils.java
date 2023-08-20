package var_args;

public class Utils {

	// Add a static method that can display names of all animals ranging from 0 to n
	public static void displayNames(Animal... animals) {
		for (Animal a : animals) {
			System.out.println(a.getName());
		}
	}
}
