package tester;

import static utils.EmpValidationConstraints.*;

import java.util.Date;
import java.util.Scanner;

import com.app.core.Emp;

public class Test {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			Emp[] emps = new Emp[100];

			int counter = 0;

			boolean exit = false;

			while (!exit) {

				try {

					System.out.println("Options\n1.Add Emp\n2.Show\n3.\n10.Exit");

					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter emp details : id, name, sal, joinDate(day-mon-yr), dept");

						Emp e = validatEmpDetails(emps, sc.nextInt(), sc.next(), sc.nextDouble(), sc.next(), sc.next());

						System.out.println("Emp registered successfully!!!!");

						System.out.println("Enter adhar card details : card_no, date, location");

						e.linkAdharCard(sc.next(), sdf.parse(sc.next()), validateAdharCardLocation(sc.next()));

						System.out.println("Adhar card linked successfully!!!!");

						emps[counter++] = e;

						break;
					case 2:
						for (Emp e1 : emps) {
							if (e1 != null) {
								System.out.println(e1);
							}
						}
						break;
					case 3:
						System.out.println("Display emp id's whose adhar card date > specific date");
						System.out.println("Enter the date (dd-MM-yyyy)");
						Date d1 = parseDate(sc.next());
						for (Emp e1 : emps) {
							if (e1 != null) {
								if (e1.getCreationDate().after(d1)) {
									System.out.println(e1.getId());
								}
							}
						}
						break;
					case 10:
						exit = true;
						break;

					default:
						break;
					}

				} catch (Exception e) {
					// TODO: handle exception
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
