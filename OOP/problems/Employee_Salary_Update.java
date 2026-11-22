class Employee{

	private String name;
	private int salary;

	Employee(String name,int salary){

		this.name=name;
		this.salary=salary;
	}
	void setsalary(int salary){

		this.salary=salary;
	}
	void increasesalary(int percent){

		int increase=(salary*percent)/100;
		salary=salary+increase;
	}
	void displaysalary(){

		System.out.println(salary);
	}
}
class Demo{

	public static void main(String[]args){

		Employee e=new Employee("varad",40000);
		e.displaysalary();

		e.increasesalary(20);
		e.displaysalary();

		e.setsalary(10000);
		e.increasesalary(10);
		e.displaysalary();
		
	}
}