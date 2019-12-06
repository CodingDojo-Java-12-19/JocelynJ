
public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount newBank = new BankAccount();
		BankAccount secondAccount = new BankAccount();
		System.out.println(newBank.userAccountNum());
		newBank.getCheckingBal();
		newBank.getSavingsBal();
		newBank.depositToAccount("checking", 1000.50);
		newBank.getCheckingBal();
		newBank.depositToAccount("savings", 5000.75);
		newBank.withdrawFromAccount("savings", 1000.00);
		secondAccount.withdrawFromAccount("checking", 50.00);
		
		newBank.totalBalance();
		secondAccount.totalBalance();
	}

}
