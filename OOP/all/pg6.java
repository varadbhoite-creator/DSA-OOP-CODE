class Student{

	String name;
	int marks;
	
	Student(){

		this.name="unknown";
		this.marks=0;
	}

	Student(String name,int marks){

		this.name=name;
		this.marks=marks;
	}

	void displaydetails(){

		System.out.println(name);
		System.out.println(marks);
	}
}
class Demo{

	public static void main(String[]args){

		Student s1=new Student();
		Student s2=new Student("varad",90);

		s1.displaydetails();
		s2.displaydetails();
	}
}