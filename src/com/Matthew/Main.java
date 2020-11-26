package com.Matthew;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	long principal;
    	float annualIntRate;
    	int period;

	Scanner scanner = new Scanner(System.in);
	System.out.print("Principal: ");
	principal = scanner.nextLong();

		scanner = new Scanner(System.in);
		System.out.print("Interest Rate: ");
		annualIntRate = scanner.nextFloat();

		scanner = new Scanner(System.in);
		System.out.print("Period: ");
		period = scanner.nextInt();

		float interest = annualIntRate /100/12;
		period = period *12;

		double monthlyMortgage = principal * (interest * Math.pow(1 + interest, period)/(Math.pow(1 + interest, period) -1));

		String mortgageFormatted = NumberFormat.getCurrencyInstance().format(monthlyMortgage);
		System.out.println("Mortgage: " + mortgageFormatted);

    }
}
