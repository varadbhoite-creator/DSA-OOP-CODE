class Employee{

	String name;
	int salary;

	Employee(String name,int salary){

		this.name=name;
		this.salary=salary;
	}
	void display(){

		System.out.println("name :"+name);
		System.out.println("salary :"+salary);
	}
}
class Demo{

	public static void main(String[]args){

		Employee e=new Employee("amit",45000);
		e.display();
	}
}