class Student{

	int a;

	Student(int b){
	
		a=b;
		System.out.println(a);
	}
}
class Demo{
	
	public static void main(String[]args){

		Student s=new Student(20);
		System.out.println(s.a);
		Student s1=new Student(30);
		System.out.println(s1.a );
	}
}