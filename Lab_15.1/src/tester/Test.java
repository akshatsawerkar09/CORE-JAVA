package tester;

import static java.time.LocalDate.parse;
import static utils.CollectionUtils.checkIfExists;
import static utils.EmpValidationConstraints.parseDate;
import static utils.EmpValidationConstraints.validatEmpDetails;
import static utils.EmpValidationConstraints.validateAdharCardLocation;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import com.app.core.Emp;

public class Test {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			ArrayList<Emp> emps = new ArrayList<>();

			boolean exit = false;

			while (!exit) {

				System.out.println(
						"Options\n1.Add Emp\n2.Show All Emp's Details\n3.Fetch Emp details\n4.Assign adhar card details to emp\n5.Change Adhar card no\n6.Display name of all emps adhar card is created in specific month n year\n10.Exit");

				switch (sc.nextInt()) {
				case 1:
					System.out.println("Enter emp details : id, name, sal, joinDate(yr-mon-day), dept");

					Emp e = validatEmpDetails(emps, sc.nextInt(), sc.next(), sc.nextDouble(), sc.next(), sc.next());

					emps.add(e);

					System.out.println("Emp registered successfully!!!!");

					break;
				case 2:// here null check is gone because for each goes from first to last element but
						// in case of AL it goes to the size
					for (Emp e1 : emps) {
						System.out.println(e1);
					}
					break;
				case 3:
					// fetch emp details
					System.out.println("Enter emp id & name");
					System.out.println("Emp Details " + checkIfExists(emps, sc.nextInt(), sc.next()));

					break;
				case 4:
					System.out.println("Enter emp id & name");
					Emp emp = checkIfExists(emps, sc.nextInt(), sc.next());
					// valid
					System.out.println("Enter Adhar card details : cardNo, date, location");
					emp.linkAdharCard(sc.next(), parseDate(sc.next()), validateAdharCardLocation(sc.next()));
					System.out.println("adhar card linked!!!!!");
					break;
				case 5:
					System.out.println("Enter emp id & name");
					emp = checkIfExists(emps, sc.nextInt(), sc.next());
					System.out.println("Enter new card no");
					emp.setEmpAdharCardNumber(sc.next());
					System.out.println("card no changed!!!!");
					break;
				case 6:
					/*
					 * Display name of all emps adhar card is created in specific month n year
					 * LocalDate : API --getMonthValue() ,getYear())
					 */
					LocalDate adharDate = LocalDate.parse(sc.next());

					int check = 0;

					for (Emp e2 : emps) {
						if (e2 != null) {
							if (e2.getCreationDate().getMonthValue() == adharDate.getMonthValue()
									&& e2.getCreationDate().getYear() == adharDate.getYear()) {
								System.out.println(e2.getName());
								check++;
							}
						}
					}

					if (check == 0) {
						System.out.println("No data found!!!!");
					}

					break;
				case 10:
					exit = true;
					break;

				default:
					break;
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}