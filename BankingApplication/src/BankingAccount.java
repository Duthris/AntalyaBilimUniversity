import business.concretes.BankingManager;
import entities.concretes.BankAccount;

public class BankingAccount {

	public static void main(String[] args) {
		
		BankAccount customerAccount1 = new BankAccount("Anýl", "CSTMR1IDTEST123");
		
		BankingManager bankingManager = new BankingManager();
		bankingManager.showMenu(customerAccount1);

	}

}
