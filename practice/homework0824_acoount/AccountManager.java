package homework0824_acoount;

public class AccountManager {
	
	public static void main(String[] args) {
		Account myAccount1 = new Account("1111-1111", "ȫ�浿", "0001", 1000000L);
		Account myAccount2 = new Account("2222-2222", "ȫ�浿", "0002", 1000000L);
		Account myAccount3 = new Account("3333-3333", "ȫ�浿", "0003", 1000000L);
		Account myAccount4 = new Account("4444-4444", "ȫ�浿", "0004", 1000000L);
		Account myAccount5 = new Account("5555-5555", "ȫ�浿", "0005", 1000000L);
		
		myAccount1.deposit(1000000);
		myAccount1.widthdraw(5000);
		Long balance = myAccount1.getBalance();
		System.out.printf("balance is %d won %n", balance);
		
		myAccount1.setPassword("1111");
		myAccount1.printAccount();
		
	}

}
