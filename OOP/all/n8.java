class Employee{

	String name;
	static String companyName;

	Employee(String name){

		this.name=name;
	}
	
	static void changeName(String companyname){

		companyName=companyname;
	}
	
	void display(){

		System.out.println(name);
		System.out.println(companyName);
	}
}
class Demo{

	public static void main(String[]args){

		Employee e1=new Employee("varad");
		Employee e2=new Employee("yash");
		Employee e3=new Employee("abhi");

		Employee.changeName("TCS");

		e1.display();
		e2.display();
		e3.display();
	}
}