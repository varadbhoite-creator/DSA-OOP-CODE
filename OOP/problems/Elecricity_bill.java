class Bill{

	private String consumername;
	private int units;
	
	Bill(String consumername,int units){

		this.consumername=consumername;
		this.units=units;
	}
	void display(){

		System.out.println(consumername);
		System.out.println(units);
	}
	void bill(int charges){

		int bill=units*charges;
		System.out.println(bill);
	}
	void updatename(String consumername){

		this.consumername=consumername;
	}
	void updateunits(int units){

		this.units=units;
	}
}
class Demo{

	public static void main(String[]args){

		Bill b=new Bill("varad",250);
		b.display();
		b.bill(5);
	}
}