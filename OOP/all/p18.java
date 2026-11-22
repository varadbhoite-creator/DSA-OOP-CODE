class BankAccount{

	static String bankName="SBI";
	final int accountNumber;
	String holderName;
	double balance;

	BankAccount(int accountNumber,String holderName,double balance){

		this.accountNumber=accountNumber;
		this.holderName=holderName;
		this.balance=balance;
	}

	void deposite(double amount){

		balance=balance+amount;
	}

	void display(){

		System.out.println(bankName);
		System.out.println(accountNumber);
		System.out.println(holderName);
		System.out.println(balance);
	}

	static void changeBankName(String bankName){
		
		BankAccount.bankName=bankName;		
	}

}
class Demo{

	public static void main(String[]args){

		BankAccount A1=new BankAccount(101,"varad",5000);

		BankAccount A2=new BankAccount(102,"rahul",3000);

		A1.deposite(1000);
		BankAccount.changeBankName("HDFC");
		A1.display();
		A2.display();
	}
}