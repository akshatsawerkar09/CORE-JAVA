package com.app.food;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		int dosa = 50;
		int samosa = 20;
		int noodles = 100;
		int rice = 150;
		int total = 0;
		int quantity = 0;

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println(
					"Enter from Menu\n1.Dosa = 50\n2.Samosa = 20\n3.Noodles = 100\n4.Rice = 150\n10.Generate Bill");

			switch (sc.nextInt()) {
			case 1:
				System.out.println("Enter quantity");
				quantity = sc.nextInt();
				total = total + (dosa * quantity);
				break;
			case 2:
				System.out.println("Enter quantity");
				quantity = sc.nextInt();
				total = total + (samosa * quantity);
				break;
			case 3:
				System.out.println("Enter quantity");
				quantity = sc.nextInt();
				total = total + (noodles * quantity);
				break;
			case 4:
				System.out.println("Enter quantity");
				quantity = sc.nextInt();
				total = total + (rice * quantity);
				break;
			case 10:
				System.out.println("Generated Bill : " + total);
				sc.close();
				System.exit(0);
				break;
			default:
				break;
			}

		}

	}

}
