class Payment{

	void pay(int amount){

		System.out.println(amount);
	}
}
class UPIPayment extends Payment{

	void pay(int amount){

		System.out.println(amount);
	}

	void pay(int amount,String upiid){

		System.out.println(amount);
		System.out.println(upiid);
	}
}
class Demo{

	public static void main(String[]args){

		Payment p=new UPIPayment();
		p.pay(500);
		UPIPayment u=new UPIPayment();
		u.pay(1000,"varad@oksbi");
	}
}