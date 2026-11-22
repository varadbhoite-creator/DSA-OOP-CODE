class Student{

	private int a;

	Student(int a){

		this.a=a;
	}
	void fun(){

		System.out.println(a);
	}
	void update(int a){

		this.a=a;
	}
}
class Demo{

	public static void main(String[]args){

		Student s=new Student(10);
		s.fun();

		s.update(20);
		s.fun();

	}
}