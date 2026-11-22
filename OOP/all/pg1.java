class Student{

	String name;
	int rollno;
	double marks;

	Student(String name,int rollno,double marks){

		this.name=name;
		this.rollno=rollno;
		this.marks=marks;
	}

	void displaydetails(){

		System.out.println(name);
		System.out.println(rollno);
		System.out.println(marks);
	}
}
class Demo{

	public static void main(String[]args){

		Student s1=new Student("varad",101,43.3);	
		Student s2=new Student("rahul",102,90.99);

		s1.displaydetails();
		s2.displaydetails();
	}
}