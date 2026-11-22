class Mobile{

	private int mobileNo;
	private Sim s;
	
	Mobile(int mobileNo,Sim s){
		
		this.mobileNo=mobileNo;
		this.s=s;
	}
	void setmobileNo(int mobileNo){

		this.mobileNo=mobileNo;
	}
	void setSim(Sim s){

		this.s=s;
	}
	int getmobileNo(){

		return mobileNo;
	}
	Sim getSim(){

		return s;
	}
}
class Sim{

	private String networkProvider;
	
	Sim(String networkProvider){
	
		this.networkProvider=networkProvider;
	}
	void setnetworkProvider(String networkProvider){

		this.networkProvider=networkProvider;
	}
	String getnetworkProvider(){

		return  networkProvider;
	}
}
class Demo{

	public static void main(String[]args){

		Sim s=new Sim("jio");
		Mobile m=new Mobile(1234,s);
		Mobile m2=new Mobile(98765465,s);
		System.out.println(m.getmobileNo());
		System.out.println(m.getSim().getnetworkProvider());
		System.out.println(m2.getmobileNo());
		System.out.println(m2.getSim().getnetworkProvider());
		
		Sim s1=new Sim("vi");
		Mobile  m1=new Mobile(123456789,s1);
		System.out.println(m1.getmobileNo());
		System.out.println(m1.getSim().getnetworkProvider());
		m2.setSim(s1);
		System.out.println(m2.getmobileNo());
		System.out.println(m2.getSim().getnetworkProvider());
	}
}