package tester;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TestCheckedException2 {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter text file name to read data from");

		FileReader fin = new FileReader(sc.nextLine());

		fin.close();

		System.out.println("ctnd");

		sc.close();

	}

}
