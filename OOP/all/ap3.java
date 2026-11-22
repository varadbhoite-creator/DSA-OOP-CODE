abstract class Person{

	String name;

	Person(String name){

		this.name=name;
	}
}
class Student extends Person{

	Student(String name){

		super(name);
	}
}
class  Demo{

	public static void main(String[]args){

		Student s=new Student("varad");
		System.out.println(s.name);
	}
}