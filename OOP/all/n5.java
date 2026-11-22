class Employee{

	String name;
	double salary;

	Employee(String name,double salary){

		this.name=name;
		this.salary=salary;
	}

	void displayEmployee(){

		System.out.println(name);
		System.out.println(salary);
	}
}
class Manager extends Employee{

	String department;

	Manager(String name,double salary,String department){

		super(name,salary);
		this.department=department;
	}

	void displayManager(){

		System.out.println(name);
		System.out.println(salary);
		System.out.println(department);
	}
}
class Demo{

	public static void main(String[]args){

		Manager m1=new Manager("varad",1000,"it");
		Manager m2=new Manager("yash",2000,"cse");
		
		m1.displayManager();
		m2.displayManager();
	}
}