class Student{

	int a;

	private Student(int a){

		this.a=a;
	}
	void display(){

		System.out.println(this.a);
	}
}
class Demo{

	public static void main(String[]args){

		Student s=new Student(10);
		s.display();
	}
}