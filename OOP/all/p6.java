class Employee{

	final int id;
	String name;
	Employee(int id,String name){

		this.id=id;
		this.name=name;
	}

	final void displayId(){

		System.out.println(this.id);
	}

	void display(){

		System.out.println(name);
	}
}
class Manager extends Employee{

	Manager(int id,String name){

		super(id,name);
	}
	
	void display(){

		System.out.println(name);
	}
}
class Demo{

	public static void main(String[]args){

		Manager m=new Manager(101,"varad");

		m.display();
		m.displayId();
	}
}