class Student{

	String name;
	int age;

	Student(String a,int b){
	
		name=a;
		age=b;
	
		System.out.println(name);
		System.out.println(age);
	}
}
class Demo{

	public static void main(String[]args){

		Student s=new Student("varad",10);
		s.age=20;
		System.out.println(s.age);

		Student s1=new Student("yash",20);
		s1.age=30;
		System.out.println(s1.age);
	}
}