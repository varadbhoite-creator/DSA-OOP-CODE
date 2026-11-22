class Student{

	int a;

	Student(int a){

		this.a=a;
	}	
	void fun(){

		College c=new College();
		System.out.println(c.name);
	}
}
class College{

	String name="varad";
}
class Demo{

	public static void main(String[]args){

		Student s=new Student(20);
		s.fun();
	}
}