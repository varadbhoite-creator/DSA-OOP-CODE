class BankAccount{

	private int balance;

	BankAccount(int balance){

		this.balance=balance;
	}
	
	void deposite(int amount){

		balance=balance+amount;
	}

	int getBalance(){

		return balance;
	}
}
class Demo{

	public static void main(String[]args){

		BankAccount b=new BankAccount(10000);
		b.deposite(5000);

		System.out.println(b.getBalance());
	}
}