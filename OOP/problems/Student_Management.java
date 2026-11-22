class Student{

	private int rollNo;
	private String name;
	private int marks;

	static String college;
	static int studentCount;
	
	char grade;
		
	Student(int rollNo,String name,int marks){

		this.rollNo=rollNo;
		this.name=name;
		this.marks=marks;
		studentCount++;
	}
	void setrollNo(int rollNo){

		this.rollNo=rollNo;
	}
	void setName(String name){

		this.name=name;
	}
	void setMarks(int marks){

		this.marks=marks;
	}
	int getRollNo(){

		return rollNo;
	}
	String getName(){

		return name;
	}
	int getMarks(){

		return marks;
	}
	static void setCollege(String college){

		Student.college=college;
	}
	void displayDetails(){

		System.out.println(rollNo);
		System.out.println(name);
		System.out.println(marks);
		System.out.println(grade);
	}

	void calculateGrade(){

		if(marks>=85){
			grade='A';
		}else if(marks>=75){
			grade='B';
		}else{
			grade='C';
		}
	}
	static void displayCollege(){

		System.out.println(college);
		System.out.println(studentCount);
	}
}

class Demo{

	public static void main(String[]args){

		Student s=new Student(101,"Rahul",85);
		Student.setCollege("DBATU");
		s.calculateGrade();
		s.displayDetails();
		Student.displayCollege();


		System.out.println("-----");
		
		Student s1=new Student(102,"Varad",75);
		Student.setCollege("DBATU");
		s1.calculateGrade();
		s1.displayDetails();
		Student.displayCollege();

		System.out.println("-----");
		
		Student s2=new Student(103,"Yash",65);
		Student.setCollege("DBATU");
		s2.calculateGrade();
		s2.displayDetails();
		Student.displayCollege();

		System.out.println("-----");
		

		System.out.println("display details using getter method");

		Student s3=new Student(104,"Viraj",55);
		Student.setCollege("DBATU");
		s3.calculateGrade();
		System.out.println(s3.getRollNo());
		System.out.println(s3.getName());
		System.out.println(s3.getMarks());
		System.out.println(s3.grade);
		System.out.println(Student.college);
		System.out.println(Student.studentCount);
		
	}
}