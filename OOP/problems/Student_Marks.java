class Student{

	private String name;
	private int marks;
	
	Student(String name,int marks){

		this.name=name;
		this.marks=marks;
	}
	void display(){

		System.out.println("name :"+name+","+"marks :"+marks);
	}
	void updatename(String name){

		this.name=name;
	}
	void updatemarks(int marks){

		this.marks=marks;
	}
}
class Demo{
	
	public static void main(String[]args){

		Student s=new Student("varad",78);
		s.display();

		s.updatename("yash");
		s.updatemarks(88);

		s.display();
	}
}