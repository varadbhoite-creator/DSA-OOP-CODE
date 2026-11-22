class BankAccount{

	int accountNumber;
	String holderName;
	int balance;

	BankAccount(int accountNumber,String holderName,int balance){

		 this.accountNumber=accountNumber;
		 this.holderName=holderName;
		 this.balance=balance;
	
	}
	void accountDetails(){

		System.out.println("accountNumber :"+accountNumber);
		System.out.println("holderName :"+holderName);
		System.out.println("balance :"+balance);
	}
}
class Demo{

	public static void main(String[]args){

		BankAccount b=new BankAccount(101,"rohit",25000);
		b.accountDetails();
	}
}