package homework0824_acoount;

public class Account {
	
	private String accountNumber;
	private String name;
	private String password;
	private long balance;
	
	public Account(String accountNumber, String name, String password, long balance) {
		//super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.password = password;
		this.balance = balance;
	}
	
	public void deposit(int money) {
		balance +=money;
	}	
	public void widthdraw(int money) {
		balance -=money;
	}
	public Long getBalance() {
		return balance;		
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void printAccount() {
		System.out.printf("accountNumber : %s%n",accountNumber);
		System.out.printf("name : %s%n",name );
		System.out.printf("password : %s%n",password );
		System.out.printf("balance : %s%n",balance );
		
	}

}
