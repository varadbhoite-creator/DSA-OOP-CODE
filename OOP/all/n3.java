class Employee{

	int id;
	String name;
	double salary;

	Employee(int id,String name,double salary){
		
		this();
		this.id=id;
		this.name=name;
		this.salary=salary;
	}

	Employee(){

		System.out.println("this()");
	}

	void display(){

		System.out.println(this.id);
		System.out.println(this.name);
		System.out.println(this.salary);
	}

}
class Demo{

	public static void main(String[]args){

		Employee e1=new Employee(101,"yash",20000);
		Employee e2=new Employee(102,"yash",10000);

		e1.display();
		e2.display();
	}
}