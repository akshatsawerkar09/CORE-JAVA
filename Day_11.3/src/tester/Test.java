package tester;

import java.text.SimpleDateFormat;
import java.util.Scanner;

import com.app.core.Emp;

public class Test {

	public static SimpleDateFormat sdf;

	static {
		sdf = new SimpleDateFormat("yyyy-MM-dd");
	}

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			System.out.println("Enter emp details : id, name, salary, joinDate(yr-mon-day)");

			Emp e1 = new Emp(sc.nextInt(), sc.next(), sc.nextDouble(), sdf.parse(sc.next()));

			System.out.println(e1);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
