package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		
		
		System.out.print("Is there na initial deposit(y/n)? ");
		char question = sc.next().charAt(0);
		
		if(question == 'y') {
			System.out.print("Enter initial deposit value: ");
			double inicialDeposit = sc.nextDouble();
			account = new Account(number, holder, inicialDeposit);
			
		}else{
			account = new Account(number, holder);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(account);		
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposite(depositValue);
		
		System.out.println("Update account data:");
		System.out.println(account);
		
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		
		System.out.println("Update account data:");
		System.out.println(account);
		
		System.out.println("Fim");
		
		sc.close();
	}
}
