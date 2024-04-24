package application;

import java.util.Locale;
import java.util.Scanner;

import services.BrasilInterestService;
import services.InterestService;
import services.UsaInterestService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		System.out.println("Amount: ");
		double amount = sc.nextDouble();
		System.out.println("Months: ");
		int months = sc.nextInt();

		InterestService is = new UsaInterestService(1.0);
		InterestService iss = new BrasilInterestService(2.0);
		double payment = is.payment(amount, months);
		double payment2 = iss.payment(amount, months);

		System.out.println("Payment after" + months + "months");
		System.out.printf("%.2f", payment);
		System.out.println();
		System.out.println("Payment after" + months + "months");
		System.out.printf("%.2f", payment2);
		sc.close();
	}

}
