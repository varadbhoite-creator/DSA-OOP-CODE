class Student{

	String name;
	int age;

	void info(){

		System.out.println(name);
		System.out.println(age);
	}
}
class Demo{

	public static void main(String[]args){

		Student s=new Student();
		s.info();

		Student s1=new Student();
		s1.name="varad";
		s1.age=10;

		Student s2=new Student();
		s2.name="yash";
		s2.age=20;
		
		Student s3=new Student();
		s3.name="abcd";
		s3.age=30;

		s1.info();
		s2.info();
		s3.info();
	}
}