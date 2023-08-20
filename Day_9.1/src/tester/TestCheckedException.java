package tester;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TestCheckedException {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {

			System.out.println("enter text file name to read data from");

			FileReader fin = new FileReader(sc.nextLine());

			fin.close();

		} catch (FileNotFoundException e) {
			System.out.println("file not found...");
		} catch (IOException e) {
			System.out.println("err in closing file");
		}

		System.out.println("ctnd");

		sc.close();

	}

}
