class Student{

	int a;
	int b=20;

	Student(){

		a=10;
		System.out.println(a);
		System.out.println(b);

	}
	void fun(){

		System.out.println(a);
		System.out.println(b);

	}
}
class Demo{

	public static void main(String[]args){

		Student s=new Student();
		s.fun();
	}
}
