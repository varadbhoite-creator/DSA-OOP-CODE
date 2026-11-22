class Student{

	private int a;

	private Student(int a){

		this.a=a;
	}

	private void display(){

		System.out.println(a);
	}

	void update(int a){

		this.a=a;
	}

	void methodcall(){

		display();
	}
}
class Demo{

	public static void main(String[]args){

		Student s=new Student(10);
		s.methodcall();
	
		s.update(20);
		s.methodcall();	
	}
}