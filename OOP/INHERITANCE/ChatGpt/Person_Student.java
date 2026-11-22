class Person{

	private String name;
	private int age;
	
	Person(String name,int age){

		this.name=name;
		this.age=age;
	}
	String getName(){

		return name;
	}
	int getAge(){

		return age;
	}
}
class Student extends Person{

	private int rollNo;
	private int marks;
	
	Student(String name,int age,int rollNo,int marks){

		super(name,age);
		this.rollNo=rollNo;
		this.marks=marks;
	}
	int getrollNo(){

		return rollNo;
	}
	int getmarks(){

		return marks;
	}
}
class Demo{

	public static void main(String[]args){

		Student s=new Student("Rahul",20,101,85);
		System.out.println(s.getName());
		System.out.println(s.getAge());
		System.out.println(s.getrollNo());
		System.out.println(s.getmarks());
	}
}