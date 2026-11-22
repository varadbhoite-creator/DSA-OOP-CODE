class Bank{

	private String accountholder;
	private int balance;

	Bank(String accountholder,int balance){

		this.accountholder=accountholder;
		this.balance=balance;
	}

	void setaccountHolder(String accountholder){

		this.accountholder=accountholder;
	}

	void setbalance(int balance){

		this.balance=balance;
	}

	String getaccountholder(){

		return accountholder;
	}

	int getbalance(){

		return balance;
	}
}
class Demo{

	public static void main(String[]args){

		Bank b=new Bank("varad",5000);
		System.out.println(b.getaccountholder());
		System.out.println(b.getbalance());

		b.setbalance(10000);
		System.out.println(b.getaccountholder());
		System.out.println(b.getbalance());

	}
}