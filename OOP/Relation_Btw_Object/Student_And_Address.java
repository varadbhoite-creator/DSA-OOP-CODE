class Student{

	private String studentName;
	private Address a;
	
	Student(String studentName,Address a){

		this.studentName=studentName;
		this.a=a;
	}
	void setstudentName(String studentName){

		this.studentName=studentName;
	}
	void setAddress(Address a){

		this.a=a;
	}
	String getstudentName(){

		return studentName;
	}
	Address getAddress(){

		return a;
	}
}
class Address{

	private String city;
	private int pincode;

	Address(String city,int pincode){

		this.city=city;
		this.pincode=pincode;
	}
	void setcity(String city){

		this.city=city;
	}
	void setpincode(int pincode){

		this.pincode=pincode;
	}
	String getcity(){

		return city;
	}
	int getpincode(){

		return pincode;
	}
}
class Demo{

	public static void main(String[]args){

		Address a=new Address("Satara",415002);
		Student s=new Student("varad",a);
		Address ad=s.getAddress();
	
		System.out.println(s.getstudentName());
		System.out.println(ad.getcity());
		System.out.println(ad.getpincode());
	}
}