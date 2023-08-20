package tester;

import java.util.Scanner;

import com.app.fruits.Apple;
import com.app.fruits.Cherry;
import com.app.fruits.Fruit;
import com.app.fruits.Orange;
import static utils.FruitUtils.addFruit;

public class Tester {

	/*
	 * 2.3. Write a Tester to create basket of fruits. : package "tester" Prompt for
	 * size of a fruit basket n create suitable data structure. (populate basket
	 * based upon user's choice) Menu 1. Add Apple Boundary checking
	 * sop("Enter name "); eg : addFruit(new Apple(sc.next()),basket,index);
	 * index++; 2. Add Orange : boundary chk 3. Add Cherry NOTE : Accept name of the
	 * fruit form user. In above options : you should call addFruit method of
	 * FruitUtils class & then chosen fruit should get added in the basket. 4.
	 * Display taste of all fruits in the basket. : for-each eg : for (Fruit f :
	 * basket) f.taste(); 10. Exit : terminate the application.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter basket size");

		Fruit[] basket = new Fruit[sc.nextInt()];

		int counter = 0;

		while (true) {

			System.out.println("1.Add Apple\n2.Add Orange\n3.Add Cherry\n4.Display Taste\n10.Exit");

			switch (sc.nextInt()) {
			case 1:
				if (counter < basket.length) {
					System.out.println("Enter apple name");
					addFruit(new Apple(sc.next()), basket, counter);
					counter++;
				} else {
					System.out.println("Basket Full!!!!");
				}
				break;
			case 2:
				if (counter < basket.length) {
					System.out.println("Enter orange name");
					addFruit(new Orange(sc.next()), basket, counter);
					counter++;
				} else {
					System.out.println("Basket Full!!!!");
				}
				break;
			case 3:
				if (counter < basket.length) {
					System.out.println("Enter cherry name");
					addFruit(new Cherry(sc.next()), basket, counter);
					counter++;
				} else {
					System.out.println("Basket Full!!!!");
				}
				break;
			case 4:
				for (Fruit f : basket) {
					if (f != null) {
						f.taste();
					}
				}
				break;
			case 10:
				System.exit(0);
				break;

			default:
				break;
			}

		}

	}

}