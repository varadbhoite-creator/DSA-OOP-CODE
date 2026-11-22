class BankAccount{

	private int balance;

	BankAccount(int balance){
	
		this.balance=balance;
	}
	void balance(){

		System.out.println(balance);
	}
	void deposite(int deposite){

		this.balance=this.balance+deposite;
	}
	void withdraw(int withdraw){

		balance=balance-withdraw;
	}
	void updatebalance(int balance){

		this.balance=balance;
	}
}
class Demo{

	public static void main(String[]args){

		BankAccount b=new BankAccount(10000);
		b.deposite(5000);
		b.withdraw(3000);

		b.balance();

		b.updatebalance(20000);
		b.deposite(10000);
		b.withdraw(5000);

		b.balance();
	}
}