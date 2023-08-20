package test_date;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

import static java.time.LocalDate.*;

public class TestLocalDate {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			System.out.println("Enter birth date (yr-mon-day)");

			LocalDate dob = parse(sc.next()); // string -> date

			LocalDate curntDate = now();

			int ageInYrs = Period.between(dob, curntDate).getYears();

			System.out.println("Age in yrs " + ageInYrs);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
