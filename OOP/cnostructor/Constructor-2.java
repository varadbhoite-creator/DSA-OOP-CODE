class Student{

	int a=10;

	Student(){

		System.out.println(a+a);
	}
}
class Demo{

	public static void main(String[]args){

		Student s=new Student();
		System.out.println(s.a);
		s.a=200;
		System.out.println(s.a);
	}
}