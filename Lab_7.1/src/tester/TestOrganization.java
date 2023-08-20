package tester;

import java.util.Scanner;

import com.app.org.Emp;
import com.app.org.Mgr;
import com.app.org.Worker;

public class TestOrganization {

	public static void main(String[] args) {

		/*
		 * Write TestOrganization in "tester" package. Create suitable array to store
		 * organization details. Provide following options
		 * 
		 * 1. Hire Manager 2. Hire Worker 3. Display information of all employees
		 * including net salary using single for-each loop.
		 * 
		 * 10 Exit
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of employees to hire");

		Emp[] emps = new Emp[sc.nextInt()];

		int index = 0;

		while (true) {

			System.out.println("1.Hire Manager\n2.Hire Worker\n3.Display information of all employess\n10.Exit");

			switch (sc.nextInt()) {
			case 1:
				if (index < emps.length) {
					System.out.println("Enter id, name, deptId, basic, perfBonus");
					emps[index] = new Mgr(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble(), sc.nextDouble());
					index++;
				} else {
					System.out.println("Hiring Full!!!!");
				}
				break;
			case 2:
				if (index < emps.length) {
					System.out.println("Enter id, name, deptId, basic, hoursWorked, hourlyRate");
					emps[index] = new Worker(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble(), sc.nextDouble(),
							sc.nextDouble());
					index++;
				} else {
					System.out.println("Hiring Full!!!!");
				}
				break;
			case 3:
				for (Emp e : emps) {
					if (e != null) {
						System.out.println(e);
						System.out.println("Salary : " + e.getBasic());
					}
				}
				break;
			case 10:
				System.exit(0);
				System.out.println("You have exited application!!!!");
				sc.close();
				break;

			default:
				break;
			}

		}

	}

}
