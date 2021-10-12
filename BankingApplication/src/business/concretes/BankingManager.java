package business.concretes;

import java.util.Scanner;

import business.abstracts.BankingService;
import entities.concretes.BankAccount;

public class BankingManager implements BankingService {

	@Override
	public void deposit(BankAccount userAccount, int amount) {
		
		if (amount != 0) {
			
			userAccount.setBalance(userAccount.getBalance() + amount);
			userAccount.setPreviousTransaction(amount);
			
		}
		
	}

	@Override
	public void withdraw(BankAccount userAccount, int amount) {
		
		if (amount != 0) {
			userAccount.setBalance(userAccount.getBalance() - amount);
			userAccount.setPreviousTransaction(-amount);
		}
			
		
	}

	@Override
	public void getPreviousTransaction(BankAccount userAccount) {
		
		if (userAccount.getPreviousTransaction() > 0) {
			System.out.println("\nDeposited: " + userAccount.getPreviousTransaction());
		}
		
		else if (userAccount.getPreviousTransaction() < 0) {
			System.out.println("\nWithdrawn: " + Math.abs(userAccount.getPreviousTransaction()));
		}
		
		else {
			System.out.println("\nNo transaction occured!\n");
		}
	}

	@Override
	public void showMenu(BankAccount userAccount) {
		
		char option = '\0';
		Scanner scn = new Scanner(System.in);
		
		System.out.println("------------------------------------\nWelcome " + userAccount.getCustomerName());
		System.out.println("Your Customer ID is " + userAccount.getCustomerId() + "\n------------------------------------\n");
		System.out.println("------------------------------------\nATM OPTIONS:");
		System.out.println("A: Check Balance");
		System.out.println("B: Deposit");
		System.out.println("C: Withdraw");
		System.out.println("D: Previous Transaction");
		System.out.println("E: Exit \n------------------------------------");
		
		
		do {
			
			System.out.print("\nChoose an option to continue: ");
			option = scn.next().charAt(0);
			System.out.print("\n");
			
			switch (option) {
			
			case 'A':
				System.out.println("------------------------------------");
				System.out.println("Balance: " + userAccount.getBalance());
				System.out.println("------------------------------------");
				
				break;
				
			case 'B':
				System.out.println("------------------------------------");
				System.out.print("\nEnter the amount to deposit: ");
				int amount = scn.nextInt();
				deposit(userAccount, amount);
				System.out.println("\n------------------------------------");
				
				break;
				
			case 'C':
				System.out.println("------------------------------------");
				System.out.print("\nEnter the amount to withdraw: ");
				int amount1 = scn.nextInt();
				withdraw(userAccount, amount1);
				System.out.println("\n------------------------------------");
				
				break;
				
			case 'D':
				System.out.println("------------------------------------");
				getPreviousTransaction(userAccount);
				System.out.println("\n------------------------------------");
				
				break;
			
			default:
				
				if (option != 'E')
				{
					System.out.println("\nInvalid Option! Please choose a correct option!\n");
					break;
				}

			}
			
			
		} while (option != 'E');
		
		System.out.println("\nThanks for using our bank. Have a nice day!\n");
		
	}

}
