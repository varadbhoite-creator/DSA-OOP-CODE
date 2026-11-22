class BankAccount{

	private String accountHolder;
	private double balance;

	BankAccount(String accountHolder,double balance){

		this.accountHolder=accountHolder;
		this.balance=balance;
	}

	void setAccountHolder(String accountHolder){

		this.accountHolder=accountHolder;
	}
		
	void setBalance(double balance){

		this.balance=balance;
	}

	String getAccountHolder(){

		return accountHolder;
	}
	
	double getBalance(){

		return balance;
	}

	void deposite(double amount){

		balance=balance+amount;
	}
	
	void withdrawl(double amount){

		if(amount>balance){

			System.out.println("insufficient");
		}else{

			balance=balance-amount;
		}
	}
}
class Demo{

	public static void main(String[]args){

		BankAccount b1=new BankAccount("varad",5000);
		BankAccount b2=new BankAccount("yash",10000);

		b1.deposite(5000);
		b1.withdrawl(10000);
		System.out.println(b1.getBalance());

		b2.deposite(5000);
		b2.withdrawl(10000);
		System.out.println(b2.getBalance());
	}
}