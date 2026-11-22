class Student{

	College c;
	
	Student(College c){

		this.c=c;
	}
}
class College{

	static int a=20;
}
class Demo{

	public static void main(String[]args){

		College c=new College();
		Student s=new Student(c);

		System.out.println(s.c.a);
		c.a=30;
		System.out.println(s.c.a);
	}
}