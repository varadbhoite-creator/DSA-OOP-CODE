class Employee{

	private String name;
	private int salary;
	private int totalsalary;

	Employee(String name,int salary){

		this.name=name;
		this.salary=salary;
	}
	String getname(){

		return name;
	}
	int getsalary(){

		return salary;
	}
	void totalsalary(){

		totalsalary=salary*12;
	}
	int gettotalsalary(){

		return totalsalary;
	}
}
class Manager extends Employee{

	private String department;
	private int bonus;
	
	Manager(String name,int salary,String department,int bonus){

		super(name,salary);
		this.department=department;
		this.bonus=bonus;
	}
	String getdepartment(){

		return department;
	}
	int getbonus(){

		return bonus;
	}
}
class Demo{

	public static void main(String[]args){

		Manager m = new Manager("Amit",50000,"IT",10000);
		System.out.println(m.getname());
		System.out.println(m.getdepartment());
		System.out.println(m.getsalary());
		System.out.println(m.getbonus());
		m.totalsalary();
		System.out.println(m.gettotalsalary());
	}
}