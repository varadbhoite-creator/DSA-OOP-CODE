class Student{

	Student(){

		System.out.println("hello in const");
	}

	void show(){

		this.Student();
	}
}
class Demo{

	public static void main(String[]args){

		Student s=new Student();
		s.show();
	}
}