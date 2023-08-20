package tester;

import java.util.Date;
import java.util.Scanner;

import com.app.customer.Customer;
import com.app.customer.CustomerType;

import static utils.CustomerValidations.*;

public class CustomerRegistration {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in);) {

			System.out.println("Enter number of customers");

			Customer[] customers = new Customer[sc.nextInt()];

			int index = 0;

			while (true) {

				System.out.println("1.Register new customer\n2.Display all customers\n3.Exit");

				switch (sc.nextInt()) {
				case 1:
					if (index < customers.length) {

						System.out.println("Enter email");

						String email = checkEmail(sc.next());

						email = checkDuplicateEmail(customers, email);

						System.out.println("Enter password");

						String password = checkPassword(sc.next());

						System.out.println("Enter registration amount");

						double registrationAmount = checkRegAmount(sc.nextDouble());

						System.out.println("Enter name");

						String name = sc.next();

						System.out.println("Enter city");

						String city = sc.next();

						System.out.println("Enter Dob");

						Date dob = checkDob(sdf.parse(sc.next()));

						System.out.println("Enter customer type");

						CustomerType customerType = CustomerType.valueOf(sc.next().toUpperCase());

						customers[index] = new Customer(email, password, name, registrationAmount, city, dob,
								customerType);

						System.out.println("Customer registered successfully!!!");

						index++;

					} else {
						System.out.println("Customers full!!!!");
					}
					break;
				case 2:
					int count = 0;
					System.out.println("Enter city name");
					String cityName = sc.next();
					for (Customer c : customers) {
						if (c != null) {
							if (c.getCity().equals(cityName)) {
								System.out.println(c);
								count++;
							}
						}
					}
					if (count == 0) {
						System.out.println("No Customer from speciefied city");
					}
					break;
				case 3:
					sc.close();
					System.exit(0);
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
