class Employee{

	static int count;
	
	Employee(){

		count++;
	}

	void displaycount(){

		System.out.println(count);
	}
}
class Demo{

	public static void main(String[]args){

		Employee e1=new Employee();
		Employee e2=new Employee();
		Employee e3=new Employee();

		e3.displaycount();	
	}
}