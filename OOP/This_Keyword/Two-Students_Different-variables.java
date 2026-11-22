class Student{

	int id;
	String name;
	int age;

	Student(int a,String b,int c){

		id=a;
		name=b;
		age=c;
	}
	void fun(){

		System.out.println(id+","+name+","+age);
	}
}
class Demo{

	public static void main(String[]args){

		Student s1=new Student(1,"varad",20);
		Student s2=new Student(2,"yash",30);

		s1.fun();
		s2.fun();
	}
}		