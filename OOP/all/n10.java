class Bank{

	final int IFSC_CODE;

	Bank(int IFSC_CODE){

		this.IFSC_CODE=IFSC_CODE;
	}

	final void displayBank(){

		System.out.println(IFSC_CODE);
	}
}
final class BankDetails extends Bank{

	BankDetails(int IFSC_CODE){

		super(IFSC_CODE);
	}
	
	void displayBankDetails(){

		super.displayBank();
	}
}
class Demo{

	public static void main(String[]args){

		BankDetails b1=new BankDetails(1234);
		b1.displayBank();
		b1.displayBankDetails();
	}
}