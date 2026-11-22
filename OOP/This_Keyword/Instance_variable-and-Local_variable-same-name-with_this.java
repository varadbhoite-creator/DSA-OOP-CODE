class Student{

	int a;

	Student(int a){

		this.a=a;
	}
	void fun(){

		System.out.println(a);
	}
}
class Demo{

	public static void main(String[]args){

		Student s=new Student(10);
		s.fun();
	}
}		