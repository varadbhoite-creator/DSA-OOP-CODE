class Employee{

	String name;
	int employeeId;
	int salary;

	Employee(String name,int employeeId,int salary){

		this.name=name;
		this.employeeId=employeeId;
		this.salary=salary;
	}

	void displayDetails(){

		System.out.println(name);
		System.out.println(employeeId);
		System.out.println(salary);
	}
}
class Demo{

	public static void main(String[]args){

		Employee e1=new Employee("varad",101,10000);
		Employee e2=new Employee("rahul",102,20000);
		Employee e3=new Employee("piyush",103,30000);

		e1.displayDetails();
		e2.displayDetails();
		e3.displayDetails();
	}
}