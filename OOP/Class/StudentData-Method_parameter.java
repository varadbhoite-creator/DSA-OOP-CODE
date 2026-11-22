class Student{

	String name;
	int age;

	void info(int phn){

		System.out.println(name);
		System.out.println(age);
		System.out.println(phn);
	}
}
class Demo{

	public static void main(String[]args){

		Student s=new Student();
		s.info(1);

		Student s1=new Student();
		s1.name="varad";
		s1.age=10;

		Student s2=new Student();
		s2.name="yash";
		s2.age=20;
		
		Student s3=new Student();
		s3.name="abcd";
		s3.age=30;

		s1.info(123456);
		s2.info(987654);
		s3.info(159753);
	}
}