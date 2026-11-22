class Customer{

	private String name;
	private int age;
	BankAccount b; 

	Customer(String name,int age,BankAccount b){

		this.name=name;
		this.age=age;
		this.b=b;
	}
	void setname(String name){

		this.name=name;
	}
	void setage(int age){

		this.age=age;
	}
	void setBankAccount(BankAccount b){

		this.b=b;
	}
	String getname(){

		return name;
	}
	int getage(){

		return age;
	}
	BankAccount getBankAccount(){

		return b;
	}
}	
class BankAccount{

	private int balance;
	
	BankAccount(int balance){

		this.balance=balance;
	}
	void setbalance(int balance){

		this.balance=balance;
	}
	int getbalance(){

		return balance;
	}
}
class Demo{

	public static void main(String[]args){

		BankAccount b=new BankAccount(20000);
		Customer c=new Customer("varad",30,b);

		System.out.println(c.getname());
		System.out.println(c.getage());
		System.out.println(c.getBankAccount().getbalance());
	}
}