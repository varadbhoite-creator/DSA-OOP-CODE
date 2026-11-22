class Employee{

	String name;
	int salary;
	int experience;
	
	Employee(String name,int salary,int experience){

		this.name=name;
		this.salary=salary;
		this.experience=experience;
	}
	void display(){

		if(this.experience>=3){

			int bonus=this.salary/10;
			System.out.println(bonus);
		}
	}
}
class Demo{

	public static void main(String[]args){

		Employee e=new Employee("raj",50000,4);
		e.display();
	}
}	