class Employee{

	private String name;
	private int salary;

	Employee(String name,int salary){

		this.name=name;
		this.salary=salary;
	}
	
	String getName(){

		return name;
	}

	int getSalary(){
	
		return salary;
	}

	void Display(){

		System.out.println(name);
		System.out.println(salary);
	}
}
class Devloper extends Employee{

	private String language;

	Devloper(String name,int salary,String language){

		super(name,salary);
		this.language=language;
	}

	String getLanguage(){

		return language;
	}

	void Display(Devloper d){

		System.out.println(d.getName());
		System.out.println(d.getSalary());
		System.out.println(language);
	}

}
class Demo{

	public static void main(String[]args){

		Devloper d=new Devloper("varad",50000,"java");
		d.Display(d);

	}
}