class Student{

	int a;
	
	Student(int b){

		this.a=b;
	}

	void fun(){

		System.out.println(this.a);
	}
}
class Demo{

	public static void main(String[]args){

		Student s=new Student(10);
		Student s1=new Student(20);

		s.fun();
		s1.fun();
	}
}