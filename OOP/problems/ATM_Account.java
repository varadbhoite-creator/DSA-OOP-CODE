class Atm{

	private int pin;
	private int balance;

	Atm(int pin,int balance){

		this.pin=pin;
		this.balance=balance;
	}
	void pin(int pin){

		if(this.pin==pin){

			System.out.println("pin correct");
		}
	}
	void deposite(int deposite){

		balance=balance+deposite;
	}
	void withdrawl(int withdrawl){

		balance=balance-withdrawl;
		System.out.println("withdrawl Successful");
	}
	void balance(){

		System.out.println(balance);
	}
	void updatebalance(int balance){

		this.balance=balance;
	}
	void updatepin(){

		this.pin=pin;
	}
}
class Demo{

	public static void main(String[]args){

		Atm a=new Atm(1234,20000);
		a.pin(1234);
		a.withdrawl(5000);
		a.balance();		

		a.deposite(2000);
		a.balance();
	}
}