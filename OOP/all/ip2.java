interface Payment{
	
	static int amount=500;
}
class UPIPayment implements Payment{

	
}
class Demo{

	public static void main(String[]args){

		UPIPayment p=new UPIPayment();
		System.out.println(p.amount);
	}
}