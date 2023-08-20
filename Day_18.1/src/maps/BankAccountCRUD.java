package maps;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;

import com.app.core.AcType;
import com.app.core.BankAccount;

import static utils.BankValidationRules.validateBalance;

import custom_exceptions.AccountHandlingException;

public class BankAccountCRUD {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			// create empty map to store acct details : O(1)
			HashMap<Integer, BankAccount> accts = new HashMap<>();

			boolean exit = false;

			while (!exit) {

				System.out.println("Options\n1.Open A/C\n2.View A/C summary\n3.Funds Transfer\n4.Close A/c\n10.Exit");

				try {

					switch (sc.nextInt()) {
					case 1:
						// create A/C
						System.out.println("Enter a/c details acctNo, customerName, acctType, balance, createdOn");
						// either use containsKey or putIfAbsent
						int acctNo = sc.nextInt();
						if (accts.containsKey(acctNo)) {
							throw new AccountHandlingException("Duplicate A/C no");
						}
						// duplicate not detected
						System.out.println(accts.put(acctNo,
								new BankAccount(acctNo, sc.next(), AcType.valueOf(sc.next().toUpperCase()),
										validateBalance(sc.nextDouble()), LocalDate.parse(sc.next()))));
						System.out.println("A/C created");
						break;
					case 2:

						break;
					case 3:

						break;
					case 4:

						break;

					default:
						break;
					}

				} catch (Exception e) {
					e.printStackTrace();
				}
				sc.nextLine();

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
