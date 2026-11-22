class Student{

	int a=10;
	
	void num(){

		System.out.println(a);
	}
}
class Demo{

	public static void main(String[]args){

		Student s=new Student();
		System.out.println(s.a);
		s.num();

		Student s1=new Student();
		System.out.println(s1.a);
		s1.a=100;
		s1.num();

		Student s2=new Student();
		System.out.println(s2.a);
		s2.a=200;
		s2.num();
	}
}