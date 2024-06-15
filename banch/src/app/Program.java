package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.print("Enter account number: ");
		int numberAccount = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holderAccount = sc.nextLine();
		
		System.out.println("Is there an initial deposit? (y/n) ");
		char response = sc.next().charAt(0);
		
		if(response == 'y') {
			System.out.print("Enter a initial value for deposit: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(numberAccount, holderAccount, initialDeposit);
		} else {
			account = new Account(numberAccount, holderAccount);
		}
		
		System.out.println("\nAccount data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		account.deposit(withdraw);
		
		System.out.println(account);
	}
}
