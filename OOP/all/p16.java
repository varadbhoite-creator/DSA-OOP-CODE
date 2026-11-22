class Student{
	
	String name;
	int rollno;
	int marks;
	
	Student(String name){

		this.name=name;
	}
	
	Student(String name,int rollno){

		this.name=name;
		this.rollno=rollno;
	}

	Student(String name,int rollno,int marks){

		this.name=name;
		this.rollno=rollno;
		this.marks=marks;
	}

	void display(){

		System.out.println(name);
	}

	void display(boolean showrollno){

		if(showrollno){

		System.out.println(name);
		System.out.println(rollno);

		}else{

			System.out.println(name);
		}
	}

	void display(int showmarks){

		System.out.println(name);
		System.out.println(rollno);
		System.out.println(marks);
	}
}
class Demo{

	public static void main(String[]args){

		Student s1=new Student("varad");
		Student s2=new Student("varad",101);
		Student s3=new Student("varad",102,85);
	
		s1.display();
		s2.display(true);
		s3.display(85);
	}
}