class Student{

	
	void fun(College c){

		System.out.println(c.a);
	}
}
class College{

	int a=10;
}
class Demo{

	public static void main(String[]args){

		College c=new College();
		Student s= new Student();
		s.fun(c);
	}
}