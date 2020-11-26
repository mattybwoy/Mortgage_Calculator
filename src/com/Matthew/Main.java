package com.Matthew;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	long principal = 0;
    	float annualIntRate;
    	int period;

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("Principal (£1000 - £1M): ");
				principal = scanner.nextLong();
			if(principal >= 1000 && principal <= 1000000000)
				break;
			System.out.println("Please enter a number between 1,000 and 1,000,000");
		}


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
