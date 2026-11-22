class Employee{

	private final int id;
	private String name;
	private static int count;

	Employee(int id,String name){

		this.id=id;
		this.name=name;
		count++;
	}

	void setname(String name){

		this.name=name;
	}

	int getid(){					

		return id;
	}
	String getname(){

		return name;
	}
	static int getcount(){

		return count;
	}
}
class Demo{

	public static void main(String[]args){

		Employee e1=new Employee(101,"varad");

		System.out.println(e1.getid());
		System.out.println(e1.getname());

		Employee e2=new Employee(102,"sanika");
		e2.setname("bhoite");
		System.out.println(e2.getid());
		System.out.println(e2.getname());

		Employee e3=new Employee(103,"yash");
	
		System.out.println(e3.getid());
		System.out.println(e3.getname());

		System.out.println(Employee.getcount());

	}
}