class BankAccount{

	String accountholder;
	double accountNumber;
	double balance;

	BankAccount(String accountholder,double accountNumber,double balance){

		this.accountholder=accountholder;
		this. accountNumber= accountNumber;
		this.balance=balance;
	}

	void deposite(double amount){

		balance=balance+amount;
	}
	
	void withdraw(double amount){

		balance=balance-amount;
	}
	
	void displayBalance(){

		System.out.println(balance);
	}
}
class Demo{

	public static void main(String[]args){

		BankAccount b1=new BankAccount("varad",101,1000);
		BankAccount b2=new BankAccount("yash",102,2000);

		b1.deposite(500);
		b1.withdraw(200);
		b1.displayBalance();

		b2.deposite(1000);
		b2.withdraw(500);
		b2.displayBalance();		
	}
}