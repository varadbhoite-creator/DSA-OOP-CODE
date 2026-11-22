class Employee{

	private int id;
	private String name;
	private int salary;
	private String department;
	int income;

	Employee(int id,String name,int salary,String department){

		this.id=id;
		this.name=name;
		this.salary=salary;
		this.department=department;
	}
	void details(){

		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(department);
	}
	void annualincome(){

		income=salary*12;

	}
	void salary(){

		salary=income;
	}
}
class Demo{

	public static void main(String[]args){

		Employee e=new Employee(101,"varad",45000,"IT");
		e.annualincome();
		e.salary();
		e.details();
	}
}