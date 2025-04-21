package assignments;

import java.util.ArrayList;
import java.util.List;

public class Assignment8_ConditionalStatementsLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> transaction = new ArrayList<Integer>();

		transaction.add(50000);
		transaction.add(-2000);
		transaction.add(3000);
		transaction.add(-15000);
		transaction.add(-200);
		transaction.add(-300);
		transaction.add(4000);
		transaction.add(-3000);

		// 1. Print total number of credit and debit transactions completed
		int creditcount = 0;
		int debitcount = 0;

		for (int i = 0; i < transaction.size(); i++) {
			if (transaction.get(i) > 0) {
				creditcount = creditcount + 1;
			} else {
				debitcount = debitcount + 1;

			}

		}
		System.out.println("total number of credit transactions " + creditcount
				+ "\n total number of debit transactions is " + debitcount);
		// 2. Print the total amount credited and debited in account
		int crediteAmount = 0;
		int debitedAmount = 0;
		for (int i = 0; i < transaction.size(); i++) {
			if (transaction.get(i) > 0) {
				crediteAmount = crediteAmount + transaction.get(i);

			} else {
				debitedAmount = debitedAmount + transaction.get(i);

			}

		}
		int debitedAmountfin = Math.abs(debitedAmount);
		System.out.println("the total amount credited in account " + crediteAmount
				+ "\n the total amount debited in account is " + debitedAmountfin);

		// Print total amount remaining at the end in Bank Account
		int balance = 0;
		for (int i = 0; i < transaction.size(); i++) {
			balance = balance + transaction.get(i);
		}
		System.out.println("total amount remaining in Bank Account is " + balance);

		/*
		 * 4. If any transaction limit exceeds +/- 10000 then print the message
		 * “Suspicious credit/ debit Transaction with Amount” and also print total
		 * number of suspicious transactions
		 */
		int Suspicious = 0;
		for (int i = 0; i < transaction.size(); i++) {
			if (transaction.get(i) > 10000) {
				Suspicious++;
				System.out.println("Suspicious credit" + transaction.get(i));
			} else if (transaction.get(i) < -10000) {
				Suspicious++;
				System.out.println("Suspicious debit" + transaction.get(i));
			}

		}
		System.out.println("total number of suspicious transactions are " + Suspicious);
	}
}
