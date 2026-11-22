//Parameter Constructor || Argument Constructor!

class Student{

	int a;

	Student(int b){

		a=b;
		System.out.println(a);
	}
}
class Demo{

	public static void main(String[]args){

		Student s=new Student(10);
	}
}