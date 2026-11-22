class Person{

	String name;
	
	Person(String name){

		this.name=name;
	}

	void displayName(){

		System.out.println(name);
	}
}
class Student extends Person{

	int rollNo;
	
	Student(int rollNo,String name){

		super(name);
		this.rollNo=rollNo;
	}

	void displayName(){

		System.out.println(name);
		System.out.println(rollNo);
	}
}
class Demo{

	public static void main(String[]args){

		Student s=new Student(101,"varad");
		s.displayName();
	}
}