class Employee{

	static String Company="Google";
	private String name;
	private int id;
	static int count;

	Employee(String name,int id){

		this.name=name;
		this.id=id;
		count++;
	}

	void setname(String name){

		this.name=name;
	}

	void setid(int id){

		this.id=id;
	}

	String getname(){

		return name;
	}

	int getid(){

		return id;
	}
}
class Demo{

	public static void main(String[]args){

		Employee e=new Employee("varad",101);
		Employee e1=new Employee("yash",101);

		System.out.println(Employee.Company+","+e.getname()+","+e.getid());
		System.out.println(Employee.Company+","+e1.getname()+","+e1.getid());
		System.out.println(Employee.count);

	}
}