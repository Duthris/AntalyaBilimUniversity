package business.abstracts;

import entities.concretes.BankAccount;

public interface BankingService {
	void deposit(BankAccount userAccount, int amount);
	void withdraw(BankAccount userAccount, int amount);
	void getPreviousTransaction(BankAccount userAccount);
	void showMenu(BankAccount userAccount);
}
