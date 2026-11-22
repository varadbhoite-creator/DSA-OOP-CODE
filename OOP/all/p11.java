class Employee{

	private static String company;
	private final int id;
	private String name;

	Employee(String Company,int id,String name){

		this.company=company;
		this.id=id;
		this.name=name;
	
	}

	static String getcompany(){

		return company;
	}
	int getid(){

		return id;
	}
	String getname(){

		return name;
	}
}
class Manager extends Employee{

	private int teamsize;

	Manager(String company,int id,String name,int teamsize){

		super(company,id,name);
		this.teamsize=teamsize;
	}

	int getteamsize(){

		return teamsize;
	}
}
class Demo{

	public static void main(String[]args){

		Manager m=new Manager("Google",101,"varad",5);
		System.out.println(Manager.getcompany());
		System.out.println(m.getname());
		System.out.println(m.getid());
		System.out.println(m.getteamsize());
	}
}