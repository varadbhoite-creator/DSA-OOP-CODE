class BankAccount{

	private int accountno;
	private String name;
	private int balance;

	BankAccount(int accountno,String name,int balance){

		this.accountno=accountno;
		this.name=name;
		this.balance=balance;
	}
	void deposite(int deposite){

		balance=balance+deposite;
	}
	void withdrawl(int withdrawl){

		if(withdrawl>balance){

			System.out.println("low account balance");
		}else{
			
			balance=balance-withdrawl;
		}
	}
	void display(){

		System.out.println(balance);
	}
}
class Demo{

	public static void main(String[]args){

		BankAccount b=new BankAccount(101,"varad",10000);
		b.withdrawl(12000);
		b.display();
	}
}