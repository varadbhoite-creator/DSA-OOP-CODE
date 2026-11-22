class Person{

	String name;
	
	Person(String name){

		this.name=name;
	}
	
	void display(){

		System.out.println(name);
	}
}
class Student extends Person{

	int rollno;

	Student(String name,int rollno){
	
		super(name);
		this.rollno=rollno;
	}

	void display(){

		System.out.println(name);
		System.out.println(rollno);
	}
}
class Demo{

	public static void main(String[]args){

		Person p1=new Student("varad",101);
		p1.display();

		Person p=new Person("yash");
		p.display();
	}
}