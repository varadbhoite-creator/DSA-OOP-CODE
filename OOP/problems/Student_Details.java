class Student{

	String name="rahul";
	int age=20;
	int marks=85;

	void display(){

		System.out.println("name :"+name);
		System.out.println("age :"+age);
		System.out.println("marks :"+marks);
	}
}
class Demo{

	public static void main(String[]args){

		Student s=new Student();
		s.display();
	}
}