class Student{

	String name;
	int age;

	Student(String a,int b){

		name=a;
		age=b;

		System.out.println(name);
		System.out.println(age);
	}
	
	void fun(String a,int b){

		name=a;
		age=b;
	
		System.out.println(name);
		System.out.println(age);
	
	}
}
class Demo{

	public static void main(String[]args){

		Student s=new Student("varad",10);
		s.fun("yash",100);

		Student s1=new Student("abcd",20);
		s1.fun("xyz",200);

	}
}	